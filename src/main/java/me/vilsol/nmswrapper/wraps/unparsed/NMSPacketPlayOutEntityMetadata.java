package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutEntityMetadata")
public class NMSPacketPlayOutEntityMetadata extends NMSWrap {

    public NMSPacketPlayOutEntityMetadata(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutEntityMetadata(int i, NMSDataWatcher dataWatcher, boolean b){
        super("PacketPlayOutEntityMetadata", new Object[]{int.class, NMSDataWatcher.class, boolean.class}, new Object[]{i, dataWatcher, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntityMetadata#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}