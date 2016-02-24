package me.vilsol.nmswrapper.wraps.unparsed;

import io.netty.handler.codec.MessageToMessageDecoder;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;

import javax.crypto.Cipher;

@ReflectiveClass(name = "PacketDecrypter")
public class NMSPacketDecrypter extends MessageToMessageDecoder {

    public NMSPacketDecrypter(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketDecrypter(Cipher cipher){
        super("PacketDecrypter", new Object[]{Cipher.class}, new Object[]{cipher});
    }

}