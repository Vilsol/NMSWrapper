package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockBloodStone")
public class NMSBlockBloodStone extends NMSBlock {

    public NMSBlockBloodStone(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockBloodStone#doPhysics(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "doPhysics", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSBlock.class})
    public void doPhysics(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockBloodStone#g(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "g", types = {NMSIBlockData.class})
    public NMSMaterialMapColor g(NMSIBlockData iBlockData){
        return new NMSMaterialMapColor(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

}