package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "InventoryHorseChest")
public class NMSInventoryHorseChest extends NMSInventorySubcontainer {

    public NMSInventoryHorseChest(Object nmsObject){
        super(nmsObject);
    }

    public NMSInventoryHorseChest(String s, int i){
        super("InventoryHorseChest", new Object[]{String.class, int.class}, new Object[]{s, i});
    }

    public NMSInventoryHorseChest(String s, int i, NMSEntityHorse entityHorse){
        super("InventoryHorseChest", new Object[]{String.class, int.class, NMSEntityHorse.class}, new Object[]{s, i, entityHorse});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InventoryHorseChest#getMaxStackSize()
     */
    @ReflectiveMethod(name = "getMaxStackSize", types = {})
    public int getMaxStackSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InventoryHorseChest#getOwner()
     */
    @ReflectiveMethod(name = "getOwner", types = {})
    public InventoryHolder getOwner(){
        return new InventoryHolder(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InventoryHorseChest#onClose(org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity)
     */
    @ReflectiveMethod(name = "onClose", types = {NMSCraftHumanEntity.class})
    public void onClose(NMSCraftHumanEntity craftHumanEntity){
        NMSWrapper.getInstance().exec(nmsObject, craftHumanEntity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InventoryHorseChest#onOpen(org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity)
     */
    @ReflectiveMethod(name = "onOpen", types = {NMSCraftHumanEntity.class})
    public void onOpen(NMSCraftHumanEntity craftHumanEntity){
        NMSWrapper.getInstance().exec(nmsObject, craftHumanEntity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InventoryHorseChest#setMaxStackSize(int)
     */
    @ReflectiveMethod(name = "setMaxStackSize", types = {int.class})
    public void setMaxStackSize(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

}