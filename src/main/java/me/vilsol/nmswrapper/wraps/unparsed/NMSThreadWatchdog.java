package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ThreadWatchdog")
public class NMSThreadWatchdog extends NMSWrap implements Runnable {

    public NMSThreadWatchdog(Object nmsObject){
        super(nmsObject);
    }

    public NMSThreadWatchdog(NMSDedicatedServer dedicatedServer){
        super("ThreadWatchdog", new Object[]{NMSDedicatedServer.class}, new Object[]{dedicatedServer});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ThreadWatchdog#run()
     */
    @ReflectiveMethod(name = "run", types = {})
    public void run(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}