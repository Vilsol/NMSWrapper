package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.reflections.Reflection;

public abstract class NMSWrap {

    protected Object nmsObject;

    public NMSWrap(Object nmsObject){
        this.nmsObject = nmsObject;
    }

    public NMSWrap(String nmsName, Object[] paramTypes, Object[] params) {
        this.nmsObject = Reflection.newInstance(nmsName, paramTypes, params);
    }

    public Object getNMSObject(){
        return nmsObject;
    }

    @Override
    public String toString() {
        return "NMSWrap{" +
                "nmsObject=" + nmsObject +
                '}';
    }

}
