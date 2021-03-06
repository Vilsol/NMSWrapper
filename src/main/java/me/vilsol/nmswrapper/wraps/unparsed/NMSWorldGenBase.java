package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenBase")
public class NMSWorldGenBase extends NMSWrap {

    public NMSWorldGenBase(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenBase#a(net.minecraft.server.v1_9_R1.World, int, int, int, int, net.minecraft.server.v1_9_R1.ChunkSnapshot)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, int.class, int.class, int.class, int.class, NMSChunkSnapshot.class})
    public void a(NMSWorld world, int i, int i1, int i2, int i3, NMSChunkSnapshot chunkSnapshot){
        NMSWrapper.getInstance().exec(nmsObject, world, i, i1, i2, i3, chunkSnapshot);
    }

}