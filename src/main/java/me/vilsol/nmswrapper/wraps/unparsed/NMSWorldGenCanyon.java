package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenCanyon")
public class NMSWorldGenCanyon extends NMSWorldGenBase {

    public NMSWorldGenCanyon(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenCanyon#a(net.minecraft.server.v1_8_R3.World, int, int, int, int, net.minecraft.server.v1_8_R3.ChunkSnapshot)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, int.class, int.class, int.class, int.class, NMSChunkSnapshot.class})
    public void a(NMSWorld world, int i, int i1, int i2, int i3, NMSChunkSnapshot chunkSnapshot){
        NMSWrapper.getInstance().exec(nmsObject, world, i, i1, i2, i3, chunkSnapshot);
    }

}