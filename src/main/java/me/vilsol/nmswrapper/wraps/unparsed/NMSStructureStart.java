package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "StructureStart")
public class NMSStructureStart extends NMSWrap {

    public NMSStructureStart(Object nmsObject){
        super(nmsObject);
    }

    public NMSStructureStart(int i, int i1){
        super("StructureStart", new Object[]{int.class, int.class}, new Object[]{i, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureStart#a(net.minecraft.server.v1_8_R3.ChunkCoordIntPair)
     */
    @ReflectiveMethod(name = "a", types = {NMSChunkCoordIntPair.class})
    public boolean a(NMSChunkCoordIntPair chunkCoordIntPair){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, chunkCoordIntPair);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureStart#b(net.minecraft.server.v1_8_R3.ChunkCoordIntPair)
     */
    @ReflectiveMethod(name = "b", types = {NMSChunkCoordIntPair.class})
    public void b(NMSChunkCoordIntPair chunkCoordIntPair){
        NMSWrapper.getInstance().exec(nmsObject, chunkCoordIntPair);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureStart#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureStart#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureStart#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public int e(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureStart#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public int f(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}