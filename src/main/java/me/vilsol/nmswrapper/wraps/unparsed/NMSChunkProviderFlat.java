package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChunkProviderFlat")
public class NMSChunkProviderFlat extends NMSWrap implements NMSIChunkProvider {

    public NMSChunkProviderFlat(Object nmsObject){
        super(nmsObject);
    }

    public NMSChunkProviderFlat(NMSWorld world, long l, boolean b, String s){
        super("ChunkProviderFlat", new Object[]{NMSWorld.class, long.class, boolean.class, String.class}, new Object[]{world, l, b, s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#a(net.minecraft.server.v1_9_R1.IChunkProvider, net.minecraft.server.v1_9_R1.Chunk, int, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSIChunkProvider.class, NMSChunk.class, int.class, int.class})
    public boolean a(NMSIChunkProvider iChunkProvider, NMSChunk chunk, int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iChunkProvider, chunk, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#canSave()
     */
    @ReflectiveMethod(name = "canSave", types = {})
    public boolean canSave(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#findNearestMapFeature(net.minecraft.server.v1_9_R1.World, java.lang.String, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "findNearestMapFeature", types = {NMSWorld.class, String.class, NMSBlockPosition.class})
    public NMSBlockPosition findNearestMapFeature(NMSWorld world, String s, NMSBlockPosition blockPosition){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, world, s, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#getChunkAt(net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "getChunkAt", types = {NMSBlockPosition.class})
    public NMSChunk getChunkAt(NMSBlockPosition blockPosition){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#getLoadedChunks()
     */
    @ReflectiveMethod(name = "getLoadedChunks", types = {})
    public int getLoadedChunks(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#getOrCreateChunk(int, int)
     */
    @ReflectiveMethod(name = "getOrCreateChunk", types = {int.class, int.class})
    public NMSChunk getOrCreateChunk(int i, int i1){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#isChunkLoaded(int, int)
     */
    @ReflectiveMethod(name = "isChunkLoaded", types = {int.class, int.class})
    public boolean isChunkLoaded(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#recreateStructures(net.minecraft.server.v1_9_R1.Chunk, int, int)
     */
    @ReflectiveMethod(name = "recreateStructures", types = {NMSChunk.class, int.class, int.class})
    public void recreateStructures(NMSChunk chunk, int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, chunk, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#saveChunks(boolean, net.minecraft.server.v1_9_R1.IProgressUpdate)
     */
    @ReflectiveMethod(name = "saveChunks", types = {boolean.class, NMSIProgressUpdate.class})
    public boolean saveChunks(boolean b, NMSIProgressUpdate iProgressUpdate){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, b, iProgressUpdate);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderFlat#unloadChunks()
     */
    @ReflectiveMethod(name = "unloadChunks", types = {})
    public boolean unloadChunks(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}