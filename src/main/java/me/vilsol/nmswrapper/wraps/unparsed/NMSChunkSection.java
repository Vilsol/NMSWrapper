package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChunkSection")
public class NMSChunkSection extends NMSWrap {

    public NMSChunkSection(Object nmsObject){
        super(nmsObject);
    }

    public NMSChunkSection(int i, boolean b){
        super("ChunkSection", new Object[]{int.class, boolean.class}, new Object[]{i, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChunkSection#a(net.minecraft.server.v1_8_R3.NibbleArray)
     */
    @ReflectiveMethod(name = "a", types = {NMSNibbleArray.class})
    public void a(NMSNibbleArray nibbleArray){
        NMSWrapper.getInstance().exec(nmsObject, nibbleArray);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChunkSection#b(net.minecraft.server.v1_8_R3.NibbleArray)
     */
    @ReflectiveMethod(name = "b", types = {NMSNibbleArray.class})
    public void b(NMSNibbleArray nibbleArray){
        NMSWrapper.getInstance().exec(nmsObject, nibbleArray);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChunkSection#c(int, int, int)
     */
    @ReflectiveMethod(name = "c", types = {int.class, int.class, int.class})
    public int c(int i, int i1, int i2){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, i2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChunkSection#d(int, int, int)
     */
    @ReflectiveMethod(name = "d", types = {int.class, int.class, int.class})
    public int d(int i, int i1, int i2){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, i2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChunkSection#e(int, int, int)
     */
    @ReflectiveMethod(name = "e", types = {int.class, int.class, int.class})
    public int e(int i, int i1, int i2){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, i2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkSection#getEmittedLightArray()
     */
    @ReflectiveMethod(name = "getEmittedLightArray", types = {})
    public NMSNibbleArray getEmittedLightArray(){
        return new NMSNibbleArray(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkSection#getSkyLightArray()
     */
    @ReflectiveMethod(name = "getSkyLightArray", types = {})
    public NMSNibbleArray getSkyLightArray(){
        return new NMSNibbleArray(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkSection#getType(int, int, int)
     */
    @ReflectiveMethod(name = "getType", types = {int.class, int.class, int.class})
    public NMSIBlockData getType(int i, int i1, int i2){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, i, i1, i2));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkSection#getYPosition()
     */
    @ReflectiveMethod(name = "getYPosition", types = {})
    public int getYPosition(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkSection#recalcBlockCounts()
     */
    @ReflectiveMethod(name = "recalcBlockCounts", types = {})
    public void recalcBlockCounts(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkSection#setType(int, int, int, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "setType", types = {int.class, int.class, int.class, NMSIBlockData.class})
    public void setType(int i, int i1, int i2, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, i, i1, i2, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkSection#shouldTick()
     */
    @ReflectiveMethod(name = "shouldTick", types = {})
    public boolean shouldTick(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}