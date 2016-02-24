package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CombatEntry")
public class NMSCombatEntry extends NMSWrap {

    public NMSCombatEntry(Object nmsObject){
        super(nmsObject);
    }

    public NMSCombatEntry(NMSDamageSource damageSource, int i, float f, float f1, String s, float f2){
        super("CombatEntry", new Object[]{NMSDamageSource.class, int.class, float.class, float.class, String.class, float.class}, new Object[]{damageSource, i, f, f1, s, f2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatEntry#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSDamageSource a(){
        return new NMSDamageSource(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatEntry#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public float c(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatEntry#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public boolean f(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatEntry#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public String g(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatEntry#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSIChatBaseComponent h(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CombatEntry#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public float i(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

}