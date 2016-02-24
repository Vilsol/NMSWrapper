package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockGlass")
public class NMSBlockGlass extends NMSBlockHalfTransparent {

    public NMSBlockGlass(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockGlass(NMSMaterial material, boolean b){
        super("BlockGlass", new Object[]{NMSMaterial.class, boolean.class}, new Object[]{material, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockGlass#I()
     */
    @ReflectiveMethod(name = "I", types = {})
    public boolean I(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockGlass#a(java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {Random.class})
    public int a(Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, random);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockGlass#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}