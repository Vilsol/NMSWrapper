package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSEntity;

@ReflectiveClass(name = "EntityTracker")
public class NMSEntityTracker extends NMSWrap {

    public NMSEntityTracker(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityTracker(NMSWorldServer worldServer){
        super("EntityTracker", new Object[]{NMSWorldServer.class}, new Object[]{worldServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityTracker#a(net.minecraft.server.v1_8_R3.EntityPlayer, net.minecraft.server.v1_8_R3.Chunk)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityPlayer.class, NMSChunk.class})
    public void a(NMSEntityPlayer entityPlayer, NMSChunk chunk){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer, chunk);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityTracker#addEntity(net.minecraft.server.v1_8_R3.Entity, int, int, boolean)
     */
    @ReflectiveMethod(name = "addEntity", types = {NMSEntity.class, int.class, int.class, boolean.class})
    public void addEntity(NMSEntity entity, int i, int i1, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, entity, i, i1, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityTracker#sendPacketToEntity(net.minecraft.server.v1_8_R3.Entity, net.minecraft.server.v1_8_R3.Packet)
     */
    @ReflectiveMethod(name = "sendPacketToEntity", types = {NMSEntity.class, NMSPacket.class})
    public void sendPacketToEntity(NMSEntity entity, NMSPacket packet){
        NMSWrapper.getInstance().exec(nmsObject, entity, packet);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityTracker#track(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "track", types = {NMSEntity.class})
    public void track(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityTracker#untrackEntity(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "untrackEntity", types = {NMSEntity.class})
    public void untrackEntity(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityTracker#untrackPlayer(net.minecraft.server.v1_8_R3.EntityPlayer)
     */
    @ReflectiveMethod(name = "untrackPlayer", types = {NMSEntityPlayer.class})
    public void untrackPlayer(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityTracker#updatePlayers()
     */
    @ReflectiveMethod(name = "updatePlayers", types = {})
    public void updatePlayers(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}