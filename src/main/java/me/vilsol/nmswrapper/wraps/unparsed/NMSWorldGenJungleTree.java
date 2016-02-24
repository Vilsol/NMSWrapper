package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "WorldGenJungleTree")
public class NMSWorldGenJungleTree extends NMSWorldGenMegaTreeAbstract {

    public NMSWorldGenJungleTree(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenJungleTree(boolean b, int i, int i1, NMSIBlockData iBlockData, NMSIBlockData iBlockData1){
        super("WorldGenJungleTree", new Object[]{boolean.class, int.class, int.class, NMSIBlockData.class, NMSIBlockData.class}, new Object[]{b, i, i1, iBlockData, iBlockData1});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenJungleTree#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}