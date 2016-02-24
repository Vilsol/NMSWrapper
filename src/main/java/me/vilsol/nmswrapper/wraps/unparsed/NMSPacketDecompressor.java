package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketDecompressor")
public class NMSPacketDecompressor extends ByteToMessageDecoder {

    public NMSPacketDecompressor(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketDecompressor(int i){
        super("PacketDecompressor", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketDecompressor#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public void a(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

}