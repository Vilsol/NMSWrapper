package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BiomeTheEndDecorator")
public class NMSBiomeTheEndDecorator extends NMSBiomeDecorator {

    public NMSBiomeTheEndDecorator(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeTheEndDecorator#a(net.minecraft.server.v1_9_R1.BiomeBase)
     */
    @ReflectiveMethod(name = "a", types = {NMSBiomeBase.class})
    public void a(NMSBiomeBase biomeBase){
        NMSWrapper.getInstance().exec(nmsObject, biomeBase);
    }

}