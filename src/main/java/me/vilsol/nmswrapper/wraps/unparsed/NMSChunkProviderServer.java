package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChunkProviderServer")
public class NMSChunkProviderServer extends NMSWrap implements NMSIChunkProvider {

    public NMSChunkProviderServer(Object nmsObject){
        super(nmsObject);
    }

    public NMSChunkProviderServer(NMSWorldServer worldServer, NMSIChunkLoader iChunkLoader, NMSIChunkProvider iChunkProvider){
        super("ChunkProviderServer", new Object[]{NMSWorldServer.class, NMSIChunkLoader.class, NMSIChunkProvider.class}, new Object[]{worldServer, iChunkLoader, iChunkProvider});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#a(net.minecraft.server.v1_9_R1.IChunkProvider, net.minecraft.server.v1_9_R1.Chunk, int, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSIChunkProvider.class, NMSChunk.class, int.class, int.class})
    public boolean a(NMSIChunkProvider iChunkProvider, NMSChunk chunk, int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iChunkProvider, chunk, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#canSave()
     */
    @ReflectiveMethod(name = "canSave", types = {})
    public boolean canSave(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#findNearestMapFeature(net.minecraft.server.v1_9_R1.World, java.lang.String, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "findNearestMapFeature", types = {NMSWorld.class, String.class, NMSBlockPosition.class})
    public NMSBlockPosition findNearestMapFeature(NMSWorld world, String s, NMSBlockPosition blockPosition){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, world, s, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#getChunkAt(net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "getChunkAt", types = {NMSBlockPosition.class})
    public NMSChunk getChunkAt(NMSBlockPosition blockPosition){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#getChunkIfLoaded(int, int)
     */
    @ReflectiveMethod(name = "getChunkIfLoaded", types = {int.class, int.class})
    public NMSChunk getChunkIfLoaded(int i, int i1){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#getLoadedChunks()
     */
    @ReflectiveMethod(name = "getLoadedChunks", types = {})
    public int getLoadedChunks(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#getOrCreateChunk(int, int)
     */
    @ReflectiveMethod(name = "getOrCreateChunk", types = {int.class, int.class})
    public NMSChunk getOrCreateChunk(int i, int i1){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#isChunkLoaded(int, int)
     */
    @ReflectiveMethod(name = "isChunkLoaded", types = {int.class, int.class})
    public boolean isChunkLoaded(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#loadChunk(int, int)
     */
    @ReflectiveMethod(name = "loadChunk", types = {int.class, int.class})
    public NMSChunk loadChunk(int i, int i1){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#originalGetChunkAt(int, int)
     */
    @ReflectiveMethod(name = "originalGetChunkAt", types = {int.class, int.class})
    public NMSChunk originalGetChunkAt(int i, int i1){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#queueUnload(int, int)
     */
    @ReflectiveMethod(name = "queueUnload", types = {int.class, int.class})
    public void queueUnload(int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#recreateStructures(net.minecraft.server.v1_9_R1.Chunk, int, int)
     */
    @ReflectiveMethod(name = "recreateStructures", types = {NMSChunk.class, int.class, int.class})
    public void recreateStructures(NMSChunk chunk, int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, chunk, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#saveChunk(net.minecraft.server.v1_9_R1.Chunk)
     */
    @ReflectiveMethod(name = "saveChunk", types = {NMSChunk.class})
    public void saveChunk(NMSChunk chunk){
        NMSWrapper.getInstance().exec(nmsObject, chunk);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#saveChunkNOP(net.minecraft.server.v1_9_R1.Chunk)
     */
    @ReflectiveMethod(name = "saveChunkNOP", types = {NMSChunk.class})
    public void saveChunkNOP(NMSChunk chunk){
        NMSWrapper.getInstance().exec(nmsObject, chunk);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#saveChunks(boolean, net.minecraft.server.v1_9_R1.IProgressUpdate)
     */
    @ReflectiveMethod(name = "saveChunks", types = {boolean.class, NMSIProgressUpdate.class})
    public boolean saveChunks(boolean b, NMSIProgressUpdate iProgressUpdate){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, b, iProgressUpdate);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkProviderServer#unloadChunks()
     */
    @ReflectiveMethod(name = "unloadChunks", types = {})
    public boolean unloadChunks(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}