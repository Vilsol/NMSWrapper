package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityComplexPart")
public class NMSEntityComplexPart extends NMSEntity {

    public NMSEntityComplexPart(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityComplexPart(NMSIComplex iComplex, String s, float f, float f1){
        super("EntityComplexPart", new Object[]{NMSIComplex.class, String.class, float.class, float.class}, new Object[]{iComplex, s, f, f1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityComplexPart#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityComplexPart#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityComplexPart#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityComplexPart#damageEntity(net.minecraft.server.v1_8_R3.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityComplexPart#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityComplexPart#k(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "k", types = {NMSEntity.class})
    public boolean k(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

}