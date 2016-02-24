package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "DedicatedPlayerList")
public class NMSDedicatedPlayerList extends NMSPlayerList {

    public NMSDedicatedPlayerList(Object nmsObject){
        super(nmsObject);
    }

    public NMSDedicatedPlayerList(NMSDedicatedServer dedicatedServer){
        super("DedicatedPlayerList", new Object[]{NMSDedicatedServer.class}, new Object[]{dedicatedServer});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DedicatedPlayerList#addOp(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "addOp", types = {GameProfile.class})
    public void addOp(GameProfile gameProfile){
        NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DedicatedPlayerList#addWhitelist(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "addWhitelist", types = {GameProfile.class})
    public void addWhitelist(GameProfile gameProfile){
        NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DedicatedPlayerList#f(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "f", types = {GameProfile.class})
    public boolean f(GameProfile gameProfile){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DedicatedPlayerList#getServer()
     */
    @ReflectiveMethod(name = "getServer", types = {})
    public NMSMinecraftServer getServer(){
        return new NMSMinecraftServer(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DedicatedPlayerList#isWhitelisted(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "isWhitelisted", types = {GameProfile.class})
    public boolean isWhitelisted(GameProfile gameProfile){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DedicatedPlayerList#reloadWhitelist()
     */
    @ReflectiveMethod(name = "reloadWhitelist", types = {})
    public void reloadWhitelist(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DedicatedPlayerList#removeOp(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "removeOp", types = {GameProfile.class})
    public void removeOp(GameProfile gameProfile){
        NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DedicatedPlayerList#removeWhitelist(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "removeWhitelist", types = {GameProfile.class})
    public void removeWhitelist(GameProfile gameProfile){
        NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DedicatedPlayerList#setHasWhitelist(boolean)
     */
    @ReflectiveMethod(name = "setHasWhitelist", types = {boolean.class})
    public void setHasWhitelist(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

}