package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "BiomeIcePlains")
public class NMSBiomeIcePlains extends NMSBiomeBase {

    public NMSBiomeIcePlains(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeIcePlains(int i, boolean b){
        super("BiomeIcePlains", new Object[]{int.class, boolean.class}, new Object[]{i, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BiomeIcePlains#a(java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {Random.class})
    public NMSWorldGenTreeAbstract a(Random random){
        return new NMSWorldGenTreeAbstract(NMSWrapper.getInstance().exec(nmsObject, random));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BiomeIcePlains#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public NMSBiomeBase d(int i){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, i));
    }

}