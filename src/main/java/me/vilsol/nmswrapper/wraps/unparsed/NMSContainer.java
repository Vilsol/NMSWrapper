package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Container")
public class NMSContainer extends NMSWrap {

    public NMSContainer(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Container#a(net.minecraft.server.v1_8_R3.TileEntity)
     */
    @ReflectiveMethod(name = "a", types = {NMSTileEntity.class})
    public int a(NMSTileEntity tileEntity){
        return (int) NMSWrapper.getInstance().exec(nmsObject, tileEntity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Container#addSlotListener(net.minecraft.server.v1_8_R3.ICrafting)
     */
    @ReflectiveMethod(name = "addSlotListener", types = {NMSICrafting.class})
    public void addSlotListener(NMSICrafting iCrafting){
        NMSWrapper.getInstance().exec(nmsObject, iCrafting);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Container#b(net.minecraft.server.v1_8_R3.IInventory)
     */
    @ReflectiveMethod(name = "b", types = {NMSIInventory.class})
    public int b(NMSIInventory iInventory){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iInventory);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Container#c(int)
     */
    @ReflectiveMethod(name = "c", types = {int.class})
    public int c(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Container#clickItem(int, int, int, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "clickItem", types = {int.class, int.class, int.class, NMSEntityHuman.class})
    public NMSItemStack clickItem(int i, int i1, int i2, NMSEntityHuman entityHuman){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i, i1, i2, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Container#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Container#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return new InventoryView(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Container#getSlot(int)
     */
    @ReflectiveMethod(name = "getSlot", types = {int.class})
    public NMSSlot getSlot(int i){
        return new NMSSlot(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Container#setItem(int, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "setItem", types = {int.class, NMSItemStack.class})
    public void setItem(int i, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Container#transferTo(net.minecraft.server.v1_8_R3.Container, org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity)
     */
    @ReflectiveMethod(name = "transferTo", types = {NMSContainer.class, NMSCraftHumanEntity.class})
    public void transferTo(NMSContainer container, NMSCraftHumanEntity craftHumanEntity){
        NMSWrapper.getInstance().exec(nmsObject, container, craftHumanEntity);
    }

}