package me.vilsol.nmswrapper.wraps.unparsed;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.lang.reflect.Type;

@ReflectiveClass(name = "CustomWorldSettingsFinal")
public class NMSCustomWorldSettingsFinal extends NMSWrap {

    public NMSCustomWorldSettingsFinal(Object nmsObject){
        super(nmsObject);
    }

    @ReflectiveClass(name = "CustomWorldSettings")
    public class NMSCustomWorldSettings extends NMSWrap {

        public NMSCustomWorldSettings(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.CustomWorldSettingsFinal$CustomWorldSettings#a()
         */
        @ReflectiveMethod(name = "a", types = {})
        public void a(){
            NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.CustomWorldSettingsFinal$CustomWorldSettings#b()
         */
        @ReflectiveMethod(name = "b", types = {})
        public NMSCustomWorldSettingsFinal b(){
            return new NMSCustomWorldSettingsFinal(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * @see net.minecraft.server.v1_8_R3.CustomWorldSettingsFinal$CustomWorldSettings#equals(java.lang.Object)
         */
        @ReflectiveMethod(name = "equals", types = {Object.class})
        public boolean equals(Object object){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.CustomWorldSettingsFinal$CustomWorldSettings#hashCode()
         */
        @ReflectiveMethod(name = "hashCode", types = {})
        public int hashCode(){
            return (int) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.CustomWorldSettingsFinal$CustomWorldSettings#toString()
         */
        @ReflectiveMethod(name = "toString", types = {})
        public String toString(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

    @ReflectiveClass(name = "CustomWorldSettingsSerializer")
    public class NMSCustomWorldSettingsSerializer extends NMSWrap {

        public NMSCustomWorldSettingsSerializer(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.CustomWorldSettingsFinal$CustomWorldSettingsSerializer#a(net.minecraft.server.v1_8_R3.CustomWorldSettingsFinal$CustomWorldSettings, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
         */
        @ReflectiveMethod(name = "a", types = {NMSCustomWorldSettings.class, Type.class, JsonSerializationContext.class})
        public JsonElement a(NMSCustomWorldSettings customWorldSettings, Type type, JsonSerializationContext jsonSerializationContext){
            return (JsonElement) NMSWrapper.getInstance().exec(nmsObject, customWorldSettings, type, jsonSerializationContext);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.CustomWorldSettingsFinal$CustomWorldSettingsSerializer#serialize(java.lang.Object, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
         */
        @ReflectiveMethod(name = "serialize", types = {Object.class, Type.class, JsonSerializationContext.class})
        public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext){
            return (JsonElement) NMSWrapper.getInstance().exec(nmsObject, object, type, jsonSerializationContext);
        }

    }

}