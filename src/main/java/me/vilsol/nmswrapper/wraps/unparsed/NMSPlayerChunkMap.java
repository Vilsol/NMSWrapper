package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PlayerChunkMap")
public class NMSPlayerChunkMap extends NMSWrap {

    public NMSPlayerChunkMap(Object nmsObject){
        super(nmsObject);
    }

    public NMSPlayerChunkMap(NMSWorldServer worldServer, int i){
        super("PlayerChunkMap", new Object[]{NMSWorldServer.class, int.class}, new Object[]{worldServer, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerChunkMap#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public void a(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerChunkMap#addPlayer(net.minecraft.server.v1_8_R3.EntityPlayer)
     */
    @ReflectiveMethod(name = "addPlayer", types = {NMSEntityPlayer.class})
    public void addPlayer(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerChunkMap#b(net.minecraft.server.v1_8_R3.EntityPlayer)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityPlayer.class})
    public void b(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerChunkMap#flagDirty(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "flagDirty", types = {NMSBlockPosition.class})
    public void flagDirty(NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerChunkMap#flush()
     */
    @ReflectiveMethod(name = "flush", types = {})
    public void flush(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerChunkMap#getFurthestViewableBlock(int)
     */
    @ReflectiveMethod(name = "getFurthestViewableBlock", types = {int.class})
    public int getFurthestViewableBlock(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerChunkMap#isChunkInUse(int, int)
     */
    @ReflectiveMethod(name = "isChunkInUse", types = {int.class, int.class})
    public boolean isChunkInUse(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerChunkMap#movePlayer(net.minecraft.server.v1_8_R3.EntityPlayer)
     */
    @ReflectiveMethod(name = "movePlayer", types = {NMSEntityPlayer.class})
    public void movePlayer(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerChunkMap#removePlayer(net.minecraft.server.v1_8_R3.EntityPlayer)
     */
    @ReflectiveMethod(name = "removePlayer", types = {NMSEntityPlayer.class})
    public void removePlayer(NMSEntityPlayer entityPlayer){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer);
    }

}