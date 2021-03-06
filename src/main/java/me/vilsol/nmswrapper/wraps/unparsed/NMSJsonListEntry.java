package me.vilsol.nmswrapper.wraps.unparsed;

import com.google.gson.JsonObject;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "JsonListEntry")
public class NMSJsonListEntry extends NMSWrap {

    public NMSJsonListEntry(Object nmsObject){
        super(nmsObject);
    }

    public NMSJsonListEntry(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.JsonListEntry#a(com.google.gson.JsonObject)
     */
    @ReflectiveMethod(name = "a", types = {JsonObject.class})
    public void a(JsonObject jsonObject){
        NMSWrapper.getInstance().exec(nmsObject, jsonObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.JsonListEntry#getKey()
     */
    @ReflectiveMethod(name = "getKey", types = {})
    public Object getKey(){
        return NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.JsonListEntry#hasExpired()
     */
    @ReflectiveMethod(name = "hasExpired", types = {})
    public boolean hasExpired(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}