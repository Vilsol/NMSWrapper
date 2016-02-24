package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Slot")
public class NMSSlot extends NMSWrap {

    public NMSSlot(Object nmsObject){
        super(nmsObject);
    }

    public NMSSlot(NMSIInventory iInventory, int i, int i1, int i2){
        super("Slot", new Object[]{NMSIInventory.class, int.class, int.class, int.class}, new Object[]{iInventory, i, i1, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Slot#a(net.minecraft.server.v1_8_R3.IInventory, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSIInventory.class, int.class})
    public boolean a(NMSIInventory iInventory, int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, iInventory, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Slot#c(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class})
    public void c(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Slot#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public void f(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Slot#getItem()
     */
    @ReflectiveMethod(name = "getItem", types = {})
    public NMSItemStack getItem(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Slot#getMaxStackSize(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "getMaxStackSize", types = {NMSItemStack.class})
    public int getMaxStackSize(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Slot#hasItem()
     */
    @ReflectiveMethod(name = "hasItem", types = {})
    public boolean hasItem(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Slot#isAllowed(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "isAllowed", types = {NMSEntityHuman.class})
    public boolean isAllowed(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Slot#set(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "set", types = {NMSItemStack.class})
    public void set(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

}