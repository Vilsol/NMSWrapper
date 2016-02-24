package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GameProfileBanEntry")
public class NMSGameProfileBanEntry extends NMSExpirableListEntry {

    public NMSGameProfileBanEntry(Object nmsObject){
        super(nmsObject);
    }

    public NMSGameProfileBanEntry(GameProfile gameProfile){
        super("GameProfileBanEntry", new Object[]{GameProfile.class}, new Object[]{gameProfile});
    }

    public NMSGameProfileBanEntry(GameProfile gameProfile, Date date, String s, Date date1, String s1){
        super("GameProfileBanEntry", new Object[]{GameProfile.class, Date.class, String.class, Date.class, String.class}, new Object[]{gameProfile, date, s, date1, s1});
    }

    public NMSGameProfileBanEntry(JsonObject jsonObject){
        super("GameProfileBanEntry", new Object[]{JsonObject.class}, new Object[]{jsonObject});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.GameProfileBanEntry#a(com.google.gson.JsonObject)
     */
    @ReflectiveMethod(name = "a", types = {JsonObject.class})
    public void a(JsonObject jsonObject){
        NMSWrapper.getInstance().exec(nmsObject, jsonObject);
    }

}