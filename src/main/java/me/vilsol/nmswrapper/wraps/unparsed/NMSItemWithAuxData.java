package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemWithAuxData")
public class NMSItemWithAuxData extends NMSItemBlock {

    public NMSItemWithAuxData(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemWithAuxData(NMSBlock block, boolean b){
        super("ItemWithAuxData", new Object[]{NMSBlock.class, boolean.class}, new Object[]{block, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemWithAuxData#e_(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "e_", types = {NMSItemStack.class})
    public String e_(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemWithAuxData#filterData(int)
     */
    @ReflectiveMethod(name = "filterData", types = {int.class})
    public int filterData(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

}