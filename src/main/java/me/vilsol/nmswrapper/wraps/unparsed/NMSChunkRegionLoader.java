package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.io.File;

@ReflectiveClass(name = "ChunkRegionLoader")
public class NMSChunkRegionLoader extends NMSWrap implements NMSIAsyncChunkSaver {

    public NMSChunkRegionLoader(Object nmsObject){
        super(nmsObject);
    }

    public NMSChunkRegionLoader(File file){
        super("ChunkRegionLoader", new Object[]{File.class}, new Object[]{file});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChunkRegionLoader#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChunkRegionLoader#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChunkRegionLoader#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkRegionLoader#chunkExists(net.minecraft.server.v1_9_R1.World, int, int)
     */
    @ReflectiveMethod(name = "chunkExists", types = {NMSWorld.class, int.class, int.class})
    public boolean chunkExists(NMSWorld world, int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkRegionLoader#loadEntities(net.minecraft.server.v1_9_R1.Chunk, net.minecraft.server.v1_9_R1.NBTTagCompound, net.minecraft.server.v1_9_R1.World)
     */
    @ReflectiveMethod(name = "loadEntities", types = {NMSChunk.class, NMSNBTTagCompound.class, NMSWorld.class})
    public void loadEntities(NMSChunk chunk, NMSNBTTagCompound nBTTagCompound, NMSWorld world){
        NMSWrapper.getInstance().exec(nmsObject, chunk, nBTTagCompound, world);
    }

}