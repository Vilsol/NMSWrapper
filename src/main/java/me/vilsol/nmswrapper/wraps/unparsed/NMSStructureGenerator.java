package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "StructureGenerator")
public class NMSStructureGenerator extends NMSWorldGenBase {

    public NMSStructureGenerator(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureGenerator#a(int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class})
    public boolean a(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureGenerator#b(int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class})
    public NMSStructureStart b(int i, int i1){
        return new NMSStructureStart(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureGenerator#c(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "c", types = {NMSBlockPosition.class})
    public NMSStructureStart c(NMSBlockPosition blockPosition){
        return new NMSStructureStart(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.StructureGenerator#getNearestGeneratedFeature(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getNearestGeneratedFeature", types = {NMSWorld.class, NMSBlockPosition.class})
    public NMSBlockPosition getNearestGeneratedFeature(NMSWorld world, NMSBlockPosition blockPosition){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, world, blockPosition));
    }

}