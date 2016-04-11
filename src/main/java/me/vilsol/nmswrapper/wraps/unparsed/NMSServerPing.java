package me.vilsol.nmswrapper.wraps.unparsed;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.lang.reflect.Type;

@ReflectiveClass(name = "ServerPing")
public class NMSServerPing extends NMSWrap {

    public NMSServerPing(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerPing#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSIChatBaseComponent a(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerPing#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSServerPingPlayerSample b(){
        return new NMSServerPingPlayerSample(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerPing#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSServerData c(){
        return new NMSServerData(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerPing#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public String d(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ServerPing#setFavicon(java.lang.String)
     */
    @ReflectiveMethod(name = "setFavicon", types = {String.class})
    public void setFavicon(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ServerPing#setMOTD(net.minecraft.server.v1_9_R1.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "setMOTD", types = {NMSIChatBaseComponent.class})
    public void setMOTD(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ServerPing#setPlayerSample(net.minecraft.server.v1_9_R1.ServerPing$ServerPingPlayerSample)
     */
    @ReflectiveMethod(name = "setPlayerSample", types = {NMSServerPingPlayerSample.class})
    public void setPlayerSample(NMSServerPingPlayerSample serverPingPlayerSample){
        NMSWrapper.getInstance().exec(nmsObject, serverPingPlayerSample);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ServerPing#setServerInfo(net.minecraft.server.v1_9_R1.ServerPing$ServerData)
     */
    @ReflectiveMethod(name = "setServerInfo", types = {NMSServerData.class})
    public void setServerInfo(NMSServerData serverData){
        NMSWrapper.getInstance().exec(nmsObject, serverData);
    }

    @ReflectiveClass(name = "Serializer")
    public class NMSSerializer extends NMSWrap {

        public NMSSerializer(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.ServerPing$ServerData$Serializer#a(net.minecraft.server.v1_9_R1.ServerPing$ServerData, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
         */
        @ReflectiveMethod(name = "a", types = {NMSServerData.class, Type.class, JsonSerializationContext.class})
        public JsonElement a(NMSServerData serverData, Type type, JsonSerializationContext jsonSerializationContext){
            return (JsonElement) NMSWrapper.getInstance().exec(nmsObject, serverData, type, jsonSerializationContext);
        }

        /**
         * @see net.minecraft.server.v1_9_R1.ServerPing$ServerData$Serializer#serialize(java.lang.Object, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
         */
        @ReflectiveMethod(name = "serialize", types = {Object.class, Type.class, JsonSerializationContext.class})
        public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext){
            return (JsonElement) NMSWrapper.getInstance().exec(nmsObject, object, type, jsonSerializationContext);
        }

    }

    @ReflectiveClass(name = "ServerPingPlayerSample")
    public class NMSServerPingPlayerSample extends NMSWrap {

        public NMSServerPingPlayerSample(Object nmsObject){
            super(nmsObject);
        }

        public NMSServerPingPlayerSample(int i, int i1){
            super("ServerPingPlayerSample", new Object[]{int.class, int.class}, new Object[]{i, i1});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.ServerPing$ServerPingPlayerSample#a()
         */
        @ReflectiveMethod(name = "a", types = {})
        public int a(){
            return (int) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.ServerPing$ServerPingPlayerSample#b()
         */
        @ReflectiveMethod(name = "b", types = {})
        public int b(){
            return (int) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

    @ReflectiveClass(name = "ServerData")
    public class NMSServerData extends NMSWrap {

        public NMSServerData(Object nmsObject){
            super(nmsObject);
        }

        public NMSServerData(String s, int i){
            super("ServerData", new Object[]{String.class, int.class}, new Object[]{s, i});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.ServerPing$ServerData#a()
         */
        @ReflectiveMethod(name = "a", types = {})
        public String a(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.ServerPing$ServerData#b()
         */
        @ReflectiveMethod(name = "b", types = {})
        public int b(){
            return (int) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

}