package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import org.bukkit.inventory.InventoryView;

@ReflectiveClass(name = "ContainerHorse")
public class NMSContainerHorse extends NMSContainer {

    public NMSContainerHorse(Object nmsObject){
        super(nmsObject);
    }

    public NMSContainerHorse(NMSIInventory iInventory, NMSIInventory iInventory1, NMSEntityHorse entityHorse, NMSEntityHuman entityHuman){
        super("ContainerHorse", new Object[]{NMSIInventory.class, NMSIInventory.class, NMSEntityHorse.class, NMSEntityHuman.class}, new Object[]{iInventory, iInventory1, entityHorse, entityHuman});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ContainerHorse#a(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ContainerHorse#b(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class})
    public void b(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ContainerHorse#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return (InventoryView) NMSWrapper.getInstance().exec(nmsObject);
    }

}