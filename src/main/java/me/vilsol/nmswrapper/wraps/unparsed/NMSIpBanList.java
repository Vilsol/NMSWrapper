package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.io.File;
import java.net.SocketAddress;

@ReflectiveClass(name = "IpBanList")
public class NMSIpBanList extends NMSJsonList {

    public NMSIpBanList(Object nmsObject){
        super(nmsObject);
    }

    public NMSIpBanList(File file){
        super("IpBanList", new Object[]{File.class}, new Object[]{file});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.IpBanList#get(java.net.SocketAddress)
     */
    @ReflectiveMethod(name = "get", types = {SocketAddress.class})
    public NMSIpBanEntry get(SocketAddress socketAddress){
        return new NMSIpBanEntry(NMSWrapper.getInstance().exec(nmsObject, socketAddress));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.IpBanList#isBanned(java.net.SocketAddress)
     */
    @ReflectiveMethod(name = "isBanned", types = {SocketAddress.class})
    public boolean isBanned(SocketAddress socketAddress){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, socketAddress);
    }

}