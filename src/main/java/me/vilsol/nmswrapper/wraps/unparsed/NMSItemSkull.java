package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "ItemSkull")
public class NMSItemSkull extends NMSItem {

    public NMSItemSkull(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemSkull#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public boolean a(NMSNBTTagCompound nBTTagCompound){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemSkull#e_(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "e_", types = {NMSItemStack.class})
    public String e_(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemSkull#filterData(int)
     */
    @ReflectiveMethod(name = "filterData", types = {int.class})
    public int filterData(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemSkull#interactWith(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interactWith", types = {NMSItemStack.class, NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interactWith(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, world, blockPosition, enumDirection, f, f1, f2);
    }

}