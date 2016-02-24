package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenNether")
public class NMSWorldGenNether extends NMSStructureGenerator {

    public NMSWorldGenNether(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenNether#a(int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class})
    public boolean a(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenNether#b(int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class})
    public NMSStructureStart b(int i, int i1){
        return new NMSStructureStart(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    @ReflectiveClass(name = "WorldGenNetherStart")
    public class NMSWorldGenNetherStart extends NMSStructureStart {

        public NMSWorldGenNetherStart(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenNetherStart(NMSWorld world, Random random, int i, int i1){
            super("WorldGenNetherStart", new Object[]{NMSWorld.class, Random.class, int.class, int.class}, new Object[]{world, random, i, i1});
        }

    }

}