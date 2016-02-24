package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemWorldMapBase")
public class NMSItemWorldMapBase extends NMSItem {

    public NMSItemWorldMapBase(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemWorldMapBase#c(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public NMSPacket c(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        return new NMSPacket(NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemWorldMapBase#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public boolean f(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}