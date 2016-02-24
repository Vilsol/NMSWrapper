package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveField;
import me.vilsol.nmswrapper.wraps.unparsed.NMSEntity;

@ReflectiveClass(name = "EntityInsentient")
public class NMSEntityInsentient extends NMSEntity {

    public NMSEntityInsentient(Object nmsObject) {
        super(nmsObject);
    }

    public NMSEntityInsentient(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    @ReflectiveField(name = "dropChances")
    public float[] getDropChances(){
        return (float[]) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveField(name = "dropChances")
    public void setDropChances(float[] dropChances){
        NMSWrapper.getInstance().exec(nmsObject, dropChances, null);
    }

}
