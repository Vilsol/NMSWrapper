package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChatDeserializer")
public class NMSChatDeserializer extends NMSWrap {

    public NMSChatDeserializer(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatDeserializer#a(com.google.gson.JsonObject, java.lang.String, int)
     */
    @ReflectiveMethod(name = "a", types = {JsonObject.class, String.class, int.class})
    public int a(JsonObject jsonObject, String s, int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, jsonObject, s, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatDeserializer#b(com.google.gson.JsonElement, java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {JsonElement.class, String.class})
    public boolean b(JsonElement jsonElement, String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, jsonElement, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatDeserializer#d(com.google.gson.JsonElement)
     */
    @ReflectiveMethod(name = "d", types = {JsonElement.class})
    public String d(JsonElement jsonElement){
        return (String) NMSWrapper.getInstance().exec(nmsObject, jsonElement);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatDeserializer#f(com.google.gson.JsonElement, java.lang.String)
     */
    @ReflectiveMethod(name = "f", types = {JsonElement.class, String.class})
    public int f(JsonElement jsonElement, String s){
        return (int) NMSWrapper.getInstance().exec(nmsObject, jsonElement, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatDeserializer#g(com.google.gson.JsonObject, java.lang.String)
     */
    @ReflectiveMethod(name = "g", types = {JsonObject.class, String.class})
    public boolean g(JsonObject jsonObject, String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, jsonObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatDeserializer#h(com.google.gson.JsonObject, java.lang.String)
     */
    @ReflectiveMethod(name = "h", types = {JsonObject.class, String.class})
    public String h(JsonObject jsonObject, String s){
        return (String) NMSWrapper.getInstance().exec(nmsObject, jsonObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatDeserializer#l(com.google.gson.JsonElement, java.lang.String)
     */
    @ReflectiveMethod(name = "l", types = {JsonElement.class, String.class})
    public JsonObject l(JsonElement jsonElement, String s){
        return new JsonObject(NMSWrapper.getInstance().exec(nmsObject, jsonElement, s));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatDeserializer#m(com.google.gson.JsonElement, java.lang.String)
     */
    @ReflectiveMethod(name = "m", types = {JsonElement.class, String.class})
    public JsonArray m(JsonElement jsonElement, String s){
        return new JsonArray(NMSWrapper.getInstance().exec(nmsObject, jsonElement, s));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ChatDeserializer#t(com.google.gson.JsonObject, java.lang.String)
     */
    @ReflectiveMethod(name = "t", types = {JsonObject.class, String.class})
    public JsonArray t(JsonObject jsonObject, String s){
        return new JsonArray(NMSWrapper.getInstance().exec(nmsObject, jsonObject, s));
    }

}