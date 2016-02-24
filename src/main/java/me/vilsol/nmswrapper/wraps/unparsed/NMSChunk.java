package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "Chunk")
public class NMSChunk extends NMSWrap {

    public NMSChunk(Object nmsObject){
        super(nmsObject);
    }

    public NMSChunk(NMSWorld world, int i, int i1){
        super("Chunk", new Object[]{NMSWorld.class, int.class, int.class}, new Object[]{world, i, i1});
    }

    public NMSChunk(NMSWorld world, NMSChunkSnapshot chunkSnapshot, int i, int i1){
        super("Chunk", new Object[]{NMSWorld.class, NMSChunkSnapshot.class, int.class, int.class}, new Object[]{world, chunkSnapshot, i, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#a(long)
     */
    @ReflectiveMethod(name = "a", types = {long.class})
    public Random a(long l){
        return new Random(NMSWrapper.getInstance().exec(nmsObject, l));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#addEntities()
     */
    @ReflectiveMethod(name = "addEntities", types = {})
    public void addEntities(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#areNeighborsLoaded(int)
     */
    @ReflectiveMethod(name = "areNeighborsLoaded", types = {int.class})
    public boolean areNeighborsLoaded(int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#b(boolean)
     */
    @ReflectiveMethod(name = "b", types = {boolean.class})
    public void b(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#c(long)
     */
    @ReflectiveMethod(name = "c", types = {long.class})
    public void c(long l){
        NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#d(boolean)
     */
    @ReflectiveMethod(name = "d", types = {boolean.class})
    public void d(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#e(boolean)
     */
    @ReflectiveMethod(name = "e", types = {boolean.class})
    public void e(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#f(boolean)
     */
    @ReflectiveMethod(name = "f", types = {boolean.class})
    public void f(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#g(boolean)
     */
    @ReflectiveMethod(name = "g", types = {boolean.class})
    public void g(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#getBiome(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.WorldChunkManager)
     */
    @ReflectiveMethod(name = "getBiome", types = {NMSBlockPosition.class, NMSWorldChunkManager.class})
    public NMSBiomeBase getBiome(NMSBlockPosition blockPosition, NMSWorldChunkManager worldChunkManager){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, blockPosition, worldChunkManager));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#getBlockData(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getBlockData", types = {NMSBlockPosition.class})
    public NMSIBlockData getBlockData(NMSBlockPosition blockPosition){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#getBrightness(net.minecraft.server.v1_8_R3.EnumSkyBlock, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getBrightness", types = {NMSEnumSkyBlock.class, NMSBlockPosition.class})
    public int getBrightness(NMSEnumSkyBlock enumSkyBlock, NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, enumSkyBlock, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#getType(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getType", types = {NMSBlockPosition.class})
    public NMSBlock getType(NMSBlockPosition blockPosition){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#getTypeAbs(int, int, int)
     */
    @ReflectiveMethod(name = "getTypeAbs", types = {int.class, int.class, int.class})
    public NMSBlock getTypeAbs(int i, int i1, int i2){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject, i, i1, i2));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#getWorld()
     */
    @ReflectiveMethod(name = "getWorld", types = {})
    public NMSWorld getWorld(){
        return new NMSWorld(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#h(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "h", types = {NMSBlockPosition.class})
    public NMSBlockPosition h(NMSBlockPosition blockPosition){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#initLighting()
     */
    @ReflectiveMethod(name = "initLighting", types = {})
    public void initLighting(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#isDone()
     */
    @ReflectiveMethod(name = "isDone", types = {})
    public boolean isDone(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#isEmpty()
     */
    @ReflectiveMethod(name = "isEmpty", types = {})
    public boolean isEmpty(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#isReady()
     */
    @ReflectiveMethod(name = "isReady", types = {})
    public boolean isReady(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public NMSChunkCoordIntPair j(){
        return new NMSChunkCoordIntPair(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public void l(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#loadNearby(net.minecraft.server.v1_8_R3.IChunkProvider, net.minecraft.server.v1_8_R3.IChunkProvider, int, int)
     */
    @ReflectiveMethod(name = "loadNearby", types = {NMSIChunkProvider.class, NMSIChunkProvider.class, int.class, int.class})
    public void loadNearby(NMSIChunkProvider iChunkProvider, NMSIChunkProvider iChunkProvider1, int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, iChunkProvider, iChunkProvider1, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public void n(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#o()
     */
    @ReflectiveMethod(name = "o", types = {})
    public boolean o(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#removeEntities()
     */
    @ReflectiveMethod(name = "removeEntities", types = {})
    public void removeEntities(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#setLastSaved(long)
     */
    @ReflectiveMethod(name = "setLastSaved", types = {long.class})
    public void setLastSaved(long l){
        NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#setNeighborLoaded(int, int)
     */
    @ReflectiveMethod(name = "setNeighborLoaded", types = {int.class, int.class})
    public void setNeighborLoaded(int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Chunk#setNeighborUnloaded(int, int)
     */
    @ReflectiveMethod(name = "setNeighborUnloaded", types = {int.class, int.class})
    public void setNeighborUnloaded(int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public boolean u(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#v()
     */
    @ReflectiveMethod(name = "v", types = {})
    public int v(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Chunk#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public long w(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

}