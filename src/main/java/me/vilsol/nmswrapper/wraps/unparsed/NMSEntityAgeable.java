package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityAgeable")
public class NMSEntityAgeable extends NMSEntityCreature {

    public NMSEntityAgeable(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityAgeable(NMSWorld world){
        super("EntityAgeable", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityAgeable(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#a(float)
     */
    @ReflectiveMethod(name = "a", types = {float.class})
    public void a(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#createChild(net.minecraft.server.v1_8_R3.EntityAgeable)
     */
    @ReflectiveMethod(name = "createChild", types = {NMSEntityAgeable.class})
    public NMSEntityAgeable createChild(NMSEntityAgeable entityAgeable){
        return new NMSEntityAgeable(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#getAge()
     */
    @ReflectiveMethod(name = "getAge", types = {})
    public int getAge(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#inactiveTick()
     */
    @ReflectiveMethod(name = "inactiveTick", types = {})
    public void inactiveTick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#isBaby()
     */
    @ReflectiveMethod(name = "isBaby", types = {})
    public boolean isBaby(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public void n(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#setAge(int)
     */
    @ReflectiveMethod(name = "setAge", types = {int.class})
    public void setAge(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#setAgeRaw(int)
     */
    @ReflectiveMethod(name = "setAgeRaw", types = {int.class})
    public void setAgeRaw(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityAgeable#setSize(float, float)
     */
    @ReflectiveMethod(name = "setSize", types = {float.class, float.class})
    public void setSize(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

}