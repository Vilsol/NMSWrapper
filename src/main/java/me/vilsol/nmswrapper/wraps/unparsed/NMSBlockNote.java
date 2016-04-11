package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockNote")
public class NMSBlockNote extends NMSBlockContainer {

    public NMSBlockNote(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockNote#a(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, int, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, int.class, int.class})
    public boolean a(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockNote#attack(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "attack", types = {NMSWorld.class, NMSBlockPosition.class, NMSEntityHuman.class})
    public void attack(NMSWorld world, NMSBlockPosition blockPosition, NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockNote#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public int b(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockNote#doPhysics(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "doPhysics", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSBlock.class})
    public void doPhysics(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, block);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockNote#interact(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interact", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityHuman.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interact(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityHuman entityHuman, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityHuman, enumDirection, f, f1, f2);
    }

}