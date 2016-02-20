package me.vilsol.nmswrapper;

import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.Bukkit;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

    private static String version;
    private static String nms;
    private static String craft;

    static {
        version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
        nms = "net.minecraft.server." + version + ".";
        craft = "org.bukkit.craftbukkit." + version + ".";
    }

    public static Object newInstance(String name, Object[] paramTypes, Object[] params){
        return internalNewInstance(nms + name, paramTypes, params);
    }


    public static Object craftNewInstance(String name, Object[] paramTypes, Object[] params){
        return internalNewInstance(craft + name, paramTypes, params);
    }

    private static Object internalNewInstance(String name, Object[] paramTypes, Object[] params){
        try {
            Class<?> clazz = Class.forName(name);
            Constructor<?> constructor = clazz.getConstructor(paramTypes(paramTypes));

            for (int i = 0; i < params.length; i++) {
                if(params[i] instanceof NMSWrap){
                    params[i] = ((NMSWrap) params[i]).getNMSObject();
                }
            }

            return constructor.newInstance(params);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Object staticReflection(String name, String method, Object[] paramTypes, Object[] params){
        return internalStaticReflection(nms + name, method, paramTypes, params);
    }

    public static Object craftStaticReflection(String name, String method, Object[] paramTypes, Object[] params){
        return internalStaticReflection(craft + name, method, paramTypes, params);
    }

    private static Object internalStaticReflection(String name, String method, Object[] paramTypes, Object[] params){
        try {
            Class<?> clazz = Class.forName(name);
            Method m = clazz.getMethod(method, paramTypes(paramTypes));

            for (int i = 0; i < params.length; i++) {
                if(params[i] instanceof NMSWrap){
                    params[i] = ((NMSWrap) params[i]).getNMSObject();
                }
            }

            return m.invoke(null, params);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Object executeMethod(Object nmsObject, String method, Object[] paramTypes, Object[] params) {
        try {
            Class<?> clazz = nmsObject.getClass();
            Method m = clazz.getMethod(method, paramTypes(paramTypes));

            for (int i = 0; i < params.length; i++) {
                if(params[i] instanceof NMSWrap){
                    params[i] = ((NMSWrap) params[i]).getNMSObject();
                }
            }

            return m.invoke(nmsObject, params);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public static void setField(Object nmsObject, String field, Object value) {
        try {
            Class<?> clazz = nmsObject.getClass();
            Field f = clazz.getDeclaredField(field);
            f.setAccessible(true);
            f.set(nmsObject, value instanceof NMSWrap ? ((NMSWrap) value).getNMSObject() : value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Object getField(Object nmsObject, String field) {
        try {
            Class<?> clazz = nmsObject.getClass();
            Field f = clazz.getDeclaredField(field);
            f.setAccessible(true);
            return f.get(nmsObject);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static Class<?>[] paramTypes(Object[] params) throws ClassNotFoundException {
        Class<?>[] types = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            if(params[i] instanceof String) {
                types[i] = Class.forName(nms + params[i]);
            }else{
                types[i] = (Class<?>) params[i];
            }
        }
        return types;
    }

    public static Class<?> getClassDef(String name) {
        try {
            return Class.forName(nms + name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}
