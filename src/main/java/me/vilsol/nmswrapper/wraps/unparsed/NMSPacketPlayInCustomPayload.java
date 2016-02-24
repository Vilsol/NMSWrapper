package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayInCustomPayload")
public class NMSPacketPlayInCustomPayload extends NMSWrap {

    public NMSPacketPlayInCustomPayload(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInCustomPayload#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInCustomPayload#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSPacketDataSerializer b(){
        return new NMSPacketDataSerializer(NMSWrapper.getInstance().exec(nmsObject));
    }

}