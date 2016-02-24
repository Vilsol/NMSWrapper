package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "OldNibbleArray")
public class NMSOldNibbleArray extends NMSWrap {

    public NMSOldNibbleArray(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.OldNibbleArray#a(int, int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class, int.class})
    public int a(int i, int i1, int i2){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, i2);
    }

}