package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

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
     * @see net.minecraft.server.v1_8_R3.OpList#a(java.lang.Object)
     */
    @ReflectiveMethod(name = "a", types = {Object.class})
    public String a(Object object){
        return (String) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.OpList#b(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "b", types = {GameProfile.class})
    public boolean b(GameProfile gameProfile){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.OpList#c(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "c", types = {GameProfile.class})
    public String c(GameProfile gameProfile){
        return (String) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

}