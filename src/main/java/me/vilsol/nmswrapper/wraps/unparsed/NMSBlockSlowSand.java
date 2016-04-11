package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockSlowSand")
public class NMSBlockSlowSand extends NMSBlock {

    public NMSBlockSlowSand(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockSlowSand#a(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntity.class})
    public void a(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entity);
    }

}