package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "WorldChunkManager")
public class NMSWorldChunkManager extends NMSWrap {

    public NMSWorldChunkManager(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldChunkManager(long l, NMSWorldType worldType, String s){
        super("WorldChunkManager", new Object[]{long.class, NMSWorldType.class, String.class}, new Object[]{l, worldType, s});
    }

    public NMSWorldChunkManager(NMSWorld world){
        super("WorldChunkManager", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldChunkManager#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldChunkManager#getBiome(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.BiomeBase)
     */
    @ReflectiveMethod(name = "getBiome", types = {NMSBlockPosition.class, NMSBiomeBase.class})
    public NMSBiomeBase getBiome(NMSBlockPosition blockPosition, NMSBiomeBase biomeBase){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, blockPosition, biomeBase));
    }

}