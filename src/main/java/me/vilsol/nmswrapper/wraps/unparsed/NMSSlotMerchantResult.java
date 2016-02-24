package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "SlotMerchantResult")
public class NMSSlotMerchantResult extends NMSSlot {

    public NMSSlotMerchantResult(Object nmsObject){
        super(nmsObject);
    }

    public NMSSlotMerchantResult(NMSEntityHuman entityHuman, NMSIMerchant iMerchant, NMSInventoryMerchant inventoryMerchant, int i, int i1, int i2){
        super("SlotMerchantResult", new Object[]{NMSEntityHuman.class, NMSIMerchant.class, NMSInventoryMerchant.class, int.class, int.class, int.class}, new Object[]{entityHuman, iMerchant, inventoryMerchant, i, i1, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SlotMerchantResult#a(net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class, NMSItemStack.class})
    public void a(NMSEntityHuman entityHuman, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SlotMerchantResult#c(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class})
    public void c(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SlotMerchantResult#isAllowed(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "isAllowed", types = {NMSItemStack.class})
    public boolean isAllowed(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

}