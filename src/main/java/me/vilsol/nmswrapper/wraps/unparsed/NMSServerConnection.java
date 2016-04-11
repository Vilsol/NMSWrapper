package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ServerConnection")
public class NMSServerConnection extends NMSWrap {

    public NMSServerConnection(Object nmsObject){
        super(nmsObject);
    }

    public NMSServerConnection(NMSMinecraftServer minecraftServer){
        super("ServerConnection", new Object[]{NMSMinecraftServer.class}, new Object[]{minecraftServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerConnection#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerConnection#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerConnection#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSMinecraftServer d(){
        return new NMSMinecraftServer(NMSWrapper.getInstance().exec(nmsObject));
    }

}