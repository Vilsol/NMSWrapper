package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EnumProtocol")
public class NMSEnumProtocol extends NMSWrap {

    public NMSEnumProtocol(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EnumProtocol#a(net.minecraft.server.v1_9_R1.Packet)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacket.class})
    public NMSEnumProtocol a(NMSPacket packet){
        return new NMSEnumProtocol(NMSWrapper.getInstance().exec(nmsObject, packet));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EnumProtocol#valueOf(java.lang.String)
     */
    @ReflectiveMethod(name = "valueOf", types = {String.class})
    public NMSEnumProtocol valueOf(String s){
        return new NMSEnumProtocol(NMSWrapper.getInstance().exec(nmsObject, s));
    }

}