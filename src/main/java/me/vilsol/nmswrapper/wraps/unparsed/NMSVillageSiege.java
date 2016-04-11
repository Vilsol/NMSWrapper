package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "VillageSiege")
public class NMSVillageSiege extends NMSWrap {

    public NMSVillageSiege(Object nmsObject){
        super(nmsObject);
    }

    public NMSVillageSiege(NMSWorld world){
        super("VillageSiege", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.VillageSiege#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}