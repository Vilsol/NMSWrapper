package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "BlockPressurePlateAbstract")
public class NMSBlockPressurePlateAbstract extends NMSBlock {

    public NMSBlockPressurePlateAbstract(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#a(net.minecraft.server.v1_9_R1.IBlockData, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSIBlockData.class, int.class})
    public NMSIBlockData a(NMSIBlockData iBlockData, int i){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, iBlockData, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#b(net.minecraft.server.v1_9_R1.IBlockAccess, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.EnumDirection)
     */
    @ReflectiveMethod(name = "b", types = {NMSIBlockAccess.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEnumDirection.class})
    public int b(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEnumDirection enumDirection){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition, iBlockData, enumDirection);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#canPlace(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "canPlace", types = {NMSWorld.class, NMSBlockPosition.class})
    public boolean canPlace(NMSWorld world, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#doPhysics(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "doPhysics", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSBlock.class})
    public void doPhysics(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#e(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "e", types = {NMSIBlockData.class})
    public int e(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#f(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "f", types = {NMSWorld.class, NMSBlockPosition.class})
    public int f(NMSWorld world, NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#isPowerSource()
     */
    @ReflectiveMethod(name = "isPowerSource", types = {})
    public boolean isPowerSource(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public void j(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public int k(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#remove(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "remove", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void remove(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockPressurePlateAbstract#updateShape(net.minecraft.server.v1_9_R1.IBlockAccess, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "updateShape", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public void updateShape(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
    }

}