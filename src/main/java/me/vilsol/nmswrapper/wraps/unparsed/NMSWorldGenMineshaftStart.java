package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenMineshaftStart")
public class NMSWorldGenMineshaftStart extends NMSStructureStart {

    public NMSWorldGenMineshaftStart(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenMineshaftStart(NMSWorld world, Random random, int i, int i1){
        super("WorldGenMineshaftStart", new Object[]{NMSWorld.class, Random.class, int.class, int.class}, new Object[]{world, random, i, i1});
    }

}