package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemLeaves")
public class NMSItemLeaves extends NMSItemBlock {

    public NMSItemLeaves(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemLeaves(NMSBlockLeaves blockLeaves){
        super("ItemLeaves", new Object[]{NMSBlockLeaves.class}, new Object[]{blockLeaves});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemLeaves#e_(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "e_", types = {NMSItemStack.class})
    public String e_(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemLeaves#filterData(int)
     */
    @ReflectiveMethod(name = "filterData", types = {int.class})
    public int filterData(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

}