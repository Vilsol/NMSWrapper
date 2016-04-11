package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PistonExtendsChecker")
public class NMSPistonExtendsChecker extends NMSWrap {

    public NMSPistonExtendsChecker(Object nmsObject){
        super(nmsObject);
    }

    public NMSPistonExtendsChecker(NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, boolean b){
        super("PistonExtendsChecker", new Object[]{NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, boolean.class}, new Object[]{world, blockPosition, enumDirection, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PistonExtendsChecker#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}