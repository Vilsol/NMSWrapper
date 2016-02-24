package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import org.bukkit.inventory.InventoryView;

@ReflectiveClass(name = "ContainerMerchant")
public class NMSContainerMerchant extends NMSContainer {

    public NMSContainerMerchant(Object nmsObject){
        super(nmsObject);
    }

    public NMSContainerMerchant(NMSPlayerInventory playerInventory, NMSIMerchant iMerchant, NMSWorld world){
        super("ContainerMerchant", new Object[]{NMSPlayerInventory.class, NMSIMerchant.class, NMSWorld.class}, new Object[]{playerInventory, iMerchant, world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerMerchant#a(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ContainerMerchant#addSlotListener(net.minecraft.server.v1_8_R3.ICrafting)
     */
    @ReflectiveMethod(name = "addSlotListener", types = {NMSICrafting.class})
    public void addSlotListener(NMSICrafting iCrafting){
        NMSWrapper.getInstance().exec(nmsObject, iCrafting);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerMerchant#b(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class})
    public void b(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerMerchant#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public void d(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerMerchant#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public NMSInventoryMerchant e(){
        return new NMSInventoryMerchant(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ContainerMerchant#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return new InventoryView(NMSWrapper.getInstance().exec(nmsObject));
    }

}