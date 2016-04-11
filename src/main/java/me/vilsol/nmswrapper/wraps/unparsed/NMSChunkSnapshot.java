package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChunkSnapshot")
public class NMSChunkSnapshot extends NMSWrap {

    public NMSChunkSnapshot(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChunkSnapshot#a(int, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "a", types = {int.class, NMSIBlockData.class})
    public void a(int i, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, i, iBlockData);
    }

}