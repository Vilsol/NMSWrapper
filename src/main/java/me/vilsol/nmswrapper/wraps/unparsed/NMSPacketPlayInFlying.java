package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayInFlying")
public class NMSPacketPlayInFlying extends NMSWrap {

    public NMSPacketPlayInFlying(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInFlying#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInFlying#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public double b(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInFlying#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public double c(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInFlying#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public float d(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInFlying#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public float e(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInFlying#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public boolean f(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInFlying#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInFlying#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public boolean h(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "PacketPlayInPosition")
    public class NMSPacketPlayInPosition extends NMSPacketPlayInFlying {

        public NMSPacketPlayInPosition(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayInFlying$PacketPlayInPosition#a(net.minecraft.server.v1_8_R3.PacketListener)
         */
        @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
        public void a(NMSPacketListener packetListener){
            NMSWrapper.getInstance().exec(nmsObject, packetListener);
        }

    }

    @ReflectiveClass(name = "PacketPlayInPositionLook")
    public class NMSPacketPlayInPositionLook extends NMSPacketPlayInFlying {

        public NMSPacketPlayInPositionLook(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayInFlying$PacketPlayInPositionLook#a(net.minecraft.server.v1_8_R3.PacketListener)
         */
        @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
        public void a(NMSPacketListener packetListener){
            NMSWrapper.getInstance().exec(nmsObject, packetListener);
        }

    }

    @ReflectiveClass(name = "PacketPlayInLook")
    public class NMSPacketPlayInLook extends NMSPacketPlayInFlying {

        public NMSPacketPlayInLook(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayInFlying$PacketPlayInLook#a(net.minecraft.server.v1_8_R3.PacketListener)
         */
        @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
        public void a(NMSPacketListener packetListener){
            NMSWrapper.getInstance().exec(nmsObject, packetListener);
        }

    }

}