package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import org.bukkit.inventory.InventoryView;

@ReflectiveClass(name = "ContainerHopper")
public class NMSContainerHopper extends NMSContainer {

    public NMSContainerHopper(Object nmsObject){
        super(nmsObject);
    }

    public NMSContainerHopper(NMSPlayerInventory playerInventory, NMSIInventory iInventory, NMSEntityHuman entityHuman){
        super("ContainerHopper", new Object[]{NMSPlayerInventory.class, NMSIInventory.class, NMSEntityHuman.class}, new Object[]{playerInventory, iInventory, entityHuman});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ContainerHopper#a(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ContainerHopper#b(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class})
    public void b(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ContainerHopper#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return (InventoryView) NMSWrapper.getInstance().exec(nmsObject);
    }

}