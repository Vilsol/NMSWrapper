package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RecipesFurnace")
public class NMSRecipesFurnace extends NMSWrap {

    public NMSRecipesFurnace(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.RecipesFurnace#a(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.ItemStack, float)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSItemStack.class, float.class})
    public void a(NMSItemStack itemStack, NMSItemStack itemStack1, float f){
        NMSWrapper.getInstance().exec(nmsObject, itemStack, itemStack1, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.RecipesFurnace#b(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "b", types = {NMSItemStack.class})
    public float b(NMSItemStack itemStack){
        return (float) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.RecipesFurnace#getInstance()
     */
    @ReflectiveMethod(name = "getInstance", types = {})
    public NMSRecipesFurnace getInstance(){
        return new NMSRecipesFurnace(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.RecipesFurnace#getResult(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "getResult", types = {NMSItemStack.class})
    public NMSItemStack getResult(NMSItemStack itemStack){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, itemStack));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.RecipesFurnace#registerRecipe(net.minecraft.server.v1_9_R1.Block, net.minecraft.server.v1_9_R1.ItemStack, float)
     */
    @ReflectiveMethod(name = "registerRecipe", types = {NMSBlock.class, NMSItemStack.class, float.class})
    public void registerRecipe(NMSBlock block, NMSItemStack itemStack, float f){
        NMSWrapper.getInstance().exec(nmsObject, block, itemStack, f);
    }

}