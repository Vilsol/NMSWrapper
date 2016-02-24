package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MerchantRecipeList")
public class NMSMerchantRecipeList extends ArrayList {

    public NMSMerchantRecipeList(Object nmsObject){
        super(nmsObject);
    }

    public NMSMerchantRecipeList(NMSNBTTagCompound nBTTagCompound){
        super("MerchantRecipeList", new Object[]{NMSNBTTagCompound.class}, new Object[]{nBTTagCompound});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MerchantRecipeList#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSNBTTagCompound a(){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject));
    }

}