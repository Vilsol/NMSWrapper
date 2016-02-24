package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutBed")
public class NMSPacketPlayOutBed extends NMSWrap {

    public NMSPacketPlayOutBed(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutBed(NMSEntityHuman entityHuman, NMSBlockPosition blockPosition){
        super("PacketPlayOutBed", new Object[]{NMSEntityHuman.class, NMSBlockPosition.class}, new Object[]{entityHuman, blockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutBed#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}