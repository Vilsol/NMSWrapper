package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutTileEntityData")
public class NMSPacketPlayOutTileEntityData extends NMSWrap {

    public NMSPacketPlayOutTileEntityData(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutTileEntityData(NMSBlockPosition blockPosition, int i, NMSNBTTagCompound nBTTagCompound){
        super("PacketPlayOutTileEntityData", new Object[]{NMSBlockPosition.class, int.class, NMSNBTTagCompound.class}, new Object[]{blockPosition, i, nBTTagCompound});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutTileEntityData#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}