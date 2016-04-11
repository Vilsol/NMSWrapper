package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "SlotFurnaceFuel")
public class NMSSlotFurnaceFuel extends NMSSlot {

    public NMSSlotFurnaceFuel(Object nmsObject){
        super(nmsObject);
    }

    public NMSSlotFurnaceFuel(NMSIInventory iInventory, int i, int i1, int i2){
        super("SlotFurnaceFuel", new Object[]{NMSIInventory.class, int.class, int.class, int.class}, new Object[]{iInventory, i, i1, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.SlotFurnaceFuel#c_(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "c_", types = {NMSItemStack.class})
    public boolean c_(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.SlotFurnaceFuel#getMaxStackSize(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "getMaxStackSize", types = {NMSItemStack.class})
    public int getMaxStackSize(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.SlotFurnaceFuel#isAllowed(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "isAllowed", types = {NMSItemStack.class})
    public boolean isAllowed(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

}