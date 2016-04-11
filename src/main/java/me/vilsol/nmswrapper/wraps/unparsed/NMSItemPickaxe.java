package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemPickaxe")
public class NMSItemPickaxe extends NMSItemTool {

    public NMSItemPickaxe(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemPickaxe#canDestroySpecialBlock(net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "canDestroySpecialBlock", types = {NMSBlock.class})
    public boolean canDestroySpecialBlock(NMSBlock block){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemPickaxe#getDestroySpeed(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "getDestroySpeed", types = {NMSItemStack.class, NMSBlock.class})
    public float getDestroySpeed(NMSItemStack itemStack, NMSBlock block){
        return (float) NMSWrapper.getInstance().exec(nmsObject, itemStack, block);
    }

}