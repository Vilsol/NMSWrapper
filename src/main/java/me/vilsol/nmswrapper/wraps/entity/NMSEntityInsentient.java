package me.vilsol.nmswrapper.wraps.entity;

import me.vilsol.nmswrapper.Reflection;

public class NMSEntityInsentient extends NMSEntityLiving {

    public NMSEntityInsentient(Object nmsObject) {
        super(nmsObject);
    }

    public float[] getDropChances(){
        return (float[]) Reflection.getField(nmsObject, "dropChances");
    }

    public void setDropChances(float[] dropChances){
        Reflection.setField(nmsObject, "dropChances", dropChances);
    }

}
