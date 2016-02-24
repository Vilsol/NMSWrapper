package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenFactory")
public class NMSWorldGenFactory extends NMSWrap {

    public NMSWorldGenFactory(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenFactory#a(net.minecraft.server.v1_8_R3.NBTTagCompound, net.minecraft.server.v1_8_R3.World)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class, NMSWorld.class})
    public NMSStructureStart a(NMSNBTTagCompound nBTTagCompound, NMSWorld world){
        return new NMSStructureStart(NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound, world));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenFactory#b(net.minecraft.server.v1_8_R3.NBTTagCompound, net.minecraft.server.v1_8_R3.World)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class, NMSWorld.class})
    public NMSStructurePiece b(NMSNBTTagCompound nBTTagCompound, NMSWorld world){
        return new NMSStructurePiece(NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound, world));
    }

}