package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockLeaves2")
public class NMSBlockLeaves2 extends NMSBlockLeaves {

    public NMSBlockLeaves2(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockLeaves2#a(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.TileEntity)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSEntityHuman.class, NMSBlockPosition.class, NMSIBlockData.class, NMSTileEntity.class})
    public void a(NMSWorld world, NMSEntityHuman entityHuman, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSTileEntity tileEntity){
        NMSWrapper.getInstance().exec(nmsObject, world, entityHuman, blockPosition, iBlockData, tileEntity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockLeaves2#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public NMSEnumLogVariant b(int i){
        return new NMSEnumLogVariant(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockLeaves2#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockLeaves2#getDropData(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "getDropData", types = {NMSWorld.class, NMSBlockPosition.class})
    public int getDropData(NMSWorld world, NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockLeaves2#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockLeaves2#i(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "i", types = {NMSIBlockData.class})
    public NMSItemStack i(NMSIBlockData iBlockData){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockLeaves2#toLegacyData(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

}