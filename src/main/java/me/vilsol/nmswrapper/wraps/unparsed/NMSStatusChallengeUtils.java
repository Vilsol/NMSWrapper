package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "StatusChallengeUtils")
public class NMSStatusChallengeUtils extends NMSWrap {

    public NMSStatusChallengeUtils(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.StatusChallengeUtils#a(byte)
     */
    @ReflectiveMethod(name = "a", types = {byte.class})
    public String a(byte b){
        return (String) NMSWrapper.getInstance().exec(nmsObject, b);
    }

}