package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "BlockMinecartDetector")
public class NMSBlockMinecartDetector extends NMSBlockMinecartTrackAbstract {

    public NMSBlockMinecartDetector(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockMinecartDetector#a(net.minecraft.server.v1_9_R1.IBlockAccess, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.EnumDirection)
     */
    @ReflectiveMethod(name = "a", types = {NMSIBlockAccess.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEnumDirection.class})
    public int a(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEnumDirection enumDirection){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition, iBlockData, enumDirection);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockMinecartDetector#b(net.minecraft.server.v1_9_R1.IBlockAccess, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.EnumDirection)
     */
    @ReflectiveMethod(name = "b", types = {NMSIBlockAccess.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEnumDirection.class})
    public int b(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEnumDirection enumDirection){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition, iBlockData, enumDirection);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockMinecartDetector#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockMinecartDetector#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockMinecartDetector#isComplexRedstone()
     */
    @ReflectiveMethod(name = "isComplexRedstone", types = {})
    public boolean isComplexRedstone(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockMinecartDetector#isPowerSource()
     */
    @ReflectiveMethod(name = "isPowerSource", types = {})
    public boolean isPowerSource(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockMinecartDetector#l(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "l", types = {NMSWorld.class, NMSBlockPosition.class})
    public int l(NMSWorld world, NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockMinecartDetector#onPlace(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "onPlace", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void onPlace(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockMinecartDetector#toLegacyData(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

}