package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import me.vilsol.nmswrapper.wraps.entity.NMSEntityLiving;

@ReflectiveClass(name = "BlockEnchantmentTable")
public class NMSBlockEnchantmentTable extends NMSBlockContainer {

    public NMSBlockEnchantmentTable(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockEnchantmentTable#a(net.minecraft.server.v1_8_R3.World, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, int.class})
    public NMSTileEntity a(NMSWorld world, int i){
        return new NMSTileEntity(NMSWrapper.getInstance().exec(nmsObject, world, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockEnchantmentTable#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public int b(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockEnchantmentTable#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockEnchantmentTable#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockEnchantmentTable#interact(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interact", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityHuman.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interact(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityHuman entityHuman, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityHuman, enumDirection, f, f1, f2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockEnchantmentTable#postPlace(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.EntityLiving, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "postPlace", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityLiving.class, NMSItemStack.class})
    public void postPlace(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityLiving entityLiving, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityLiving, itemStack);
    }

}