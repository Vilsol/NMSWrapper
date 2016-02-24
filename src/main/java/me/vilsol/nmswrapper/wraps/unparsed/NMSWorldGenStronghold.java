package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenStronghold")
public class NMSWorldGenStronghold extends NMSStructureGenerator {

    public NMSWorldGenStronghold(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenStronghold#a(int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class})
    public boolean a(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenStronghold#b(int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class})
    public NMSStructureStart b(int i, int i1){
        return new NMSStructureStart(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    @ReflectiveClass(name = "WorldGenStronghold2Start")
    public class NMSWorldGenStronghold2Start extends NMSStructureStart {

        public NMSWorldGenStronghold2Start(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenStronghold2Start(NMSWorld world, Random random, int i, int i1){
            super("WorldGenStronghold2Start", new Object[]{NMSWorld.class, Random.class, int.class, int.class}, new Object[]{world, random, i, i1});
        }

    }

}