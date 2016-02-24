package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockLightStone")
public class NMSBlockLightStone extends NMSBlock {

    public NMSBlockLightStone(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockLightStone(NMSMaterial material){
        super("BlockLightStone", new Object[]{NMSMaterial.class}, new Object[]{material});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockLightStone#a(java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {Random.class})
    public int a(Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, random);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockLightStone#g(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "g", types = {NMSIBlockData.class})
    public NMSMaterialMapColor g(NMSIBlockData iBlockData){
        return new NMSMaterialMapColor(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockLightStone#getDropCount(int, java.util.Random)
     */
    @ReflectiveMethod(name = "getDropCount", types = {int.class, Random.class})
    public int getDropCount(int i, Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, random);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockLightStone#getDropType(net.minecraft.server.v1_8_R3.IBlockData, java.util.Random, int)
     */
    @ReflectiveMethod(name = "getDropType", types = {NMSIBlockData.class, Random.class, int.class})
    public NMSItem getDropType(NMSIBlockData iBlockData, Random random, int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, iBlockData, random, i));
    }

}