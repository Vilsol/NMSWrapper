package me.vilsol.nmswrapper.reflections.type;

import java.util.HashMap;

public class ReflectionClass implements ReflectionType {

    private Class<?> clazz;

    private HashMap<String, ReflectionType> types;

    public ReflectionClass(Class<?> clazz) {
        this.clazz = clazz;
        this.types = new HashMap<>();
    }

    @Override
    public Object exec(Object nms, Object... params) throws Exception {
        StackTraceElement trace = Thread.currentThread().getStackTrace()[3];
        String method = trace.getMethodName();

        if(types.containsKey(method)){
            return types.get(method).exec(nms, params);
        }

        return null;
    }

    public void add(String name, ReflectionType type) {
        types.put(name, type);
    }

}
