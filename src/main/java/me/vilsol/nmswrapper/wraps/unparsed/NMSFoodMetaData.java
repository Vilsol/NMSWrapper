package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "FoodMetaData")
public class NMSFoodMetaData extends NMSWrap {

    public NMSFoodMetaData(Object nmsObject){
        super(nmsObject);
    }

    public NMSFoodMetaData(NMSEntityHuman entityHuman){
        super("FoodMetaData", new Object[]{NMSEntityHuman.class}, new Object[]{entityHuman});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.FoodMetaData#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public void a(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.FoodMetaData#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.FoodMetaData#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.FoodMetaData#eat(int, float)
     */
    @ReflectiveMethod(name = "eat", types = {int.class, float.class})
    public void eat(int i, float f){
        NMSWrapper.getInstance().exec(nmsObject, i, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.FoodMetaData#getFoodLevel()
     */
    @ReflectiveMethod(name = "getFoodLevel", types = {})
    public int getFoodLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.FoodMetaData#getSaturationLevel()
     */
    @ReflectiveMethod(name = "getSaturationLevel", types = {})
    public float getSaturationLevel(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

}