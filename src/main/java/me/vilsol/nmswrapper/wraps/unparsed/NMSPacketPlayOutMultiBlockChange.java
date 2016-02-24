package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutMultiBlockChange")
public class NMSPacketPlayOutMultiBlockChange extends NMSWrap {

    public NMSPacketPlayOutMultiBlockChange(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutMultiBlockChange#a(net.minecraft.server.v1_8_R3.PacketPlayOutMultiBlockChange)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketPlayOutMultiBlockChange.class})
    public NMSChunkCoordIntPair a(NMSPacketPlayOutMultiBlockChange packetPlayOutMultiBlockChange){
        return new NMSChunkCoordIntPair(NMSWrapper.getInstance().exec(nmsObject, packetPlayOutMultiBlockChange));
    }

    @ReflectiveClass(name = "MultiBlockChangeInfo")
    public class NMSMultiBlockChangeInfo extends NMSWrap {

        public NMSMultiBlockChangeInfo(Object nmsObject){
            super(nmsObject);
        }

        public NMSMultiBlockChangeInfo(NMSPacketPlayOutMultiBlockChange packetPlayOutMultiBlockChange, short s, NMSIBlockData iBlockData){
            super("MultiBlockChangeInfo", new Object[]{NMSPacketPlayOutMultiBlockChange.class, short.class, NMSIBlockData.class}, new Object[]{packetPlayOutMultiBlockChange, s, iBlockData});
        }

        public NMSMultiBlockChangeInfo(NMSPacketPlayOutMultiBlockChange packetPlayOutMultiBlockChange, short s, NMSChunk chunk){
            super("MultiBlockChangeInfo", new Object[]{NMSPacketPlayOutMultiBlockChange.class, short.class, NMSChunk.class}, new Object[]{packetPlayOutMultiBlockChange, s, chunk});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutMultiBlockChange$MultiBlockChangeInfo#a()
         */
        @ReflectiveMethod(name = "a", types = {})
        public NMSBlockPosition a(){
            return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutMultiBlockChange$MultiBlockChangeInfo#b()
         */
        @ReflectiveMethod(name = "b", types = {})
        public short b(){
            return (short) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.PacketPlayOutMultiBlockChange$MultiBlockChangeInfo#c()
         */
        @ReflectiveMethod(name = "c", types = {})
        public NMSIBlockData c(){
            return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject));
        }

    }

}