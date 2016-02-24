package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ContainerBeacon")
public class NMSContainerBeacon extends NMSContainer {

    public NMSContainerBeacon(Object nmsObject){
        super(nmsObject);
    }

    public NMSContainerBeacon(NMSIInventory iInventory, NMSIInventory iInventory1){
        super("ContainerBeacon", new Object[]{NMSIInventory.class, NMSIInventory.class}, new Object[]{iInventory, iInventory1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerBeacon#a(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ContainerBeacon#addSlotListener(net.minecraft.server.v1_8_R3.ICrafting)
     */
    @ReflectiveMethod(name = "addSlotListener", types = {NMSICrafting.class})
    public void addSlotListener(NMSICrafting iCrafting){
        NMSWrapper.getInstance().exec(nmsObject, iCrafting);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerBeacon#b(net.minecraft.server.v1_8_R3.EntityHuman, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class, int.class})
    public NMSItemStack b(NMSEntityHuman entityHuman, int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, entityHuman, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerBeacon#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public NMSIInventory e(){
        return new NMSIInventory(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ContainerBeacon#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return new InventoryView(NMSWrapper.getInstance().exec(nmsObject));
    }

}