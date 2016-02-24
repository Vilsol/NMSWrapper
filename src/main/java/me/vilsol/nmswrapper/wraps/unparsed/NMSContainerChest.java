package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ContainerChest")
public class NMSContainerChest extends NMSContainer {

    public NMSContainerChest(Object nmsObject){
        super(nmsObject);
    }

    public NMSContainerChest(NMSIInventory iInventory, NMSIInventory iInventory1, NMSEntityHuman entityHuman){
        super("ContainerChest", new Object[]{NMSIInventory.class, NMSIInventory.class, NMSEntityHuman.class}, new Object[]{iInventory, iInventory1, entityHuman});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerChest#a(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerChest#b(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class})
    public void b(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerChest#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public NMSIInventory e(){
        return new NMSIInventory(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ContainerChest#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return new InventoryView(NMSWrapper.getInstance().exec(nmsObject));
    }

}