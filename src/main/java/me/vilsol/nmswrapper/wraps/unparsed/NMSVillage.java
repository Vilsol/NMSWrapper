package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Village")
public class NMSVillage extends NMSWrap {

    public NMSVillage(Object nmsObject){
        super(nmsObject);
    }

    public NMSVillage(NMSWorld world){
        super("Village", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Village#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Village#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public void b(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Village#c(net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "c", types = {NMSEntityLiving.class})
    public NMSEntityHuman c(NMSEntityLiving entityLiving){
        return new NMSEntityHuman(NMSWrapper.getInstance().exec(nmsObject, entityLiving));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Village#d(java.lang.String)
     */
    @ReflectiveMethod(name = "d", types = {String.class})
    public boolean d(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Village#e(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "e", types = {NMSBlockPosition.class})
    public NMSVillageDoor e(NMSBlockPosition blockPosition){
        return new NMSVillageDoor(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Village#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Village#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Village#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public boolean i(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}