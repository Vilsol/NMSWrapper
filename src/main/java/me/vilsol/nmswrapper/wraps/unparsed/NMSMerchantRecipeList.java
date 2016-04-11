package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "MerchantRecipeList")
public class NMSMerchantRecipeList extends NMSWrap {

    public NMSMerchantRecipeList(Object nmsObject){
        super(nmsObject);
    }

    public NMSMerchantRecipeList(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSMerchantRecipeList(NMSNBTTagCompound nBTTagCompound){
        super("MerchantRecipeList", new Object[]{NMSNBTTagCompound.class}, new Object[]{nBTTagCompound});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MerchantRecipeList#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSNBTTagCompound a(){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject));
    }

}