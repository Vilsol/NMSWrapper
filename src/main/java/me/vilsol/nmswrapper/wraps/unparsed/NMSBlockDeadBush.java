package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "BlockDeadBush")
public class NMSBlockDeadBush extends NMSBlockPlant {

    public NMSBlockDeadBush(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockDeadBush#a(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.TileEntity)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSEntityHuman.class, NMSBlockPosition.class, NMSIBlockData.class, NMSTileEntity.class})
    public void a(NMSWorld world, NMSEntityHuman entityHuman, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSTileEntity tileEntity){
        NMSWrapper.getInstance().exec(nmsObject, world, entityHuman, blockPosition, iBlockData, tileEntity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockDeadBush#c(net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "c", types = {NMSBlock.class})
    public boolean c(NMSBlock block){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockDeadBush#g(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "g", types = {NMSIBlockData.class})
    public NMSMaterialMapColor g(NMSIBlockData iBlockData){
        return new NMSMaterialMapColor(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockDeadBush#getDropType(net.minecraft.server.v1_8_R3.IBlockData, java.util.Random, int)
     */
    @ReflectiveMethod(name = "getDropType", types = {NMSIBlockData.class, Random.class, int.class})
    public NMSItem getDropType(NMSIBlockData iBlockData, Random random, int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, iBlockData, random, i));
    }

}