package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RecipesArmor")
public class NMSRecipesArmor extends NMSWrap {

    public NMSRecipesArmor(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RecipesArmor#a(net.minecraft.server.v1_8_R3.CraftingManager)
     */
    @ReflectiveMethod(name = "a", types = {NMSCraftingManager.class})
    public void a(NMSCraftingManager craftingManager){
        NMSWrapper.getInstance().exec(nmsObject, craftingManager);
    }

}