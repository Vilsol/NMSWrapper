package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutSpawnEntityWeather")
public class NMSPacketPlayOutSpawnEntityWeather extends NMSWrap {

    public NMSPacketPlayOutSpawnEntityWeather(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutSpawnEntityWeather(NMSEntity entity){
        super("PacketPlayOutSpawnEntityWeather", new Object[]{NMSEntity.class}, new Object[]{entity});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntityWeather#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}