package me.vilsol.nmswrapper.reflections.type;

import java.lang.reflect.Field;

public class ReflectionField implements ReflectionType {

    private Field field;

    public ReflectionField(Field field) {
        this.field = field;
    }

    @Override
    public Object exec(Object nms, Object... params) throws Exception {
        if(params.length > 0){
            field.set(nms, params[0]);
            return null;
        }

        return field.get(nms);
    }

}
