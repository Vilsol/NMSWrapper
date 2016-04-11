package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import org.bukkit.inventory.InventoryView;

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
     * @see net.minecraft.server.v1_9_R1.ContainerWorkbench#a(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.Slot)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSSlot.class})
    public boolean a(NMSItemStack itemStack, NMSSlot slot){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, slot);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ContainerWorkbench#b(net.minecraft.server.v1_9_R1.EntityHuman, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class, int.class})
    public NMSItemStack b(NMSEntityHuman entityHuman, int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, entityHuman, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ContainerWorkbench#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return (InventoryView) NMSWrapper.getInstance().exec(nmsObject);
    }

}