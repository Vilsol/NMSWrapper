package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntityFurnace")
public class NMSTileEntityFurnace extends NMSTileEntityContainer implements NMSIWorldInventory {

    public NMSTileEntityFurnace(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#a(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#b(int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class})
    public void b(int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#burn()
     */
    @ReflectiveMethod(name = "burn", types = {})
    public void burn(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#canPlaceItemThroughFace(int, net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.EnumDirection)
     */
    @ReflectiveMethod(name = "canPlaceItemThroughFace", types = {int.class, NMSItemStack.class, NMSEnumDirection.class})
    public boolean canPlaceItemThroughFace(int i, NMSItemStack itemStack, NMSEnumDirection enumDirection){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, itemStack, enumDirection);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#canTakeItemThroughFace(int, net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.EnumDirection)
     */
    @ReflectiveMethod(name = "canTakeItemThroughFace", types = {int.class, NMSItemStack.class, NMSEnumDirection.class})
    public boolean canTakeItemThroughFace(int i, NMSItemStack itemStack, NMSEnumDirection enumDirection){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, itemStack, enumDirection);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#closeContainer(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "closeContainer", types = {NMSEntityHuman.class})
    public void closeContainer(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#createContainer(net.minecraft.server.v1_8_R3.PlayerInventory, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "createContainer", types = {NMSPlayerInventory.class, NMSEntityHuman.class})
    public NMSContainer createContainer(NMSPlayerInventory playerInventory, NMSEntityHuman entityHuman){
        return new NMSContainer(NMSWrapper.getInstance().exec(nmsObject, playerInventory, entityHuman));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#fuelTime(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "fuelTime", types = {NMSItemStack.class})
    public int fuelTime(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public int g(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#getContainerName()
     */
    @ReflectiveMethod(name = "getContainerName", types = {})
    public String getContainerName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#getItem(int)
     */
    @ReflectiveMethod(name = "getItem", types = {int.class})
    public NMSItemStack getItem(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#getMaxStackSize()
     */
    @ReflectiveMethod(name = "getMaxStackSize", types = {})
    public int getMaxStackSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#getProperty(int)
     */
    @ReflectiveMethod(name = "getProperty", types = {int.class})
    public int getProperty(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#getSize()
     */
    @ReflectiveMethod(name = "getSize", types = {})
    public int getSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#hasCustomName()
     */
    @ReflectiveMethod(name = "hasCustomName", types = {})
    public boolean hasCustomName(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#isBurning()
     */
    @ReflectiveMethod(name = "isBurning", types = {})
    public boolean isBurning(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#isFuel(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "isFuel", types = {NMSItemStack.class})
    public boolean isFuel(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public void l(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#onClose(org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity)
     */
    @ReflectiveMethod(name = "onClose", types = {NMSCraftHumanEntity.class})
    public void onClose(NMSCraftHumanEntity craftHumanEntity){
        NMSWrapper.getInstance().exec(nmsObject, craftHumanEntity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#onOpen(org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity)
     */
    @ReflectiveMethod(name = "onOpen", types = {NMSCraftHumanEntity.class})
    public void onOpen(NMSCraftHumanEntity craftHumanEntity){
        NMSWrapper.getInstance().exec(nmsObject, craftHumanEntity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#setItem(int, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "setItem", types = {int.class, NMSItemStack.class})
    public void setItem(int i, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#setMaxStackSize(int)
     */
    @ReflectiveMethod(name = "setMaxStackSize", types = {int.class})
    public void setMaxStackSize(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#splitStack(int, int)
     */
    @ReflectiveMethod(name = "splitStack", types = {int.class, int.class})
    public NMSItemStack splitStack(int i, int i1){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#splitWithoutUpdate(int)
     */
    @ReflectiveMethod(name = "splitWithoutUpdate", types = {int.class})
    public NMSItemStack splitWithoutUpdate(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntityFurnace#startOpen(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "startOpen", types = {NMSEntityHuman.class})
    public void startOpen(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

}