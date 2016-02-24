package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RecipesBanner")
public class NMSRecipesBanner extends NMSWrap {

    public NMSRecipesBanner(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RecipesBanner#a(net.minecraft.server.v1_8_R3.CraftingManager)
     */
    @ReflectiveMethod(name = "a", types = {NMSCraftingManager.class})
    public void a(NMSCraftingManager craftingManager){
        NMSWrapper.getInstance().exec(nmsObject, craftingManager);
    }

}