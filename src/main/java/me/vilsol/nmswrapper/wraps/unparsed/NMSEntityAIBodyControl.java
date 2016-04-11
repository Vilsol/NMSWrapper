package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityAIBodyControl")
public class NMSEntityAIBodyControl extends NMSWrap {

    public NMSEntityAIBodyControl(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityAIBodyControl(NMSEntityLiving entityLiving){
        super("EntityAIBodyControl", new Object[]{NMSEntityLiving.class}, new Object[]{entityLiving});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityAIBodyControl#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}