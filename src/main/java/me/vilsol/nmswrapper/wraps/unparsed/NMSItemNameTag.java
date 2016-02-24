package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemNameTag")
public class NMSItemNameTag extends NMSItem {

    public NMSItemNameTag(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemNameTag#a(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSEntityHuman.class, NMSEntityLiving.class})
    public boolean a(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSEntityLiving entityLiving){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, entityLiving);
    }

}