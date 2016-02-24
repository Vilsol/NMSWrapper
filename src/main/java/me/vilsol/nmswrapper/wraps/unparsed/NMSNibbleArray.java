package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NibbleArray")
public class NMSNibbleArray extends NMSWrap {

    public NMSNibbleArray(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NibbleArray#a(int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class})
    public void a(int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

}