package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PlayerListBox")
public class NMSPlayerListBox extends JList implements NMSIUpdatePlayerListBox {

    public NMSPlayerListBox(Object nmsObject){
        super(nmsObject);
    }

    public NMSPlayerListBox(NMSMinecraftServer minecraftServer){
        super("PlayerListBox", new Object[]{NMSMinecraftServer.class}, new Object[]{minecraftServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerListBox#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}