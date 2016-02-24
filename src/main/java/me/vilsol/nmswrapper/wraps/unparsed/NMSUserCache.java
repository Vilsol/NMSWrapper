package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "UserCache")
public class NMSUserCache extends NMSWrap {

    public NMSUserCache(Object nmsObject){
        super(nmsObject);
    }

    public NMSUserCache(NMSMinecraftServer minecraftServer, File file){
        super("UserCache", new Object[]{NMSMinecraftServer.class, File.class}, new Object[]{minecraftServer, file});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.UserCache#a(java.util.UUID)
     */
    @ReflectiveMethod(name = "a", types = {UUID.class})
    public GameProfile a(UUID uUID){
        return new GameProfile(NMSWrapper.getInstance().exec(nmsObject, uUID));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.UserCache#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.UserCache#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.UserCache#getProfile(java.lang.String)
     */
    @ReflectiveMethod(name = "getProfile", types = {String.class})
    public GameProfile getProfile(String s){
        return new GameProfile(NMSWrapper.getInstance().exec(nmsObject, s));
    }

}