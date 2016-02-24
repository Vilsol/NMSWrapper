package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;

@ReflectiveClass(name = "EntityWeather")
public class NMSEntityWeather extends NMSEntity {

    public NMSEntityWeather(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityWeather(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSEntityWeather(NMSWorld world){
        super("EntityWeather", new Object[]{NMSWorld.class}, new Object[]{world});
    }

}