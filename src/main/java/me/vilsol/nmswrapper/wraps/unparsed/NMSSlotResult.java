package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "SlotResult")
public class NMSSlotResult extends NMSSlot {

    public NMSSlotResult(Object nmsObject){
        super(nmsObject);
    }

    public NMSSlotResult(NMSEntityHuman entityHuman, NMSInventoryCrafting inventoryCrafting, NMSIInventory iInventory, int i, int i1, int i2){
        super("SlotResult", new Object[]{NMSEntityHuman.class, NMSInventoryCrafting.class, NMSIInventory.class, int.class, int.class, int.class}, new Object[]{entityHuman, inventoryCrafting, iInventory, i, i1, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SlotResult#a(net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class, NMSItemStack.class})
    public void a(NMSEntityHuman entityHuman, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SlotResult#c(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class})
    public void c(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SlotResult#isAllowed(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "isAllowed", types = {NMSItemStack.class})
    public boolean isAllowed(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

}