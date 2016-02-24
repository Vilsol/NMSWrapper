package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "DemoWorldServer")
public class NMSDemoWorldServer extends NMSWorldServer {

    public NMSDemoWorldServer(Object nmsObject){
        super(nmsObject);
    }

    public NMSDemoWorldServer(NMSMinecraftServer minecraftServer, NMSIDataManager iDataManager, NMSWorldData worldData, int i, NMSMethodProfiler methodProfiler){
        super("DemoWorldServer", new Object[]{NMSMinecraftServer.class, NMSIDataManager.class, NMSWorldData.class, int.class, NMSMethodProfiler.class}, new Object[]{minecraftServer, iDataManager, worldData, i, methodProfiler});
    }

}