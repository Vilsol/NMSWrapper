package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PotionBrewer")
public class NMSPotionBrewer extends NMSWrap {

    public NMSPotionBrewer(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PotionBrewer#a(int, int, int, int, int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class, int.class, int.class, int.class, int.class})
    public int a(int i, int i1, int i2, int i3, int i4, int i5){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, i1, i2, i3, i4, i5);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PotionBrewer#c(int)
     */
    @ReflectiveMethod(name = "c", types = {int.class})
    public String c(int i){
        return (String) NMSWrapper.getInstance().exec(nmsObject, i);
    }

}