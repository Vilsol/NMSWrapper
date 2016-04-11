package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "OldChunkLoader")
public class NMSOldChunkLoader extends NMSWrap {

    public NMSOldChunkLoader(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.OldChunkLoader#a(net.minecraft.server.v1_9_R1.OldChunkLoader$OldChunk, net.minecraft.server.v1_9_R1.NBTTagCompound, net.minecraft.server.v1_9_R1.WorldChunkManager)
     */
    @ReflectiveMethod(name = "a", types = {NMSOldChunk.class, NMSNBTTagCompound.class, NMSWorldChunkManager.class})
    public void a(NMSOldChunk oldChunk, NMSNBTTagCompound nBTTagCompound, NMSWorldChunkManager worldChunkManager){
        NMSWrapper.getInstance().exec(nmsObject, oldChunk, nBTTagCompound, worldChunkManager);
    }

    @ReflectiveClass(name = "OldChunk")
    public class NMSOldChunk extends NMSWrap {

        public NMSOldChunk(Object nmsObject){
            super(nmsObject);
        }

        public NMSOldChunk(int i, int i1){
            super("OldChunk", new Object[]{int.class, int.class}, new Object[]{i, i1});
        }

    }

}