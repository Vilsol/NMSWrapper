package me.vilsol.nmswrapper.wraps.unparsed;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "WhiteListEntry")
public class NMSWhiteListEntry extends NMSJsonListEntry {

    public NMSWhiteListEntry(Object nmsObject){
        super(nmsObject);
    }

    public NMSWhiteListEntry(GameProfile gameProfile){
        super("WhiteListEntry", new Object[]{GameProfile.class}, new Object[]{gameProfile});
    }

    public NMSWhiteListEntry(JsonObject jsonObject){
        super("WhiteListEntry", new Object[]{JsonObject.class}, new Object[]{jsonObject});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WhiteListEntry#a(com.google.gson.JsonObject)
     */
    @ReflectiveMethod(name = "a", types = {JsonObject.class})
    public void a(JsonObject jsonObject){
        NMSWrapper.getInstance().exec(nmsObject, jsonObject);
    }

}