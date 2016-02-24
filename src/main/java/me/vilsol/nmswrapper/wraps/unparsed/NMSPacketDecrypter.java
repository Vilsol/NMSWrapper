package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketDecrypter")
public class NMSPacketDecrypter extends MessageToMessageDecoder {

    public NMSPacketDecrypter(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketDecrypter(Cipher cipher){
        super("PacketDecrypter", new Object[]{Cipher.class}, new Object[]{cipher});
    }

}