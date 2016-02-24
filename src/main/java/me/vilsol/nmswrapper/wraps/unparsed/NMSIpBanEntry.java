package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "IpBanEntry")
public class NMSIpBanEntry extends NMSExpirableListEntry {

    public NMSIpBanEntry(Object nmsObject){
        super(nmsObject);
    }

    public NMSIpBanEntry(String s){
        super("IpBanEntry", new Object[]{String.class}, new Object[]{s});
    }

    public NMSIpBanEntry(String s, Date date, String s1, Date date1, String s2){
        super("IpBanEntry", new Object[]{String.class, Date.class, String.class, Date.class, String.class}, new Object[]{s, date, s1, date1, s2});
    }

    public NMSIpBanEntry(JsonObject jsonObject){
        super("IpBanEntry", new Object[]{JsonObject.class}, new Object[]{jsonObject});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.IpBanEntry#a(com.google.gson.JsonObject)
     */
    @ReflectiveMethod(name = "a", types = {JsonObject.class})
    public void a(JsonObject jsonObject){
        NMSWrapper.getInstance().exec(nmsObject, jsonObject);
    }

}