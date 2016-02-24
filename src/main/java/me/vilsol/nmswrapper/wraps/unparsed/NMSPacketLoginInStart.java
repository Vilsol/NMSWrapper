package me.vilsol.nmswrapper.wraps.unparsed;

import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "PacketLoginInStart")
public class NMSPacketLoginInStart extends NMSWrap {

    public NMSPacketLoginInStart(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketLoginInStart(GameProfile gameProfile){
        super("PacketLoginInStart", new Object[]{GameProfile.class}, new Object[]{gameProfile});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketLoginInStart#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}