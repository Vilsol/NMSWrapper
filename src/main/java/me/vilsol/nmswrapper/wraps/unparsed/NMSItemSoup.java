package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemSoup")
public class NMSItemSoup extends NMSItemFood {

    public NMSItemSoup(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemSoup(int i){
        super("ItemSoup", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemSoup#b(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "b", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public NMSItemStack b(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman));
    }

}