package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketCompressor")
public class NMSPacketCompressor extends NMSWrap {

    public NMSPacketCompressor(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketCompressor(int i){
        super("PacketCompressor", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PacketCompressor#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public void a(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

}