package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemReed")
public class NMSItemReed extends NMSItem {

    public NMSItemReed(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemReed(NMSBlock block){
        super("ItemReed", new Object[]{NMSBlock.class}, new Object[]{block});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemReed#interactWith(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interactWith", types = {NMSItemStack.class, NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interactWith(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, world, blockPosition, enumDirection, f, f1, f2);
    }

}