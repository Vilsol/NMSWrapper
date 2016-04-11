package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BiomeDecorator")
public class NMSBiomeDecorator extends NMSWrap {

    public NMSBiomeDecorator(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeDecorator#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BiomeDecorator#b(int, net.minecraft.server.v1_9_R1.WorldGenerator, int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, NMSWorldGenerator.class, int.class, int.class})
    public void b(int i, NMSWorldGenerator worldGenerator, int i1, int i2){
        NMSWrapper.getInstance().exec(nmsObject, i, worldGenerator, i1, i2);
    }

}