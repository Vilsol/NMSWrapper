package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import javax.crypto.Cipher;

@ReflectiveClass(name = "PacketDecrypter")
public class NMSPacketDecrypter extends NMSWrap {

    public NMSPacketDecrypter(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketDecrypter(Cipher cipher){
        super("PacketDecrypter", new Object[]{Cipher.class}, new Object[]{cipher});
    }

}