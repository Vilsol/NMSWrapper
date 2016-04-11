package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemSeedFood")
public class NMSItemSeedFood extends NMSItemFood {

    public NMSItemSeedFood(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemSeedFood(int i, float f, NMSBlock block, NMSBlock block1){
        super("ItemSeedFood", new Object[]{int.class, float.class, NMSBlock.class, NMSBlock.class}, new Object[]{i, f, block, block1});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemSeedFood#interactWith(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interactWith", types = {NMSItemStack.class, NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interactWith(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, world, blockPosition, enumDirection, f, f1, f2);
    }

}