package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntityBrewingStand")
public class NMSTileEntityBrewingStand extends NMSTileEntityContainer implements NMSIWorldInventory {

    public NMSTileEntityBrewingStand(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#a(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#b(int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class})
    public void b(int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#canPlaceItemThroughFace(int, net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.EnumDirection)
     */
    @ReflectiveMethod(name = "canPlaceItemThroughFace", types = {int.class, NMSItemStack.class, NMSEnumDirection.class})
    public boolean canPlaceItemThroughFace(int i, NMSItemStack itemStack, NMSEnumDirection enumDirection){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, itemStack, enumDirection);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#canTakeItemThroughFace(int, net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.EnumDirection)
     */
    @ReflectiveMethod(name = "canTakeItemThroughFace", types = {int.class, NMSItemStack.class, NMSEnumDirection.class})
    public boolean canTakeItemThroughFace(int i, NMSItemStack itemStack, NMSEnumDirection enumDirection){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, itemStack, enumDirection);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#closeContainer(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "closeContainer", types = {NMSEntityHuman.class})
    public void closeContainer(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#createContainer(net.minecraft.server.v1_8_R3.PlayerInventory, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "createContainer", types = {NMSPlayerInventory.class, NMSEntityHuman.class})
    public NMSContainer createContainer(NMSPlayerInventory playerInventory, NMSEntityHuman entityHuman){
        return new NMSContainer(NMSWrapper.getInstance().exec(nmsObject, playerInventory, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public int g(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#getContainerName()
     */
    @ReflectiveMethod(name = "getContainerName", types = {})
    public String getContainerName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#getItem(int)
     */
    @ReflectiveMethod(name = "getItem", types = {int.class})
    public NMSItemStack getItem(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#getMaxStackSize()
     */
    @ReflectiveMethod(name = "getMaxStackSize", types = {})
    public int getMaxStackSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#getProperty(int)
     */
    @ReflectiveMethod(name = "getProperty", types = {int.class})
    public int getProperty(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#getSize()
     */
    @ReflectiveMethod(name = "getSize", types = {})
    public int getSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#hasCustomName()
     */
    @ReflectiveMethod(name = "hasCustomName", types = {})
    public boolean hasCustomName(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public void l(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#onClose(org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity)
     */
    @ReflectiveMethod(name = "onClose", types = {NMSCraftHumanEntity.class})
    public void onClose(NMSCraftHumanEntity craftHumanEntity){
        NMSWrapper.getInstance().exec(nmsObject, craftHumanEntity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#onOpen(org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity)
     */
    @ReflectiveMethod(name = "onOpen", types = {NMSCraftHumanEntity.class})
    public void onOpen(NMSCraftHumanEntity craftHumanEntity){
        NMSWrapper.getInstance().exec(nmsObject, craftHumanEntity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#setItem(int, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "setItem", types = {int.class, NMSItemStack.class})
    public void setItem(int i, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#setMaxStackSize(int)
     */
    @ReflectiveMethod(name = "setMaxStackSize", types = {int.class})
    public void setMaxStackSize(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#splitStack(int, int)
     */
    @ReflectiveMethod(name = "splitStack", types = {int.class, int.class})
    public NMSItemStack splitStack(int i, int i1){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#splitWithoutUpdate(int)
     */
    @ReflectiveMethod(name = "splitWithoutUpdate", types = {int.class})
    public NMSItemStack splitWithoutUpdate(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityBrewingStand#startOpen(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "startOpen", types = {NMSEntityHuman.class})
    public void startOpen(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

}