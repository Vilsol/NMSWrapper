package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChestLock")
public class NMSChestLock extends NMSWrap {

    public NMSChestLock(Object nmsObject){
        super(nmsObject);
    }

    public NMSChestLock(String s){
        super("ChestLock", new Object[]{String.class}, new Object[]{s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChestLock#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChestLock#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public NMSChestLock b(NMSNBTTagCompound nBTTagCompound){
        return new NMSChestLock(NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound));
    }

}