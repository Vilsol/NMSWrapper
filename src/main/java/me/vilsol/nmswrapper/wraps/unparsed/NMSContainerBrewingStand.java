package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

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
     * @see net.minecraft.server.v1_8_R3.ContainerBrewingStand#a(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ContainerBrewingStand#addSlotListener(net.minecraft.server.v1_8_R3.ICrafting)
     */
    @ReflectiveMethod(name = "addSlotListener", types = {NMSICrafting.class})
    public void addSlotListener(NMSICrafting iCrafting){
        NMSWrapper.getInstance().exec(nmsObject, iCrafting);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerBrewingStand#b(net.minecraft.server.v1_8_R3.EntityHuman, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class, int.class})
    public NMSItemStack b(NMSEntityHuman entityHuman, int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, entityHuman, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ContainerBrewingStand#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return new InventoryView(NMSWrapper.getInstance().exec(nmsObject));
    }

}