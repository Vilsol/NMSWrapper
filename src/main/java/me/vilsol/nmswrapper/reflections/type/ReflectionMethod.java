package me.vilsol.nmswrapper.reflections.type;

import java.lang.reflect.Method;

public class ReflectionMethod implements ReflectionType {

    private Method method;

    public ReflectionMethod(Method method) {
        this.method = method;
    }

    @Override
    public Object exec(Object nms, Object... params) throws Exception {
        return method.invoke(nms, params);
    }

}
