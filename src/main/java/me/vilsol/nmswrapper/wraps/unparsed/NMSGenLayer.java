package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GenLayer")
public class NMSGenLayer extends NMSWrap {

    public NMSGenLayer(Object nmsObject){
        super(nmsObject);
    }

    public NMSGenLayer(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSGenLayer(long l){
        super("GenLayer", new Object[]{long.class}, new Object[]{l});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.GenLayer#a(int...)
     */
    @ReflectiveMethod(name = "a", types = {int[].class})
    public int a(int[] array){
        return (int) NMSWrapper.getInstance().exec(nmsObject, array);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.GenLayer#b(int, int, int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class, int.class, int.class})
    public int b(int i, int i1, int i2, int i3){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, i2, i3);
    }

}