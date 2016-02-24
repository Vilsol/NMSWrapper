package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenTaigaStructure")
public class NMSWorldGenTaigaStructure extends NMSWorldGenerator {

    public NMSWorldGenTaigaStructure(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenTaigaStructure(NMSBlock block, int i){
        super("WorldGenTaigaStructure", new Object[]{NMSBlock.class, int.class}, new Object[]{block, i});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenTaigaStructure#generate(net.minecraft.server.v1_8_R3.World, java.util.Random, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "generate", types = {NMSWorld.class, Random.class, NMSBlockPosition.class})
    public boolean generate(NMSWorld world, Random random, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, random, blockPosition);
    }

}