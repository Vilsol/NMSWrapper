package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketEncrypter")
public class NMSPacketEncrypter extends MessageToByteEncoder {

    public NMSPacketEncrypter(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketEncrypter(Cipher cipher){
        super("PacketEncrypter", new Object[]{Cipher.class}, new Object[]{cipher});
    }

}