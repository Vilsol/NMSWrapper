package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockRepeater")
public class NMSBlockRepeater extends NMSBlockDiodeAbstract {

    public NMSBlockRepeater(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#b(net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "b", types = {NMSIBlockAccess.class, NMSBlockPosition.class, NMSIBlockData.class})
    public boolean b(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#c(net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "c", types = {NMSBlock.class})
    public boolean c(NMSBlock block){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#d(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "d", types = {NMSIBlockData.class})
    public int d(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#e(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "e", types = {NMSIBlockData.class})
    public NMSIBlockData e(NMSIBlockData iBlockData){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#getDropType(net.minecraft.server.v1_8_R3.IBlockData, java.util.Random, int)
     */
    @ReflectiveMethod(name = "getDropType", types = {NMSIBlockData.class, Random.class, int.class})
    public NMSItem getDropType(NMSIBlockData iBlockData, Random random, int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, iBlockData, random, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#interact(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interact", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityHuman.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interact(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityHuman entityHuman, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityHuman, enumDirection, f, f1, f2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#k(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "k", types = {NMSIBlockData.class})
    public NMSIBlockData k(NMSIBlockData iBlockData){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#remove(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "remove", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void remove(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockRepeater#updateState(net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "updateState", types = {NMSIBlockData.class, NMSIBlockAccess.class, NMSBlockPosition.class})
    public NMSIBlockData updateState(NMSIBlockData iBlockData, NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, iBlockData, iBlockAccess, blockPosition));
    }

}