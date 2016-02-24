package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

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