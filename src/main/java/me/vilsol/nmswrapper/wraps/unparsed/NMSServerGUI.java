package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ServerGUI")
public class NMSServerGUI extends NMSWrap {

    public NMSServerGUI(Object nmsObject){
        super(nmsObject);
    }

    public NMSServerGUI(NMSDedicatedServer dedicatedServer){
        super("ServerGUI", new Object[]{NMSDedicatedServer.class}, new Object[]{dedicatedServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerGUI#a(net.minecraft.server.v1_9_R1.ServerGUI)
     */
    @ReflectiveMethod(name = "a", types = {NMSServerGUI.class})
    public NMSDedicatedServer a(NMSServerGUI serverGUI){
        return new NMSDedicatedServer(NMSWrapper.getInstance().exec(nmsObject, serverGUI));
    }

}