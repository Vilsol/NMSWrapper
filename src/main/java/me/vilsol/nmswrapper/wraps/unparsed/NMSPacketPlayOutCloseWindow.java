package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutCloseWindow")
public class NMSPacketPlayOutCloseWindow extends NMSWrap {

    public NMSPacketPlayOutCloseWindow(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutCloseWindow(int i){
        super("PacketPlayOutCloseWindow", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutCloseWindow#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}