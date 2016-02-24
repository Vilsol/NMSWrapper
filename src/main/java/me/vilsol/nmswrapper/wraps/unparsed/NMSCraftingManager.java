package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CraftingManager")
public class NMSCraftingManager extends NMSWrap {

    public NMSCraftingManager(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CraftingManager#a(net.minecraft.server.v1_8_R3.IRecipe)
     */
    @ReflectiveMethod(name = "a", types = {NMSIRecipe.class})
    public void a(NMSIRecipe iRecipe){
        NMSWrapper.getInstance().exec(nmsObject, iRecipe);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CraftingManager#craft(net.minecraft.server.v1_8_R3.InventoryCrafting, net.minecraft.server.v1_8_R3.World)
     */
    @ReflectiveMethod(name = "craft", types = {NMSInventoryCrafting.class, NMSWorld.class})
    public NMSItemStack craft(NMSInventoryCrafting inventoryCrafting, NMSWorld world){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, inventoryCrafting, world));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CraftingManager#getInstance()
     */
    @ReflectiveMethod(name = "getInstance", types = {})
    public NMSCraftingManager getInstance(){
        return new NMSCraftingManager(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CraftingManager#registerShapedRecipe(net.minecraft.server.v1_8_R3.ItemStack, java.lang.Object...)
     */
    @ReflectiveMethod(name = "registerShapedRecipe", types = {NMSItemStack.class, Object[].class})
    public NMSShapedRecipes registerShapedRecipe(NMSItemStack itemStack, Object[] array){
        return new NMSShapedRecipes(NMSWrapper.getInstance().exec(nmsObject, itemStack, array));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CraftingManager#registerShapelessRecipe(net.minecraft.server.v1_8_R3.ItemStack, java.lang.Object...)
     */
    @ReflectiveMethod(name = "registerShapelessRecipe", types = {NMSItemStack.class, Object[].class})
    public void registerShapelessRecipe(NMSItemStack itemStack, Object[] array){
        NMSWrapper.getInstance().exec(nmsObject, itemStack, array);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CraftingManager#sort()
     */
    @ReflectiveMethod(name = "sort", types = {})
    public void sort(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}