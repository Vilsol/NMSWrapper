package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityTrackerEntry")
public class NMSEntityTrackerEntry extends NMSWrap {

    public NMSEntityTrackerEntry(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityTrackerEntry(NMSEntity entity, int i, int i1, boolean b){
        super("EntityTrackerEntry", new Object[]{NMSEntity.class, int.class, int.class, boolean.class}, new Object[]{entity, i, i1, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityTrackerEntry#a(net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityPlayer.class})
    public void a(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTrackerEntry#broadcast(net.minecraft.server.v1_9_R1.Packet)
     */
    @ReflectiveMethod(name = "broadcast", types = {NMSPacket.class})
    public void broadcast(NMSPacket packet){
        NMSWrapper.getInstance().exec(nmsObject, packet);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTrackerEntry#broadcastIncludingSelf(net.minecraft.server.v1_9_R1.Packet)
     */
    @ReflectiveMethod(name = "broadcastIncludingSelf", types = {NMSPacket.class})
    public void broadcastIncludingSelf(NMSPacket packet){
        NMSWrapper.getInstance().exec(nmsObject, packet);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityTrackerEntry#c(net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "c", types = {NMSEntityPlayer.class})
    public boolean c(NMSEntityPlayer entityPlayer){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTrackerEntry#clear(net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "clear", types = {NMSEntityPlayer.class})
    public void clear(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTrackerEntry#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTrackerEntry#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTrackerEntry#updatePlayer(net.minecraft.server.v1_9_R1.EntityPlayer)
     */
    @ReflectiveMethod(name = "updatePlayer", types = {NMSEntityPlayer.class})
    public void updatePlayer(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

}