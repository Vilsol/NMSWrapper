package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import org.bukkit.inventory.InventoryView;

@ReflectiveClass(name = "ContainerAnvil")
public class NMSContainerAnvil extends NMSContainer {

    public NMSContainerAnvil(Object nmsObject){
        super(nmsObject);
    }

    public NMSContainerAnvil(NMSPlayerInventory playerInventory, NMSWorld world, NMSBlockPosition blockPosition, NMSEntityHuman entityHuman){
        super("ContainerAnvil", new Object[]{NMSPlayerInventory.class, NMSWorld.class, NMSBlockPosition.class, NMSEntityHuman.class}, new Object[]{playerInventory, world, blockPosition, entityHuman});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerAnvil#a(java.lang.String)
     */
    @ReflectiveMethod(name = "a", types = {String.class})
    public void a(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ContainerAnvil#addSlotListener(net.minecraft.server.v1_8_R3.ICrafting)
     */
    @ReflectiveMethod(name = "addSlotListener", types = {NMSICrafting.class})
    public void addSlotListener(NMSICrafting iCrafting){
        NMSWrapper.getInstance().exec(nmsObject, iCrafting);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerAnvil#b(net.minecraft.server.v1_8_R3.EntityHuman, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class, int.class})
    public NMSItemStack b(NMSEntityHuman entityHuman, int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, entityHuman, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ContainerAnvil#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public void e(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ContainerAnvil#getBukkitView()
     */
    @ReflectiveMethod(name = "getBukkitView", types = {})
    public InventoryView getBukkitView(){
        return (InventoryView) NMSWrapper.getInstance().exec(nmsObject);
    }

}