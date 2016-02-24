package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "SystemUtils")
public class NMSSystemUtils extends NMSWrap {

    public NMSSystemUtils(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SystemUtils#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public String a(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}