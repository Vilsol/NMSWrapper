package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "BiomeBaseSub")
public class NMSBiomeBaseSub extends NMSBiomeBase {

    public NMSBiomeBaseSub(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeBaseSub(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSBiomeBaseSub(int i, NMSBiomeBase biomeBase){
        super("BiomeBaseSub", new Object[]{int.class, NMSBiomeBase.class}, new Object[]{i, biomeBase});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BiomeBaseSub#a(net.minecraft.server.v1_8_R3.BiomeBase)
     */
    @ReflectiveMethod(name = "a", types = {NMSBiomeBase.class})
    public boolean a(NMSBiomeBase biomeBase){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, biomeBase);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BiomeBaseSub#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public float g(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BiomeBaseSub#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public NMSEnumTemperature m(){
        return new NMSEnumTemperature(NMSWrapper.getInstance().exec(nmsObject));
    }

}