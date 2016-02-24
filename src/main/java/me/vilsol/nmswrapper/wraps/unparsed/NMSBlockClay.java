package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "BlockClay")
public class NMSBlockClay extends NMSBlock {

    public NMSBlockClay(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockClay#a(java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {Random.class})
    public int a(Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, random);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockClay#getDropType(net.minecraft.server.v1_8_R3.IBlockData, java.util.Random, int)
     */
    @ReflectiveMethod(name = "getDropType", types = {NMSIBlockData.class, Random.class, int.class})
    public NMSItem getDropType(NMSIBlockData iBlockData, Random random, int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, iBlockData, random, i));
    }

}