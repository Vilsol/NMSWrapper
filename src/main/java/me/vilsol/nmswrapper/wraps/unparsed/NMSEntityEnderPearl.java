package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.entity.NMSEntityLiving;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "EntityEnderPearl")
public class NMSEntityEnderPearl extends NMSEntityProjectile {

    public NMSEntityEnderPearl(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityEnderPearl(NMSWorld world){
        super("EntityEnderPearl", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityEnderPearl(NMSWorld world, NMSEntityLiving entityLiving){
        super("EntityEnderPearl", new Object[]{NMSWorld.class, NMSEntityLiving.class}, new Object[]{world, entityLiving});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityEnderPearl#a(net.minecraft.server.v1_8_R3.MovingObjectPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSMovingObjectPosition.class})
    public void a(NMSMovingObjectPosition movingObjectPosition){
        NMSWrapper.getInstance().exec(nmsObject, movingObjectPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityEnderPearl#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}