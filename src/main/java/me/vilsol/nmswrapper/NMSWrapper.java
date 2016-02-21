package me.vilsol.nmswrapper;

import me.vilsol.nmswrapper.reflections.Reflection;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveField;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class NMSWrapper extends JavaPlugin {

    private static NMSWrapper instance;

    private HashMap<String, HashMap<String, Method>> methods = new HashMap<>();
    private HashMap<String, HashMap<String, Field>> fields = new HashMap<>();

    public static NMSWrapper getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        loadNMS();
    }

    private void loadNMS() {
        List<Class<?>> classes = getClassesFromPathInPlugin(this.getFile(), "me.vilsol.nmswrapper.wraps");
        for (Class<?> aClass : classes) {
            if(aClass.isAnnotationPresent(ReflectiveClass.class)) {
                ReflectiveClass c = aClass.getAnnotation(ReflectiveClass.class);
                for (Method method : aClass.getMethods()) {
                    if (method.isAnnotationPresent(ReflectiveMethod.class)){
                        if(!methods.containsKey(aClass.getName())){
                            methods.put(aClass.getName(), new HashMap<String, Method>());
                        }

                        ReflectiveMethod m = method.getAnnotation(ReflectiveMethod.class);
                        Method nmsMethod = Reflection.getMethod(c.name(), m.name(), m.types(), c.craft());
                        methods.get(aClass.getName()).put(method.getName(), nmsMethod);
                    }else if(method.isAnnotationPresent(ReflectiveField.class)){
                        if(!fields.containsKey(aClass.getName())){
                            fields.put(aClass.getName(), new HashMap<String, Field>());
                        }

                        ReflectiveField f = method.getAnnotation(ReflectiveField.class);
                        Field nmsField = Reflection.getField(c.name(), f.name(), c.craft());
                        fields.get(aClass.getName()).put(method.getName(), nmsField);
                    }
                }
            }
        }
    }

    public Object exec(Object nms, Object ... params){
        StackTraceElement trace = Thread.currentThread().getStackTrace()[2];
        String clazz = trace.getClassName();
        String method = trace.getMethodName();

        try {
            if(methods.containsKey(clazz)){
                if(methods.get(clazz).containsKey(method)){
                        return methods.get(clazz).get(method).invoke(nms, params);
                }
            }else if(fields.containsKey(clazz)){
                if(fields.get(clazz).containsKey(method)){
                    if(params.length > 0){
                        fields.get(clazz).get(method).set(nms, params[0]);
                    }else{
                        return fields.get(clazz).get(method).get(nms);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static List<Class<?>> getClassesFromPathInPlugin(File pluginFile, String packageName) {
        String path = packageName.replaceAll("\\.", File.separator);
        File plugin = pluginFile.getAbsoluteFile();

        List<Class<?>> classes = new ArrayList<>();

        try {
            JarInputStream is = new JarInputStream(new FileInputStream(plugin));
            JarEntry entry;
            while((entry = is.getNextJarEntry()) != null) {
                String name = entry.getName();
                if (name.endsWith(".class") && name.contains(path)) {
                    String classPath = name.substring(0, entry.getName().length() - 6);
                    classPath = classPath.replaceAll("[\\|/]", ".");
                    classes.add(Class.forName(classPath));
                }
            }
        } catch (Exception ignored) {
        }

        return classes;
    }

}