package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "SourceBlock")
public class NMSSourceBlock extends NMSWrap implements NMSISourceBlock {

    public NMSSourceBlock(Object nmsObject){
        super(nmsObject);
    }

    public NMSSourceBlock(NMSWorld world, NMSBlockPosition blockPosition){
        super("SourceBlock", new Object[]{NMSWorld.class, NMSBlockPosition.class}, new Object[]{world, blockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.SourceBlock#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public int f(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.SourceBlock#getBlockPosition()
     */
    @ReflectiveMethod(name = "getBlockPosition", types = {})
    public NMSBlockPosition getBlockPosition(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.SourceBlock#getTileEntity()
     */
    @ReflectiveMethod(name = "getTileEntity", types = {})
    public Object getTileEntity(){
        return NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.SourceBlock#getX()
     */
    @ReflectiveMethod(name = "getX", types = {})
    public double getX(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.SourceBlock#getY()
     */
    @ReflectiveMethod(name = "getY", types = {})
    public double getY(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.SourceBlock#getZ()
     */
    @ReflectiveMethod(name = "getZ", types = {})
    public double getZ(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.SourceBlock#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSWorld i(){
        return new NMSWorld(NMSWrapper.getInstance().exec(nmsObject));
    }

}