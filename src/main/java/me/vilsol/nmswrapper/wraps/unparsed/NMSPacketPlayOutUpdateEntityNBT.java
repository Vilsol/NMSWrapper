package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutUpdateEntityNBT")
public class NMSPacketPlayOutUpdateEntityNBT extends NMSWrap {

    public NMSPacketPlayOutUpdateEntityNBT(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutUpdateEntityNBT(int i, NMSNBTTagCompound nBTTagCompound){
        super("PacketPlayOutUpdateEntityNBT", new Object[]{int.class, NMSNBTTagCompound.class}, new Object[]{i, nBTTagCompound});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutUpdateEntityNBT#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}