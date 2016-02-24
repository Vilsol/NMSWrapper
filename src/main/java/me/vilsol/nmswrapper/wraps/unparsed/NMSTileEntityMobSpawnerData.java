package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;

@ReflectiveClass(name = "TileEntityMobSpawnerData")
public class NMSTileEntityMobSpawnerData extends NMSWeightedRandom.NMSWeightedRandomChoice {

    public NMSTileEntityMobSpawnerData(Object nmsObject){
        super(nmsObject);
    }

    public NMSTileEntityMobSpawnerData(NMSMobSpawnerAbstract mobSpawnerAbstract, NMSNBTTagCompound nBTTagCompound){
        super("TileEntityMobSpawnerData", new Object[]{NMSMobSpawnerAbstract.class, NMSNBTTagCompound.class}, new Object[]{mobSpawnerAbstract, nBTTagCompound});
    }

    public NMSTileEntityMobSpawnerData(NMSMobSpawnerAbstract mobSpawnerAbstract, NMSNBTTagCompound nBTTagCompound, String s){
        super("TileEntityMobSpawnerData", new Object[]{NMSMobSpawnerAbstract.class, NMSNBTTagCompound.class, String.class}, new Object[]{mobSpawnerAbstract, nBTTagCompound, s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityMobSpawnerData#a(net.minecraft.server.v1_8_R3.TileEntityMobSpawnerData)
     */
    @ReflectiveMethod(name = "a", types = {NMSTileEntityMobSpawnerData.class})
    public String a(NMSTileEntityMobSpawnerData tileEntityMobSpawnerData){
        return (String) NMSWrapper.getInstance().exec(nmsObject, tileEntityMobSpawnerData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityMobSpawnerData#b(net.minecraft.server.v1_8_R3.TileEntityMobSpawnerData)
     */
    @ReflectiveMethod(name = "b", types = {NMSTileEntityMobSpawnerData.class})
    public NMSNBTTagCompound b(NMSTileEntityMobSpawnerData tileEntityMobSpawnerData){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject, tileEntityMobSpawnerData));
    }

}