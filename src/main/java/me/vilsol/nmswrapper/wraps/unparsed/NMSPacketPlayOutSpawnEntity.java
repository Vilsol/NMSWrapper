package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutSpawnEntity")
public class NMSPacketPlayOutSpawnEntity extends NMSWrap {

    public NMSPacketPlayOutSpawnEntity(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutSpawnEntity(NMSEntity entity, int i){
        super("PacketPlayOutSpawnEntity", new Object[]{NMSEntity.class, int.class}, new Object[]{entity, i});
    }

    public NMSPacketPlayOutSpawnEntity(NMSEntity entity, int i, int i1){
        super("PacketPlayOutSpawnEntity", new Object[]{NMSEntity.class, int.class, int.class}, new Object[]{entity, i, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntity#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntity#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public void b(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntity#c(int)
     */
    @ReflectiveMethod(name = "c", types = {int.class})
    public void c(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntity#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public void d(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntity#e(int)
     */
    @ReflectiveMethod(name = "e", types = {int.class})
    public void e(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntity#f(int)
     */
    @ReflectiveMethod(name = "f", types = {int.class})
    public void f(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

}