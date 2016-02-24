package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PersistentScoreboard")
public class NMSPersistentScoreboard extends NMSPersistentBase {

    public NMSPersistentScoreboard(Object nmsObject){
        super(nmsObject);
    }

    public NMSPersistentScoreboard(String s){
        super("PersistentScoreboard", new Object[]{String.class}, new Object[]{s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PersistentScoreboard#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSNBTTagList a(){
        return new NMSNBTTagList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PersistentScoreboard#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSNBTTagList b(){
        return new NMSNBTTagList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PersistentScoreboard#c(net.minecraft.server.v1_8_R3.NBTTagList)
     */
    @ReflectiveMethod(name = "c", types = {NMSNBTTagList.class})
    public void c(NMSNBTTagList nBTTagList){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagList);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PersistentScoreboard#d(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "d", types = {NMSNBTTagCompound.class})
    public void d(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PersistentScoreboard#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public NMSNBTTagList e(){
        return new NMSNBTTagList(NMSWrapper.getInstance().exec(nmsObject));
    }

}