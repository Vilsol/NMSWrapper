package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenMegaTreeAbstract")
public class NMSWorldGenMegaTreeAbstract extends NMSWorldGenTreeAbstract {

    public NMSWorldGenMegaTreeAbstract(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenMegaTreeAbstract(boolean b, int i, int i1, NMSIBlockData iBlockData, NMSIBlockData iBlockData1){
        super("WorldGenMegaTreeAbstract", new Object[]{boolean.class, int.class, int.class, NMSIBlockData.class, NMSIBlockData.class}, new Object[]{b, i, i1, iBlockData, iBlockData1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenMegaTreeAbstract#a(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class, int.class})
    public void a(NMSWorld world, NMSBlockPosition blockPosition, int i){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenMegaTreeAbstract#b(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSWorld.class, NMSBlockPosition.class, int.class})
    public void b(NMSWorld world, NMSBlockPosition blockPosition, int i){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, i);
    }

}