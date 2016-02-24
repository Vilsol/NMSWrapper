package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutEntity")
public class NMSPacketPlayOutEntity extends NMSWrap {

    public NMSPacketPlayOutEntity(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutEntity(int i){
        super("PacketPlayOutEntity", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntity#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntity#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "PacketPlayOutRelEntityMove")
    public class NMSPacketPlayOutRelEntityMove extends NMSPacketPlayOutEntity {

        public NMSPacketPlayOutRelEntityMove(Object nmsObject){
            super(nmsObject);
        }

        public NMSPacketPlayOutRelEntityMove(int i, byte b, byte b1, byte b2, boolean b3){
            super("PacketPlayOutRelEntityMove", new Object[]{int.class, byte.class, byte.class, byte.class, boolean.class}, new Object[]{i, b, b1, b2, b3});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntity$PacketPlayOutRelEntityMove#a(net.minecraft.server.v1_8_R3.PacketListener)
         */
        @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
        public void a(NMSPacketListener packetListener){
            NMSWrapper.getInstance().exec(nmsObject, packetListener);
        }

    }

    @ReflectiveClass(name = "PacketPlayOutRelEntityMoveLook")
    public class NMSPacketPlayOutRelEntityMoveLook extends NMSPacketPlayOutEntity {

        public NMSPacketPlayOutRelEntityMoveLook(Object nmsObject){
            super(nmsObject);
        }

        public NMSPacketPlayOutRelEntityMoveLook(int i, byte b, byte b1, byte b2, byte b3, byte b4, boolean b5){
            super("PacketPlayOutRelEntityMoveLook", new Object[]{int.class, byte.class, byte.class, byte.class, byte.class, byte.class, boolean.class}, new Object[]{i, b, b1, b2, b3, b4, b5});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntity$PacketPlayOutRelEntityMoveLook#a(net.minecraft.server.v1_8_R3.PacketListener)
         */
        @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
        public void a(NMSPacketListener packetListener){
            NMSWrapper.getInstance().exec(nmsObject, packetListener);
        }

    }

    @ReflectiveClass(name = "PacketPlayOutEntityLook")
    public class NMSPacketPlayOutEntityLook extends NMSPacketPlayOutEntity {

        public NMSPacketPlayOutEntityLook(Object nmsObject){
            super(nmsObject);
        }

        public NMSPacketPlayOutEntityLook(int i, byte b, byte b1, boolean b2){
            super("PacketPlayOutEntityLook", new Object[]{int.class, byte.class, byte.class, boolean.class}, new Object[]{i, b, b1, b2});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntity$PacketPlayOutEntityLook#a(net.minecraft.server.v1_8_R3.PacketListener)
         */
        @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
        public void a(NMSPacketListener packetListener){
            NMSWrapper.getInstance().exec(nmsObject, packetListener);
        }

    }

}