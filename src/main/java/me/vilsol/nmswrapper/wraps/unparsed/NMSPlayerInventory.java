package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.inventory.InventoryHolder;

@ReflectiveClass(name = "PlayerInventory")
public class NMSPlayerInventory extends NMSWrap implements NMSIInventory {

    public NMSPlayerInventory(Object nmsObject){
        super(nmsObject);
    }

    public NMSPlayerInventory(NMSEntityHuman entityHuman){
        super("PlayerInventory", new Object[]{NMSEntityHuman.class}, new Object[]{entityHuman});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#a(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#b(int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class})
    public void b(int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#c(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class})
    public boolean c(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#canHold(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "canHold", types = {NMSItemStack.class})
    public int canHold(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#closeContainer(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "closeContainer", types = {NMSEntityHuman.class})
    public void closeContainer(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#e(int)
     */
    @ReflectiveMethod(name = "e", types = {int.class})
    public NMSItemStack e(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public int g(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#getCarried()
     */
    @ReflectiveMethod(name = "getCarried", types = {})
    public NMSItemStack getCarried(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#getFirstEmptySlotIndex()
     */
    @ReflectiveMethod(name = "getFirstEmptySlotIndex", types = {})
    public int getFirstEmptySlotIndex(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#getHotbarSize()
     */
    @ReflectiveMethod(name = "getHotbarSize", types = {})
    public int getHotbarSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#getItem(int)
     */
    @ReflectiveMethod(name = "getItem", types = {int.class})
    public NMSItemStack getItem(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#getItemInHand()
     */
    @ReflectiveMethod(name = "getItemInHand", types = {})
    public NMSItemStack getItemInHand(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#getMaxStackSize()
     */
    @ReflectiveMethod(name = "getMaxStackSize", types = {})
    public int getMaxStackSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#getOwner()
     */
    @ReflectiveMethod(name = "getOwner", types = {})
    public InventoryHolder getOwner(){
        return new InventoryHolder(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#getProperty(int)
     */
    @ReflectiveMethod(name = "getProperty", types = {int.class})
    public int getProperty(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#getScoreboardDisplayName()
     */
    @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
    public NMSIChatBaseComponent getScoreboardDisplayName(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#getSize()
     */
    @ReflectiveMethod(name = "getSize", types = {})
    public int getSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#hasCustomName()
     */
    @ReflectiveMethod(name = "hasCustomName", types = {})
    public boolean hasCustomName(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public void k(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public void l(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public int m(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public void n(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#onClose(org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity)
     */
    @ReflectiveMethod(name = "onClose", types = {NMSCraftHumanEntity.class})
    public void onClose(NMSCraftHumanEntity craftHumanEntity){
        NMSWrapper.getInstance().exec(nmsObject, craftHumanEntity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#onOpen(org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity)
     */
    @ReflectiveMethod(name = "onOpen", types = {NMSCraftHumanEntity.class})
    public void onOpen(NMSCraftHumanEntity craftHumanEntity){
        NMSWrapper.getInstance().exec(nmsObject, craftHumanEntity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#pickup(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "pickup", types = {NMSItemStack.class})
    public boolean pickup(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#setCarried(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "setCarried", types = {NMSItemStack.class})
    public void setCarried(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#setItem(int, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "setItem", types = {int.class, NMSItemStack.class})
    public void setItem(int i, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#setMaxStackSize(int)
     */
    @ReflectiveMethod(name = "setMaxStackSize", types = {int.class})
    public void setMaxStackSize(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#splitStack(int, int)
     */
    @ReflectiveMethod(name = "splitStack", types = {int.class, int.class})
    public NMSItemStack splitStack(int i, int i1){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#splitWithoutUpdate(int)
     */
    @ReflectiveMethod(name = "splitWithoutUpdate", types = {int.class})
    public NMSItemStack splitWithoutUpdate(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#startOpen(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "startOpen", types = {NMSEntityHuman.class})
    public void startOpen(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInventory#update()
     */
    @ReflectiveMethod(name = "update", types = {})
    public void update(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}