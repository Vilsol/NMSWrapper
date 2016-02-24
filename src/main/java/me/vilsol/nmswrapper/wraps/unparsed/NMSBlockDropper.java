package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockDropper")
public class NMSBlockDropper extends NMSBlockDispenser {

    public NMSBlockDropper(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockDropper#a(net.minecraft.server.v1_8_R3.World, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, int.class})
    public NMSTileEntity a(NMSWorld world, int i){
        return new NMSTileEntity(NMSWrapper.getInstance().exec(nmsObject, world, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockDropper#dispense(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "dispense", types = {NMSWorld.class, NMSBlockPosition.class})
    public void dispense(NMSWorld world, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

}