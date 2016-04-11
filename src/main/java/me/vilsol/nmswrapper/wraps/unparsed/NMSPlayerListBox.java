package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import javax.swing.*;

@ReflectiveClass(name = "PlayerListBox")
public class NMSPlayerListBox extends NMSWrap implements NMSIUpdatePlayerListBox {

    public NMSPlayerListBox(Object nmsObject){
        super(nmsObject);
    }

    public NMSPlayerListBox(NMSMinecraftServer minecraftServer){
        super("PlayerListBox", new Object[]{NMSMinecraftServer.class}, new Object[]{minecraftServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PlayerListBox#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}