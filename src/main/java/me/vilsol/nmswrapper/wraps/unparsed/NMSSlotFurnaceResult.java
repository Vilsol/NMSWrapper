package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "SlotFurnaceResult")
public class NMSSlotFurnaceResult extends NMSSlot {

    public NMSSlotFurnaceResult(Object nmsObject){
        super(nmsObject);
    }

    public NMSSlotFurnaceResult(NMSEntityHuman entityHuman, NMSIInventory iInventory, int i, int i1, int i2){
        super("SlotFurnaceResult", new Object[]{NMSEntityHuman.class, NMSIInventory.class, int.class, int.class, int.class}, new Object[]{entityHuman, iInventory, i, i1, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.SlotFurnaceResult#a(net.minecraft.server.v1_9_R1.ItemStack, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, int.class})
    public void a(NMSItemStack itemStack, int i){
        NMSWrapper.getInstance().exec(nmsObject, itemStack, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.SlotFurnaceResult#c(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class})
    public void c(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.SlotFurnaceResult#isAllowed(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "isAllowed", types = {NMSItemStack.class})
    public boolean isAllowed(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

}