package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import org.bukkit.inventory.InventoryView;

@ReflectiveClass(name = "ContainerPlayer")
public class NMSContainerPlayer extends NMSContainer {

    public NMSContainerPlayer(Object nmsObject){
        super(nmsObject);
    }

    public NMSContainerPlayer(NMSPlayerInventory playerInventory, boolean b, NMSEntityHuman entityHuman){
        super("ContainerPlayer", new Object[]{NMSPlayerInventory.class, boolean.class, NMSEntityHuman.class}, new Object[]{playerInventory, b, entityHuman});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerPlayer#a(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.Slot)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSSlot.class})
    public boolean a(NMSItemStack itemStack, NMSSlot slot){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, slot);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerPlayer#b(net.minecraft.server.v1_8_R3.EntityHuman, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class, int.class})
    public NMSItemStack b(NMSEntityHuman entityHuman, int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, entityHuman, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ContainerPlayer#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return (InventoryView) NMSWrapper.getInstance().exec(nmsObject);
    }

}