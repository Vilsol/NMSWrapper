package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockPotatoes")
public class NMSBlockPotatoes extends NMSBlockCrops {

    public NMSBlockPotatoes(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPotatoes#dropNaturally(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, float, int)
     */
    @ReflectiveMethod(name = "dropNaturally", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, float.class, int.class})
    public void dropNaturally(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, float f, int i){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, f, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPotatoes#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public NMSItem l(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPotatoes#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public NMSItem n(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

}