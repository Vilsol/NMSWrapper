package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockPressurePlateWeighted")
public class NMSBlockPressurePlateWeighted extends NMSBlockPressurePlateAbstract {

    public NMSBlockPressurePlateWeighted(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPressurePlateWeighted#a(net.minecraft.server.v1_8_R3.World)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class})
    public int a(NMSWorld world){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPressurePlateWeighted#e(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "e", types = {NMSIBlockData.class})
    public int e(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPressurePlateWeighted#f(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "f", types = {NMSWorld.class, NMSBlockPosition.class})
    public int f(NMSWorld world, NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPressurePlateWeighted#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPressurePlateWeighted#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPressurePlateWeighted#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

}