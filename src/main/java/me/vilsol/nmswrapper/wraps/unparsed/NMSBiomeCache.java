package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BiomeCache")
public class NMSBiomeCache extends NMSWrap {

    public NMSBiomeCache(Object nmsObject){
        super(nmsObject);
    }

    public NMSBiomeCache(NMSWorldChunkManager worldChunkManager){
        super("BiomeCache", new Object[]{NMSWorldChunkManager.class}, new Object[]{worldChunkManager});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BiomeCache#a(net.minecraft.server.v1_8_R3.BiomeCache)
     */
    @ReflectiveMethod(name = "a", types = {NMSBiomeCache.class})
    public NMSWorldChunkManager a(NMSBiomeCache biomeCache){
        return new NMSWorldChunkManager(NMSWrapper.getInstance().exec(nmsObject, biomeCache));
    }

    @ReflectiveClass(name = "BiomeCacheBlock")
    public class NMSBiomeCacheBlock extends NMSWrap {

        public NMSBiomeCacheBlock(Object nmsObject){
            super(nmsObject);
        }

        public NMSBiomeCacheBlock(NMSBiomeCache biomeCache, int i, int i1){
            super("BiomeCacheBlock", new Object[]{NMSBiomeCache.class, int.class, int.class}, new Object[]{biomeCache, i, i1});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.BiomeCache$BiomeCacheBlock#a(int, int)
         */
        @ReflectiveMethod(name = "a", types = {int.class, int.class})
        public NMSBiomeBase a(int i, int i1){
            return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, i, i1));
        }

    }

}