package me.vilsol.nmswrapper.wraps.world;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "GameRules")
public class NMSGameRules extends NMSWrap {

    public NMSGameRules(Object nmsObject) {
        super(nmsObject);
    }

    @ReflectiveMethod(name = "set", types = {String.class, String.class})
    public void set(String key, String value) {
        NMSWrapper.getInstance().exec(nmsObject, key, value);
    }

    @ReflectiveMethod(name = "get", types = {String.class})
    public String get(String key) {
        return (String) NMSWrapper.getInstance().exec(nmsObject, key);
    }

    @ReflectiveMethod(name = "getBoolean", types = {String.class})
    public boolean getBoolean(String key) {
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, key);
    }

    @ReflectiveMethod(name = "getGameRules")
    public String[] getGameRules() {
        return (String[]) NMSWrapper.getInstance().exec(nmsObject);
    }

}
