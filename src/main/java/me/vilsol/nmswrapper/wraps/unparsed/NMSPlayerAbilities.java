package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PlayerAbilities")
public class NMSPlayerAbilities extends NMSWrap {

    public NMSPlayerAbilities(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerAbilities#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public float a(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerAbilities#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public float b(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

}