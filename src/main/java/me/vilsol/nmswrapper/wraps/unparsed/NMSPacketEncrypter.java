package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import javax.crypto.Cipher;

@ReflectiveClass(name = "PacketEncrypter")
public class NMSPacketEncrypter extends NMSWrap {

    public NMSPacketEncrypter(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketEncrypter(Cipher cipher){
        super("PacketEncrypter", new Object[]{Cipher.class}, new Object[]{cipher});
    }

}