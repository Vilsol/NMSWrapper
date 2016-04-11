package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PersistentVillage")
public class NMSPersistentVillage extends NMSPersistentBase {

    public NMSPersistentVillage(Object nmsObject){
        super(nmsObject);
    }

    public NMSPersistentVillage(String s){
        super("PersistentVillage", new Object[]{String.class}, new Object[]{s});
    }

    public NMSPersistentVillage(NMSWorld world){
        super("PersistentVillage", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PersistentVillage#a(net.minecraft.server.v1_9_R1.WorldProvider)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorldProvider.class})
    public String a(NMSWorldProvider worldProvider){
        return (String) NMSWrapper.getInstance().exec(nmsObject, worldProvider);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PersistentVillage#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PersistentVillage#getClosestVillage(net.minecraft.server.v1_9_R1.BlockPosition, int)
     */
    @ReflectiveMethod(name = "getClosestVillage", types = {NMSBlockPosition.class, int.class})
    public NMSVillage getClosestVillage(NMSBlockPosition blockPosition, int i){
        return new NMSVillage(NMSWrapper.getInstance().exec(nmsObject, blockPosition, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.PersistentVillage#tick()
     */
    @ReflectiveMethod(name = "tick", types = {})
    public void tick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}