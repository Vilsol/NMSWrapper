package me.vilsol.nmswrapper.wraps.unparsed;

import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.io.File;

@ReflectiveClass(name = "WhiteList")
public class NMSWhiteList extends NMSJsonList {

    public NMSWhiteList(Object nmsObject){
        super(nmsObject);
    }

    public NMSWhiteList(File file){
        super("WhiteList", new Object[]{File.class}, new Object[]{file});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WhiteList#a(java.lang.Object)
     */
    @ReflectiveMethod(name = "a", types = {Object.class})
    public String a(Object object){
        return (String) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WhiteList#b(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "b", types = {GameProfile.class})
    public String b(GameProfile gameProfile){
        return (String) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WhiteList#isWhitelisted(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "isWhitelisted", types = {GameProfile.class})
    public boolean isWhitelisted(GameProfile gameProfile){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

}