package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemAxe")
public class NMSItemAxe extends NMSItemTool {

    public NMSItemAxe(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemAxe#getDestroySpeed(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "getDestroySpeed", types = {NMSItemStack.class, NMSBlock.class})
    public float getDestroySpeed(NMSItemStack itemStack, NMSBlock block){
        return (float) NMSWrapper.getInstance().exec(nmsObject, itemStack, block);
    }

}