package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "InstantMobEffect")
public class NMSInstantMobEffect extends NMSMobEffectList {

    public NMSInstantMobEffect(Object nmsObject){
        super(nmsObject);
    }

    public NMSInstantMobEffect(int i, NMSMinecraftKey minecraftKey, boolean b, int i1){
        super("InstantMobEffect", new Object[]{int.class, NMSMinecraftKey.class, boolean.class, int.class}, new Object[]{i, minecraftKey, b, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.InstantMobEffect#a(int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class})
    public boolean a(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InstantMobEffect#isInstant()
     */
    @ReflectiveMethod(name = "isInstant", types = {})
    public boolean isInstant(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}