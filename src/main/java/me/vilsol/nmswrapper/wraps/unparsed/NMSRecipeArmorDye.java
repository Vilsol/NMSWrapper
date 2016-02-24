package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RecipeArmorDye")
public class NMSRecipeArmorDye extends NMSShapelessRecipes implements NMSIRecipe {

    public NMSRecipeArmorDye(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RecipeArmorDye#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public int a(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RecipeArmorDye#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSItemStack b(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

}