package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutBlockAction")
public class NMSPacketPlayOutBlockAction extends NMSWrap {

    public NMSPacketPlayOutBlockAction(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutBlockAction(NMSBlockPosition blockPosition, NMSBlock block, int i, int i1){
        super("PacketPlayOutBlockAction", new Object[]{NMSBlockPosition.class, NMSBlock.class, int.class, int.class}, new Object[]{blockPosition, block, i, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutBlockAction#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}