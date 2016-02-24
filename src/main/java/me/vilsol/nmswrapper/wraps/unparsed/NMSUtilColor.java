package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "UtilColor")
public class NMSUtilColor extends NMSWrap {

    public NMSUtilColor(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.UtilColor#b(java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {String.class})
    public boolean b(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

}