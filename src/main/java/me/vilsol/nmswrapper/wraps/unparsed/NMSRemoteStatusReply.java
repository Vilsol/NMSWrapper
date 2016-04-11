package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RemoteStatusReply")
public class NMSRemoteStatusReply extends NMSWrap {

    public NMSRemoteStatusReply(Object nmsObject){
        super(nmsObject);
    }

    public NMSRemoteStatusReply(int i){
        super("RemoteStatusReply", new Object[]{int.class}, new Object[]{i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.RemoteStatusReply#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}