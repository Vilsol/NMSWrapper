package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import org.bukkit.inventory.InventoryView;

@ReflectiveClass(name = "ContainerBrewingStand")
public class NMSContainerBrewingStand extends NMSContainer {

    public NMSContainerBrewingStand(Object nmsObject){
        super(nmsObject);
    }

    public NMSContainerBrewingStand(NMSPlayerInventory playerInventory, NMSIInventory iInventory){
        super("ContainerBrewingStand", new Object[]{NMSPlayerInventory.class, NMSIInventory.class}, new Object[]{playerInventory, iInventory});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ContainerBrewingStand#a(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ContainerBrewingStand#addSlotListener(net.minecraft.server.v1_9_R1.ICrafting)
     */
    @ReflectiveMethod(name = "addSlotListener", types = {NMSICrafting.class})
    public void addSlotListener(NMSICrafting iCrafting){
        NMSWrapper.getInstance().exec(nmsObject, iCrafting);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ContainerBrewingStand#b(net.minecraft.server.v1_9_R1.EntityHuman, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class, int.class})
    public NMSItemStack b(NMSEntityHuman entityHuman, int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, entityHuman, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ContainerBrewingStand#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return (InventoryView) NMSWrapper.getInstance().exec(nmsObject);
    }

}