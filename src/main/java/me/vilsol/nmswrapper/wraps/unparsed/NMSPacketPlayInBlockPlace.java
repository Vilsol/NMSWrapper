package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayInBlockPlace")
public class NMSPacketPlayInBlockPlace extends NMSWrap {

    public NMSPacketPlayInBlockPlace(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayInBlockPlace(NMSItemStack itemStack){
        super("PacketPlayInBlockPlace", new Object[]{NMSItemStack.class}, new Object[]{itemStack});
    }

    public NMSPacketPlayInBlockPlace(NMSBlockPosition blockPosition, int i, NMSItemStack itemStack, float f, float f1, float f2){
        super("PacketPlayInBlockPlace", new Object[]{NMSBlockPosition.class, int.class, NMSItemStack.class, float.class, float.class, float.class}, new Object[]{blockPosition, i, itemStack, f, f1, f2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInBlockPlace#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInBlockPlace#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public float d(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInBlockPlace#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public float e(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInBlockPlace#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public float f(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketPlayInBlockPlace#getFace()
     */
    @ReflectiveMethod(name = "getFace", types = {})
    public int getFace(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketPlayInBlockPlace#getItemStack()
     */
    @ReflectiveMethod(name = "getItemStack", types = {})
    public NMSItemStack getItemStack(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

}