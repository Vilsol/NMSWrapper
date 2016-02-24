package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayInAbilities")
public class NMSPacketPlayInAbilities extends NMSWrap {

    public NMSPacketPlayInAbilities(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayInAbilities(NMSPlayerAbilities playerAbilities){
        super("PacketPlayInAbilities", new Object[]{NMSPlayerAbilities.class}, new Object[]{playerAbilities});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInAbilities#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInAbilities#b(float)
     */
    @ReflectiveMethod(name = "b", types = {float.class})
    public void b(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInAbilities#c(boolean)
     */
    @ReflectiveMethod(name = "c", types = {boolean.class})
    public void c(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayInAbilities#d(boolean)
     */
    @ReflectiveMethod(name = "d", types = {boolean.class})
    public void d(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PacketPlayInAbilities#isFlying()
     */
    @ReflectiveMethod(name = "isFlying", types = {})
    public boolean isFlying(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}