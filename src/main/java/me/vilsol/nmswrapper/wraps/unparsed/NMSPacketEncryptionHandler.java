package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketEncryptionHandler")
public class NMSPacketEncryptionHandler extends NMSWrap {

    public NMSPacketEncryptionHandler(Object nmsObject){
        super(nmsObject);
    }

}