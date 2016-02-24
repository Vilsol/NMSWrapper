package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemSaddle")
public class NMSItemSaddle extends NMSItem {

    public NMSItemSaddle(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemSaddle#a(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.EntityLiving, net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSEntityLiving.class, NMSEntityLiving.class})
    public boolean a(NMSItemStack itemStack, NMSEntityLiving entityLiving, NMSEntityLiving entityLiving1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityLiving, entityLiving1);
    }

}