package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RemoteControlListener")
public class NMSRemoteControlListener extends NMSRemoteConnectionThread {

    public NMSRemoteControlListener(Object nmsObject){
        super(nmsObject);
    }

    public NMSRemoteControlListener(NMSIMinecraftServer iMinecraftServer){
        super("RemoteControlListener", new Object[]{NMSIMinecraftServer.class}, new Object[]{iMinecraftServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.RemoteControlListener#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.RemoteControlListener#run()
     */
    @ReflectiveMethod(name = "run", types = {})
    public void run(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}