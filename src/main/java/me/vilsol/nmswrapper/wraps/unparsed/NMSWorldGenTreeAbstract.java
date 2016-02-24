package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenTreeAbstract")
public class NMSWorldGenTreeAbstract extends NMSWorldGenerator {

    public NMSWorldGenTreeAbstract(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenTreeAbstract(boolean b){
        super("WorldGenTreeAbstract", new Object[]{boolean.class}, new Object[]{b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenTreeAbstract#a(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class})
    public void a(NMSWorld world, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

}