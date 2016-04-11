package me.vilsol.nmswrapper.wraps.unparsed;

import com.avaje.ebean.text.json.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "ChatDeserializer")
public class NMSChatDeserializer extends NMSWrap {

    public NMSChatDeserializer(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatDeserializer#a(com.google.gson.JsonObject, java.lang.String, int)
     */
    @ReflectiveMethod(name = "a", types = {JsonObject.class, String.class, int.class})
    public int a(JsonObject jsonObject, String s, int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, jsonObject, s, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatDeserializer#b(com.google.gson.JsonElement, java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {JsonElement.class, String.class})
    public boolean b(JsonElement jsonElement, String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, jsonElement, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatDeserializer#d(com.google.gson.JsonElement)
     */
    @ReflectiveMethod(name = "d", types = {JsonElement.class})
    public String d(JsonElement jsonElement){
        return (String) NMSWrapper.getInstance().exec(nmsObject, jsonElement);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatDeserializer#f(com.google.gson.JsonElement, java.lang.String)
     */
    @ReflectiveMethod(name = "f", types = {JsonElement.class, String.class})
    public int f(JsonElement jsonElement, String s){
        return (int) NMSWrapper.getInstance().exec(nmsObject, jsonElement, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatDeserializer#g(com.google.gson.JsonObject, java.lang.String)
     */
    @ReflectiveMethod(name = "g", types = {JsonObject.class, String.class})
    public boolean g(JsonObject jsonObject, String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, jsonObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatDeserializer#h(com.google.gson.JsonObject, java.lang.String)
     */
    @ReflectiveMethod(name = "h", types = {JsonObject.class, String.class})
    public String h(JsonObject jsonObject, String s){
        return (String) NMSWrapper.getInstance().exec(nmsObject, jsonObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatDeserializer#l(com.google.gson.JsonElement, java.lang.String)
     */
    @ReflectiveMethod(name = "l", types = {JsonElement.class, String.class})
    public JsonObject l(JsonElement jsonElement, String s){
        return (JsonObject) NMSWrapper.getInstance().exec(nmsObject, jsonElement, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatDeserializer#m(com.google.gson.JsonElement, java.lang.String)
     */
    @ReflectiveMethod(name = "m", types = {JsonElement.class, String.class})
    public JsonArray m(JsonElement jsonElement, String s){
        return (JsonArray) NMSWrapper.getInstance().exec(nmsObject, jsonElement, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatDeserializer#t(com.google.gson.JsonObject, java.lang.String)
     */
    @ReflectiveMethod(name = "t", types = {JsonObject.class, String.class})
    public JsonArray t(JsonObject jsonObject, String s){
        return (JsonArray) NMSWrapper.getInstance().exec(nmsObject, jsonObject, s);
    }

}