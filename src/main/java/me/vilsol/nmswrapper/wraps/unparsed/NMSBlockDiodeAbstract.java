package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockDiodeAbstract")
public class NMSBlockDiodeAbstract extends NMSBlockDirectional {

    public NMSBlockDiodeAbstract(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockDiodeAbstract(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#a(net.minecraft.server.v1_9_R1.IBlockAccess, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "a", types = {NMSIBlockAccess.class, NMSBlockPosition.class, NMSIBlockData.class})
    public int a(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#b(net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "b", types = {NMSBlock.class})
    public boolean b(NMSBlock block){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#c(net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "c", types = {NMSBlock.class})
    public boolean c(NMSBlock block){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#canPlace(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "canPlace", types = {NMSWorld.class, NMSBlockPosition.class})
    public boolean canPlace(NMSWorld world, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#d(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "d", types = {NMSIBlockData.class})
    public int d(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#doPhysics(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "doPhysics", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSBlock.class})
    public void doPhysics(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#e(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "e", types = {NMSIBlockData.class})
    public NMSIBlockData e(NMSIBlockData iBlockData){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#f(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "f", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public int f(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#g(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "g", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void g(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#getPlacedState(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.EnumDirection, float, float, float, int, net.minecraft.server.v1_9_R1.EntityLiving)
     */
    @ReflectiveMethod(name = "getPlacedState", types = {NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class, int.class, NMSEntityLiving.class})
    public NMSIBlockData getPlacedState(NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2, int i, NMSEntityLiving entityLiving){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, enumDirection, f, f1, f2, i, entityLiving));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#h(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "h", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void h(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#i(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "i", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public boolean i(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#isPowerSource()
     */
    @ReflectiveMethod(name = "isPowerSource", types = {})
    public boolean isPowerSource(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#k(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "k", types = {NMSIBlockData.class})
    public NMSIBlockData k(NMSIBlockData iBlockData){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#l(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "l", types = {NMSIBlockData.class})
    public boolean l(NMSIBlockData iBlockData){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#m(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "m", types = {NMSIBlockData.class})
    public int m(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#onPlace(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "onPlace", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void onPlace(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#postBreak(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "postBreak", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void postBreak(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockDiodeAbstract#postPlace(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.EntityLiving, net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "postPlace", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityLiving.class, NMSItemStack.class})
    public void postPlace(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityLiving entityLiving, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityLiving, itemStack);
    }

}