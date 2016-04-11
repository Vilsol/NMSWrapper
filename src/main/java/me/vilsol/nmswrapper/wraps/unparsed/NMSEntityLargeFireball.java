package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityLargeFireball")
public class NMSEntityLargeFireball extends NMSEntityFireball {

    public NMSEntityLargeFireball(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityLargeFireball(NMSWorld world){
        super("EntityLargeFireball", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityLargeFireball(NMSWorld world, NMSEntityLiving entityLiving, double d, double d1, double d2){
        super("EntityLargeFireball", new Object[]{NMSWorld.class, NMSEntityLiving.class, double.class, double.class, double.class}, new Object[]{world, entityLiving, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLargeFireball#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityLargeFireball#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

}