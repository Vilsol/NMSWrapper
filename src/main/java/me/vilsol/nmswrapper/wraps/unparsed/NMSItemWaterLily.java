package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemWaterLily")
public class NMSItemWaterLily extends NMSItemWithAuxData {

    public NMSItemWaterLily(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemWaterLily(NMSBlock block){
        super("ItemWaterLily", new Object[]{NMSBlock.class}, new Object[]{block});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemWaterLily#a(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public NMSItemStack a(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman));
    }

}