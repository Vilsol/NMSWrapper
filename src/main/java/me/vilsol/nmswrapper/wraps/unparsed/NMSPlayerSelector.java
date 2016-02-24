package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PlayerSelector")
public class NMSPlayerSelector extends NMSWrap {

    public NMSPlayerSelector(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerSelector#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public int a(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerSelector#getPlayer(net.minecraft.server.v1_8_R3.ICommandListener, java.lang.String)
     */
    @ReflectiveMethod(name = "getPlayer", types = {NMSICommandListener.class, String.class})
    public NMSEntityPlayer getPlayer(NMSICommandListener iCommandListener, String s){
        return new NMSEntityPlayer(NMSWrapper.getInstance().exec(nmsObject, iCommandListener, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerSelector#getPlayerNames(net.minecraft.server.v1_8_R3.ICommandListener, java.lang.String)
     */
    @ReflectiveMethod(name = "getPlayerNames", types = {NMSICommandListener.class, String.class})
    public NMSIChatBaseComponent getPlayerNames(NMSICommandListener iCommandListener, String s){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject, iCommandListener, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerSelector#isList(java.lang.String)
     */
    @ReflectiveMethod(name = "isList", types = {String.class})
    public boolean isList(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerSelector#isPattern(java.lang.String)
     */
    @ReflectiveMethod(name = "isPattern", types = {String.class})
    public boolean isPattern(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

}