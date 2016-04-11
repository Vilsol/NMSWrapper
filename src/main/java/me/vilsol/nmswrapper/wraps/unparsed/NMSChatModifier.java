package me.vilsol.nmswrapper.wraps.unparsed;

import com.avaje.ebean.text.json.JsonElement;
import com.google.gson.JsonSerializationContext;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.lang.reflect.Type;

@ReflectiveClass(name = "ChatModifier")
public class NMSChatModifier extends NMSWrap {

    public NMSChatModifier(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#clone()
     */
    @ReflectiveMethod(name = "clone", types = {})
    public NMSChatModifier clone(){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatModifier#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#getColor()
     */
    @ReflectiveMethod(name = "getColor", types = {})
    public NMSEnumChatFormat getColor(){
        return new NMSEnumChatFormat(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatModifier#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSChatClickable h(){
        return new NMSChatClickable(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatModifier#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSChatHoverable i(){
        return new NMSChatHoverable(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#isBold()
     */
    @ReflectiveMethod(name = "isBold", types = {})
    public boolean isBold(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#isItalic()
     */
    @ReflectiveMethod(name = "isItalic", types = {})
    public boolean isItalic(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#isRandom()
     */
    @ReflectiveMethod(name = "isRandom", types = {})
    public boolean isRandom(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#isStrikethrough()
     */
    @ReflectiveMethod(name = "isStrikethrough", types = {})
    public boolean isStrikethrough(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#isUnderlined()
     */
    @ReflectiveMethod(name = "isUnderlined", types = {})
    public boolean isUnderlined(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatModifier#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public String j(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatModifier#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public NMSChatModifier n(){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#setBold(java.lang.Boolean)
     */
    @ReflectiveMethod(name = "setBold", types = {Boolean.class})
    public NMSChatModifier setBold(Boolean b){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject, b));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#setChatClickable(net.minecraft.server.v1_9_R1.ChatClickable)
     */
    @ReflectiveMethod(name = "setChatClickable", types = {NMSChatClickable.class})
    public NMSChatModifier setChatClickable(NMSChatClickable chatClickable){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject, chatClickable));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#setChatHoverable(net.minecraft.server.v1_9_R1.ChatHoverable)
     */
    @ReflectiveMethod(name = "setChatHoverable", types = {NMSChatHoverable.class})
    public NMSChatModifier setChatHoverable(NMSChatHoverable chatHoverable){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject, chatHoverable));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#setChatModifier(net.minecraft.server.v1_9_R1.ChatModifier)
     */
    @ReflectiveMethod(name = "setChatModifier", types = {NMSChatModifier.class})
    public NMSChatModifier setChatModifier(NMSChatModifier chatModifier){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject, chatModifier));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#setColor(net.minecraft.server.v1_9_R1.EnumChatFormat)
     */
    @ReflectiveMethod(name = "setColor", types = {NMSEnumChatFormat.class})
    public NMSChatModifier setColor(NMSEnumChatFormat enumChatFormat){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject, enumChatFormat));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#setInsertion(java.lang.String)
     */
    @ReflectiveMethod(name = "setInsertion", types = {String.class})
    public NMSChatModifier setInsertion(String s){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#setItalic(java.lang.Boolean)
     */
    @ReflectiveMethod(name = "setItalic", types = {Boolean.class})
    public NMSChatModifier setItalic(Boolean b){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject, b));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#setRandom(java.lang.Boolean)
     */
    @ReflectiveMethod(name = "setRandom", types = {Boolean.class})
    public NMSChatModifier setRandom(Boolean b){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject, b));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#setStrikethrough(java.lang.Boolean)
     */
    @ReflectiveMethod(name = "setStrikethrough", types = {Boolean.class})
    public NMSChatModifier setStrikethrough(Boolean b){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject, b));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#setUnderline(java.lang.Boolean)
     */
    @ReflectiveMethod(name = "setUnderline", types = {Boolean.class})
    public NMSChatModifier setUnderline(Boolean b){
        return new NMSChatModifier(NMSWrapper.getInstance().exec(nmsObject, b));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChatModifier#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "ChatModifierSerializer")
    public class NMSChatModifierSerializer extends NMSWrap {

        public NMSChatModifierSerializer(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.ChatModifier$ChatModifierSerializer#a(net.minecraft.server.v1_9_R1.ChatModifier, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
         */
        @ReflectiveMethod(name = "a", types = {NMSChatModifier.class, Type.class, JsonSerializationContext.class})
        public JsonElement a(NMSChatModifier chatModifier, Type type, JsonSerializationContext jsonSerializationContext){
            return (JsonElement) NMSWrapper.getInstance().exec(nmsObject, chatModifier, type, jsonSerializationContext);
        }

        /**
         * @see net.minecraft.server.v1_9_R1.ChatModifier$ChatModifierSerializer#serialize(java.lang.Object, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
         */
        @ReflectiveMethod(name = "serialize", types = {Object.class, Type.class, JsonSerializationContext.class})
        public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext){
            return (JsonElement) NMSWrapper.getInstance().exec(nmsObject, object, type, jsonSerializationContext);
        }

    }

}