package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "EmptyChunk")
public class NMSEmptyChunk extends NMSChunk {

    public NMSEmptyChunk(Object nmsObject){
        super(nmsObject);
    }

    public NMSEmptyChunk(NMSWorld world, int i, int i1){
        super("EmptyChunk", new Object[]{NMSWorld.class, int.class, int.class}, new Object[]{world, i, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EmptyChunk#a(long)
     */
    @ReflectiveMethod(name = "a", types = {long.class})
    public Random a(long l){
        return new Random(NMSWrapper.getInstance().exec(nmsObject, l));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EmptyChunk#addEntities()
     */
    @ReflectiveMethod(name = "addEntities", types = {})
    public void addEntities(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EmptyChunk#b(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntity.class})
    public void b(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EmptyChunk#c(int, int)
     */
    @ReflectiveMethod(name = "c", types = {int.class, int.class})
    public boolean c(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EmptyChunk#d(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "d", types = {NMSBlockPosition.class})
    public boolean d(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EmptyChunk#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public void e(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EmptyChunk#getBrightness(net.minecraft.server.v1_8_R3.EnumSkyBlock, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getBrightness", types = {NMSEnumSkyBlock.class, NMSBlockPosition.class})
    public int getBrightness(NMSEnumSkyBlock enumSkyBlock, NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, enumSkyBlock, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EmptyChunk#getType(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getType", types = {NMSBlockPosition.class})
    public NMSBlock getType(NMSBlockPosition blockPosition){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EmptyChunk#initLighting()
     */
    @ReflectiveMethod(name = "initLighting", types = {})
    public void initLighting(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EmptyChunk#isEmpty()
     */
    @ReflectiveMethod(name = "isEmpty", types = {})
    public boolean isEmpty(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EmptyChunk#removeEntities()
     */
    @ReflectiveMethod(name = "removeEntities", types = {})
    public void removeEntities(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}