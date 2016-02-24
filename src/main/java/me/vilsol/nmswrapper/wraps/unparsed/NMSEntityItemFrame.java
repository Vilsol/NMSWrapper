package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityItemFrame")
public class NMSEntityItemFrame extends NMSEntityHanging {

    public NMSEntityItemFrame(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityItemFrame(NMSWorld world){
        super("EntityItemFrame", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityItemFrame(NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection){
        super("EntityItemFrame", new Object[]{NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class}, new Object[]{world, blockPosition, enumDirection});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#ao()
     */
    @ReflectiveMethod(name = "ao", types = {})
    public float ao(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#damageEntity(net.minecraft.server.v1_8_R3.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#e(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "e", types = {NMSEntityHuman.class})
    public boolean e(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#getItem()
     */
    @ReflectiveMethod(name = "getItem", types = {})
    public NMSItemStack getItem(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#getRotation()
     */
    @ReflectiveMethod(name = "getRotation", types = {})
    public int getRotation(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public int l(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public int m(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#q()
     */
    @ReflectiveMethod(name = "q", types = {})
    public int q(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#setItem(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "setItem", types = {NMSItemStack.class})
    public void setItem(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityItemFrame#setRotation(int)
     */
    @ReflectiveMethod(name = "setRotation", types = {int.class})
    public void setRotation(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

}