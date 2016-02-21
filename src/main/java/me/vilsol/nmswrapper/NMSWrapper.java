package me.vilsol.nmswrapper;

import me.vilsol.nmswrapper.reflections.Reflection;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveField;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.reflections.type.ReflectionClass;
import me.vilsol.nmswrapper.reflections.type.ReflectionField;
import me.vilsol.nmswrapper.reflections.type.ReflectionMethod;
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

    private HashMap<String, ReflectionClass> types = new HashMap<>();

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
                    if(!types.containsKey(aClass.getName())){
                        types.put(aClass.getName(), new ReflectionClass(aClass));
                    }

                    if (method.isAnnotationPresent(ReflectiveMethod.class)){
                        ReflectiveMethod m = method.getAnnotation(ReflectiveMethod.class);
                        Method nmsMethod = Reflection.getMethod(c.name(), m.name(), m.types(), c.craft());
                        types.get(aClass.getName()).add(method.getName(), new ReflectionMethod(nmsMethod));
                    }else if(method.isAnnotationPresent(ReflectiveField.class)){
                        ReflectiveField f = method.getAnnotation(ReflectiveField.class);
                        Field nmsField = Reflection.getField(c.name(), f.name(), c.craft());
                        types.get(aClass.getName()).add(method.getName(), new ReflectionField(nmsField));
                    }
                }
            }
        }
    }

    public Object exec(Object nms, Object ... params){
        StackTraceElement trace = Thread.currentThread().getStackTrace()[2];
        String clazz = trace.getClassName();

        try {
            if(types.containsKey(clazz)){
                return types.get(clazz).exec(nms, params);
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