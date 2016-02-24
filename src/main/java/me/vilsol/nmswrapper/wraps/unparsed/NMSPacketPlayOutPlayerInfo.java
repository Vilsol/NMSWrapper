package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutPlayerInfo")
public class NMSPacketPlayOutPlayerInfo extends NMSWrap {

    public NMSPacketPlayOutPlayerInfo(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutPlayerInfo(NMSEnumPlayerInfoAction enumPlayerInfoAction, NMSEntityPlayer[] array){
        super("PacketPlayOutPlayerInfo", new Object[]{NMSEnumPlayerInfoAction.class, NMSEntityPlayer[].class}, new Object[]{enumPlayerInfoAction, array});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "PlayerInfoData")
    public class NMSPlayerInfoData extends NMSWrap {

        public NMSPlayerInfoData(Object nmsObject){
            super(nmsObject);
        }

        public NMSPlayerInfoData(NMSPacketPlayOutPlayerInfo packetPlayOutPlayerInfo, GameProfile gameProfile, int i, NMSEnumGamemode enumGamemode, NMSIChatBaseComponent iChatBaseComponent){
            super("PlayerInfoData", new Object[]{NMSPacketPlayOutPlayerInfo.class, GameProfile.class, int.class, NMSEnumGamemode.class, NMSIChatBaseComponent.class}, new Object[]{packetPlayOutPlayerInfo, gameProfile, i, enumGamemode, iChatBaseComponent});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo$PlayerInfoData#a()
         */
        @ReflectiveMethod(name = "a", types = {})
        public GameProfile a(){
            return new GameProfile(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo$PlayerInfoData#b()
         */
        @ReflectiveMethod(name = "b", types = {})
        public int b(){
            return (int) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo$PlayerInfoData#c()
         */
        @ReflectiveMethod(name = "c", types = {})
        public NMSEnumGamemode c(){
            return new NMSEnumGamemode(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo$PlayerInfoData#d()
         */
        @ReflectiveMethod(name = "d", types = {})
        public NMSIChatBaseComponent d(){
            return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo$PlayerInfoData#toString()
         */
        @ReflectiveMethod(name = "toString", types = {})
        public String toString(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

}