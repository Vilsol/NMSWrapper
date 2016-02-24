package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockSlime")
public class NMSBlockSlime extends NMSBlockHalfTransparent {

    public NMSBlockSlime(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockSlime#a(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class, NMSEntity.class})
    public void a(NMSWorld world, NMSBlockPosition blockPosition, NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, entity);
    }

}