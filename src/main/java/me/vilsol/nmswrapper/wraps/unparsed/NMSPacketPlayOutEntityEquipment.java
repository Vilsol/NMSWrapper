package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutEntityEquipment")
public class NMSPacketPlayOutEntityEquipment extends NMSWrap {

    public NMSPacketPlayOutEntityEquipment(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutEntityEquipment(int i, int i1, NMSItemStack itemStack){
        super("PacketPlayOutEntityEquipment", new Object[]{int.class, int.class, NMSItemStack.class}, new Object[]{i, i1, itemStack});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutEntityEquipment#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

}