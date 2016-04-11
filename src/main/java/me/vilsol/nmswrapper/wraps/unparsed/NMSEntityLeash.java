package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityLeash")
public class NMSEntityLeash extends NMSEntityHanging {

    public NMSEntityLeash(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityLeash(NMSWorld world){
        super("EntityLeash", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityLeash(NMSWorld world, NMSBlockPosition blockPosition){
        super("EntityLeash", new Object[]{NMSWorld.class, NMSBlockPosition.class}, new Object[]{world, blockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLeash#a(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class})
    public NMSEntityLeash a(NMSWorld world, NMSBlockPosition blockPosition){
        return new NMSEntityLeash(NMSWrapper.getInstance().exec(nmsObject, world, blockPosition));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLeash#b(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "b", types = {NMSWorld.class, NMSBlockPosition.class})
    public NMSEntityLeash b(NMSWorld world, NMSBlockPosition blockPosition){
        return new NMSEntityLeash(NMSWrapper.getInstance().exec(nmsObject, world, blockPosition));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLeash#d(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "d", types = {NMSNBTTagCompound.class})
    public boolean d(NMSNBTTagCompound nBTTagCompound){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLeash#e(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "e", types = {NMSEntityHuman.class})
    public boolean e(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLeash#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLeash#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLeash#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public int l(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLeash#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public int m(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLeash#setDirection(net.minecraft.server.v1_9_R1.EnumDirection)
     */
    @ReflectiveMethod(name = "setDirection", types = {NMSEnumDirection.class})
    public void setDirection(NMSEnumDirection enumDirection){
        NMSWrapper.getInstance().exec(nmsObject, enumDirection);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityLeash#survives()
     */
    @ReflectiveMethod(name = "survives", types = {})
    public boolean survives(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}