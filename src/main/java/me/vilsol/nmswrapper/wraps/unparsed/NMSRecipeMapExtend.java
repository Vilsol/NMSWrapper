package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RecipeMapExtend")
public class NMSRecipeMapExtend extends NMSShapedRecipes {

    public NMSRecipeMapExtend(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RecipeMapExtend#a(net.minecraft.server.v1_8_R3.InventoryCrafting)
     */
    @ReflectiveMethod(name = "a", types = {NMSInventoryCrafting.class})
    public NMSItemStack a(NMSInventoryCrafting inventoryCrafting){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, inventoryCrafting));
    }

}