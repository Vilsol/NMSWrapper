package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.util.Random;

@ReflectiveClass(name = "BlockFluids")
public class NMSBlockFluids extends NMSBlock {

    public NMSBlockFluids(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockFluids#a(net.minecraft.server.v1_9_R1.Material)
     */
    @ReflectiveMethod(name = "a", types = {NMSMaterial.class})
    public NMSBlockFlowing a(NMSMaterial material){
        return new NMSBlockFlowing(NMSWrapper.getInstance().exec(nmsObject, material));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockFluids#b(net.minecraft.server.v1_9_R1.Material)
     */
    @ReflectiveMethod(name = "b", types = {NMSMaterial.class})
    public NMSBlockStationary b(NMSMaterial material){
        return new NMSBlockStationary(NMSWrapper.getInstance().exec(nmsObject, material));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockFluids#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockFluids#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockFluids#doPhysics(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "doPhysics", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSBlock.class})
    public void doPhysics(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockFluids#e(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "e", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public boolean e(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockFluids#f(net.minecraft.server.v1_9_R1.IBlockAccess, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "f", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public int f(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockFluids#fizz(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "fizz", types = {NMSWorld.class, NMSBlockPosition.class})
    public void fizz(NMSWorld world, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockFluids#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockFluids#getDropType(net.minecraft.server.v1_9_R1.IBlockData, java.util.Random, int)
     */
    @ReflectiveMethod(name = "getDropType", types = {NMSIBlockData.class, Random.class, int.class})
    public NMSItem getDropType(NMSIBlockData iBlockData, Random random, int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, iBlockData, random, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockFluids#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockFluids#h(net.minecraft.server.v1_9_R1.IBlockAccess, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "h", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public NMSVec3D h(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockFluids#onPlace(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "onPlace", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void onPlace(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockFluids#toLegacyData(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

}