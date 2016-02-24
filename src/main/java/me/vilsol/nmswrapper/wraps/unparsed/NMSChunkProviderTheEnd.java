package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChunkProviderTheEnd")
public class NMSChunkProviderTheEnd extends NMSWrap implements NMSIChunkProvider {

    public NMSChunkProviderTheEnd(Object nmsObject){
        super(nmsObject);
    }

    public NMSChunkProviderTheEnd(NMSWorld world, long l){
        super("ChunkProviderTheEnd", new Object[]{NMSWorld.class, long.class}, new Object[]{world, l});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#a(net.minecraft.server.v1_8_R3.IChunkProvider, net.minecraft.server.v1_8_R3.Chunk, int, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSIChunkProvider.class, NMSChunk.class, int.class, int.class})
    public boolean a(NMSIChunkProvider iChunkProvider, NMSChunk chunk, int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iChunkProvider, chunk, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#canSave()
     */
    @ReflectiveMethod(name = "canSave", types = {})
    public boolean canSave(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#findNearestMapFeature(net.minecraft.server.v1_8_R3.World, java.lang.String, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "findNearestMapFeature", types = {NMSWorld.class, String.class, NMSBlockPosition.class})
    public NMSBlockPosition findNearestMapFeature(NMSWorld world, String s, NMSBlockPosition blockPosition){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, world, s, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#getChunkAt(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getChunkAt", types = {NMSBlockPosition.class})
    public NMSChunk getChunkAt(NMSBlockPosition blockPosition){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#getLoadedChunks()
     */
    @ReflectiveMethod(name = "getLoadedChunks", types = {})
    public int getLoadedChunks(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#getOrCreateChunk(int, int)
     */
    @ReflectiveMethod(name = "getOrCreateChunk", types = {int.class, int.class})
    public NMSChunk getOrCreateChunk(int i, int i1){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#isChunkLoaded(int, int)
     */
    @ReflectiveMethod(name = "isChunkLoaded", types = {int.class, int.class})
    public boolean isChunkLoaded(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#recreateStructures(net.minecraft.server.v1_8_R3.Chunk, int, int)
     */
    @ReflectiveMethod(name = "recreateStructures", types = {NMSChunk.class, int.class, int.class})
    public void recreateStructures(NMSChunk chunk, int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, chunk, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#saveChunks(boolean, net.minecraft.server.v1_8_R3.IProgressUpdate)
     */
    @ReflectiveMethod(name = "saveChunks", types = {boolean.class, NMSIProgressUpdate.class})
    public boolean saveChunks(boolean b, NMSIProgressUpdate iProgressUpdate){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, b, iProgressUpdate);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ChunkProviderTheEnd#unloadChunks()
     */
    @ReflectiveMethod(name = "unloadChunks", types = {})
    public boolean unloadChunks(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}