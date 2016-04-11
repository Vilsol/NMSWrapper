package me.vilsol.nmswrapper.wraps.unparsed;

import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.io.File;

@ReflectiveClass(name = "OpList")
public class NMSOpList extends NMSJsonList {

    public NMSOpList(Object nmsObject){
        super(nmsObject);
    }

    public NMSOpList(File file){
        super("OpList", new Object[]{File.class}, new Object[]{file});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.OpList#a(java.lang.Object)
     */
    @ReflectiveMethod(name = "a", types = {Object.class})
    public String a(Object object){
        return (String) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.OpList#b(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "b", types = {GameProfile.class})
    public boolean b(GameProfile gameProfile){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.OpList#c(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "c", types = {GameProfile.class})
    public String c(GameProfile gameProfile){
        return (String) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

}