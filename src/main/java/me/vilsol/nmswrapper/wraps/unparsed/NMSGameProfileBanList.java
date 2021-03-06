package me.vilsol.nmswrapper.wraps.unparsed;

import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.io.File;

@ReflectiveClass(name = "GameProfileBanList")
public class NMSGameProfileBanList extends NMSJsonList {

    public NMSGameProfileBanList(Object nmsObject){
        super(nmsObject);
    }

    public NMSGameProfileBanList(File file){
        super("GameProfileBanList", new Object[]{File.class}, new Object[]{file});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.GameProfileBanList#a(java.lang.Object)
     */
    @ReflectiveMethod(name = "a", types = {Object.class})
    public String a(Object object){
        return (String) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.GameProfileBanList#b(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "b", types = {GameProfile.class})
    public String b(GameProfile gameProfile){
        return (String) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.GameProfileBanList#isBanned(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "isBanned", types = {GameProfile.class})
    public boolean isBanned(GameProfile gameProfile){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

}