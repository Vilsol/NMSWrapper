package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.inventory.InventoryView;

@ReflectiveClass(name = "Container")
public class NMSContainer extends NMSWrap {

    public NMSContainer(Object nmsObject){
        super(nmsObject);
    }

    public NMSContainer(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Container#a(net.minecraft.server.v1_9_R1.TileEntity)
     */
    @ReflectiveMethod(name = "a", types = {NMSTileEntity.class})
    public int a(NMSTileEntity tileEntity){
        return (int) NMSWrapper.getInstance().exec(nmsObject, tileEntity);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Container#addSlotListener(net.minecraft.server.v1_9_R1.ICrafting)
     */
    @ReflectiveMethod(name = "addSlotListener", types = {NMSICrafting.class})
    public void addSlotListener(NMSICrafting iCrafting){
        NMSWrapper.getInstance().exec(nmsObject, iCrafting);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Container#b(net.minecraft.server.v1_9_R1.IInventory)
     */
    @ReflectiveMethod(name = "b", types = {NMSIInventory.class})
    public int b(NMSIInventory iInventory){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iInventory);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Container#c(int)
     */
    @ReflectiveMethod(name = "c", types = {int.class})
    public int c(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Container#clickItem(int, int, int, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "clickItem", types = {int.class, int.class, int.class, NMSEntityHuman.class})
    public NMSItemStack clickItem(int i, int i1, int i2, NMSEntityHuman entityHuman){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i, i1, i2, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Container#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Container#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return (InventoryView) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Container#getSlot(int)
     */
    @ReflectiveMethod(name = "getSlot", types = {int.class})
    public NMSSlot getSlot(int i){
        return new NMSSlot(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Container#setItem(int, net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "setItem", types = {int.class, NMSItemStack.class})
    public void setItem(int i, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.Container#transferTo(net.minecraft.server.v1_9_R1.Container, org.bukkit.craftbukkit.v1_9_R1.entity.CraftHumanEntity)
     */
    @ReflectiveMethod(name = "transferTo", types = {NMSContainer.class, NMSCraftHumanEntity.class})
    public void transferTo(NMSContainer container, NMSCraftHumanEntity craftHumanEntity){
        NMSWrapper.getInstance().exec(nmsObject, container, craftHumanEntity);
    }

}