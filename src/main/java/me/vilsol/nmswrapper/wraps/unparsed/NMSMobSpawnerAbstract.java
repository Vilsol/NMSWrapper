package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MobSpawnerAbstract")
public class NMSMobSpawnerAbstract extends NMSWrap {

    public NMSMobSpawnerAbstract(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobSpawnerAbstract#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSWorld a(){
        return new NMSWorld(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobSpawnerAbstract#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSBlockPosition b(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MobSpawnerAbstract#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobSpawnerAbstract#getMobName()
     */
    @ReflectiveMethod(name = "getMobName", types = {})
    public String getMobName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MobSpawnerAbstract#setMobName(java.lang.String)
     */
    @ReflectiveMethod(name = "setMobName", types = {String.class})
    public void setMobName(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

}