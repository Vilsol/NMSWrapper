package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemCloth")
public class NMSItemCloth extends NMSItemBlock {

    public NMSItemCloth(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemCloth(NMSBlock block){
        super("ItemCloth", new Object[]{NMSBlock.class}, new Object[]{block});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemCloth#e_(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "e_", types = {NMSItemStack.class})
    public String e_(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemCloth#filterData(int)
     */
    @ReflectiveMethod(name = "filterData", types = {int.class})
    public int filterData(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

}