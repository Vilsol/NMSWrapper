package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutUpdateAttributes")
public class NMSPacketPlayOutUpdateAttributes extends NMSWrap {

    public NMSPacketPlayOutUpdateAttributes(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutUpdateAttributes#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    @ReflectiveClass(name = "AttributeSnapshot")
    public class NMSAttributeSnapshot extends NMSWrap {

        public NMSAttributeSnapshot(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutUpdateAttributes$AttributeSnapshot#a()
         */
        @ReflectiveMethod(name = "a", types = {})
        public String a(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutUpdateAttributes$AttributeSnapshot#b()
         */
        @ReflectiveMethod(name = "b", types = {})
        public double b(){
            return (double) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

}