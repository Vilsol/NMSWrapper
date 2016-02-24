package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RemoteControlSession")
public class NMSRemoteControlSession extends NMSRemoteConnectionThread {

    public NMSRemoteControlSession(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RemoteControlSession#run()
     */
    @ReflectiveMethod(name = "run", types = {})
    public void run(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}