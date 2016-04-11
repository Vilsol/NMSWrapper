package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "DispenseBehaviorProjectile")
public class NMSDispenseBehaviorProjectile extends NMSDispenseBehaviorItem {

    public NMSDispenseBehaviorProjectile(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DispenseBehaviorProjectile#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public float a(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DispenseBehaviorProjectile#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public float b(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

}