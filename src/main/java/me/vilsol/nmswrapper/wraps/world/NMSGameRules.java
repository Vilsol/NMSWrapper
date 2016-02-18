package me.vilsol.nmswrapper.wraps.world;

import me.vilsol.nmswrapper.Reflection;
import me.vilsol.nmswrapper.wraps.NMSWrap;

public class NMSGameRules extends NMSWrap {

    public NMSGameRules(Object nmsObject) {
        super(nmsObject);
    }

    public void set(String key, String value) {
        Reflection.doMethod(nmsObject, "set", new Object[]{String.class, String.class}, new Object[]{key, value});
    }

    public String get(String key) {
        return (String) Reflection.doMethod(nmsObject, "get", new Object[]{String.class}, new Object[]{key});
    }

    public boolean getBoolean(String key) {
        return (boolean) Reflection.doMethod(nmsObject, "getBoolean", new Object[]{String.class}, new Object[]{key});
    }

    public String[] getGameRules() {
        return (String[]) Reflection.doMethod(nmsObject, "getGameRules", new Object[]{}, new Object[]{});
    }

}
