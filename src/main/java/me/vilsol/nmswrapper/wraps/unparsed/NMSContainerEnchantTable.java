package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import org.bukkit.inventory.InventoryView;

@ReflectiveClass(name = "ContainerEnchantTable")
public class NMSContainerEnchantTable extends NMSContainer {

    public NMSContainerEnchantTable(Object nmsObject){
        super(nmsObject);
    }

    public NMSContainerEnchantTable(NMSPlayerInventory playerInventory, NMSWorld world, NMSBlockPosition blockPosition){
        super("ContainerEnchantTable", new Object[]{NMSPlayerInventory.class, NMSWorld.class, NMSBlockPosition.class}, new Object[]{playerInventory, world, blockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ContainerEnchantTable#a(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ContainerEnchantTable#addSlotListener(net.minecraft.server.v1_9_R1.ICrafting)
     */
    @ReflectiveMethod(name = "addSlotListener", types = {NMSICrafting.class})
    public void addSlotListener(NMSICrafting iCrafting){
        NMSWrapper.getInstance().exec(nmsObject, iCrafting);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ContainerEnchantTable#b(net.minecraft.server.v1_9_R1.EntityHuman, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class, int.class})
    public NMSItemStack b(NMSEntityHuman entityHuman, int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, entityHuman, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ContainerEnchantTable#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return (InventoryView) NMSWrapper.getInstance().exec(nmsObject);
    }

}