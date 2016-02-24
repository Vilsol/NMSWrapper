package me.vilsol.nmswrapper.wraps.unparsed;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "OpListEntry")
public class NMSOpListEntry extends NMSWrap {

    public NMSOpListEntry(Object nmsObject){
        super(nmsObject);
    }

    public NMSOpListEntry(GameProfile gameProfile, int i, boolean b){
        super("OpListEntry", new Object[]{GameProfile.class, int.class, boolean.class}, new Object[]{gameProfile, i, b});
    }

    public NMSOpListEntry(JsonObject jsonObject){
        super("OpListEntry", new Object[]{JsonObject.class}, new Object[]{jsonObject});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.OpListEntry#a(com.google.gson.JsonObject)
     */
    @ReflectiveMethod(name = "a", types = {JsonObject.class})
    public void a(JsonObject jsonObject){
        NMSWrapper.getInstance().exec(nmsObject, jsonObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.OpListEntry#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public boolean b(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}