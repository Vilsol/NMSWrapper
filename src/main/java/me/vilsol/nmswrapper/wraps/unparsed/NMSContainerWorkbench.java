package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ContainerWorkbench")
public class NMSContainerWorkbench extends NMSContainer {

    public NMSContainerWorkbench(Object nmsObject){
        super(nmsObject);
    }

    public NMSContainerWorkbench(NMSPlayerInventory playerInventory, NMSWorld world, NMSBlockPosition blockPosition){
        super("ContainerWorkbench", new Object[]{NMSPlayerInventory.class, NMSWorld.class, NMSBlockPosition.class}, new Object[]{playerInventory, world, blockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerWorkbench#a(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.Slot)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSSlot.class})
    public boolean a(NMSItemStack itemStack, NMSSlot slot){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, slot);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerWorkbench#b(net.minecraft.server.v1_8_R3.EntityHuman, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class, int.class})
    public NMSItemStack b(NMSEntityHuman entityHuman, int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, entityHuman, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ContainerWorkbench#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return new InventoryView(NMSWrapper.getInstance().exec(nmsObject));
    }

}