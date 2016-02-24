package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MinecraftEncryption")
public class NMSMinecraftEncryption extends NMSWrap {

    public NMSMinecraftEncryption(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftEncryption#a(int, java.security.Key)
     */
    @ReflectiveMethod(name = "a", types = {int.class, Key.class})
    public Cipher a(int i, Key key){
        return new Cipher(NMSWrapper.getInstance().exec(nmsObject, i, key));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftEncryption#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public KeyPair b(){
        return new KeyPair(NMSWrapper.getInstance().exec(nmsObject));
    }

}