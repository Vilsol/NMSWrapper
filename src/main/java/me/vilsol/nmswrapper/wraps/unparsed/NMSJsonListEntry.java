package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "JsonListEntry")
public class NMSJsonListEntry extends NMSWrap {

    public NMSJsonListEntry(Object nmsObject){
        super(nmsObject);
    }

    public NMSJsonListEntry(T t){
        super("JsonListEntry", new Object[]{T.class}, new Object[]{t});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.JsonListEntry#a(com.google.gson.JsonObject)
     */
    @ReflectiveMethod(name = "a", types = {JsonObject.class})
    public void a(JsonObject jsonObject){
        NMSWrapper.getInstance().exec(nmsObject, jsonObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.JsonListEntry#getKey()
     */
    @ReflectiveMethod(name = "getKey", types = {})
    public T getKey(){
        return new T(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.JsonListEntry#hasExpired()
     */
    @ReflectiveMethod(name = "hasExpired", types = {})
    public boolean hasExpired(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}