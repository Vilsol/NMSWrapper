package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockEnderPortal")
public class NMSBlockEnderPortal extends NMSBlockContainer {

    public NMSBlockEnderPortal(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockEnderPortal#a(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntity.class})
    public void a(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockEnderPortal#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockEnderPortal#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockEnderPortal#g(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "g", types = {NMSIBlockData.class})
    public NMSMaterialMapColor g(NMSIBlockData iBlockData){
        return new NMSMaterialMapColor(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockEnderPortal#updateShape(net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "updateShape", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public void updateShape(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
    }

}