package me.vilsol.nmswrapper.wraps.unparsed;

import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.io.File;
import java.util.UUID;

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
     * @see net.minecraft.server.v1_9_R1.UserCache#a(java.util.UUID)
     */
    @ReflectiveMethod(name = "a", types = {UUID.class})
    public GameProfile a(UUID uUID){
        return (GameProfile) NMSWrapper.getInstance().exec(nmsObject, uUID);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.UserCache#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.UserCache#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.UserCache#getProfile(java.lang.String)
     */
    @ReflectiveMethod(name = "getProfile", types = {String.class})
    public GameProfile getProfile(String s){
        return (GameProfile) NMSWrapper.getInstance().exec(nmsObject, s);
    }

}