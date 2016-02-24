package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RemoteStatusListener")
public class NMSRemoteStatusListener extends NMSRemoteConnectionThread {

    public NMSRemoteStatusListener(Object nmsObject){
        super(nmsObject);
    }

    public NMSRemoteStatusListener(NMSIMinecraftServer iMinecraftServer){
        super("RemoteStatusListener", new Object[]{NMSIMinecraftServer.class}, new Object[]{iMinecraftServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RemoteStatusListener#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RemoteStatusListener#run()
     */
    @ReflectiveMethod(name = "run", types = {})
    public void run(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}