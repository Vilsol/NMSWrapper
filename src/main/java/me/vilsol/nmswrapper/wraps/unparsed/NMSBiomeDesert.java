package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "BiomeDesert")
public class NMSBiomeDesert extends NMSBiomeBase {

    public NMSBiomeDesert(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeDesert(int i){
        super("BiomeDesert", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BiomeDesert#a(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public void a(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}