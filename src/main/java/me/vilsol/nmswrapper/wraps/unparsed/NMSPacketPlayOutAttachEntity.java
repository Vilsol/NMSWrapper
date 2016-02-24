package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutAttachEntity")
public class NMSPacketPlayOutAttachEntity extends NMSWrap {

    public NMSPacketPlayOutAttachEntity(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutAttachEntity(int i, NMSEntity entity, NMSEntity entity1){
        super("PacketPlayOutAttachEntity", new Object[]{int.class, NMSEntity.class, NMSEntity.class}, new Object[]{i, entity, entity1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutAttachEntity#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}