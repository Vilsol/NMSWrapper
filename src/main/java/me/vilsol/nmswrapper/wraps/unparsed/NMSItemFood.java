package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemFood")
public class NMSItemFood extends NMSItem {

    public NMSItemFood(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemFood(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSItemFood(int i, float f, boolean b){
        super("ItemFood", new Object[]{int.class, float.class, boolean.class}, new Object[]{i, f, b});
    }

    public NMSItemFood(int i, boolean b){
        super("ItemFood", new Object[]{int.class, boolean.class}, new Object[]{i, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemFood#a(int, int, int, float)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class, int.class, float.class})
    public NMSItemFood a(int i, int i1, int i2, float f){
        return new NMSItemFood(NMSWrapper.getInstance().exec(nmsObject, i, i1, i2, f));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemFood#b(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "b", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public NMSItemStack b(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemFood#c(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public void c(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemFood#d(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class})
    public int d(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemFood#e(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "e", types = {NMSItemStack.class})
    public NMSEnumAnimation e(NMSItemStack itemStack){
        return new NMSEnumAnimation(NMSWrapper.getInstance().exec(nmsObject, itemStack));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemFood#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemFood#getNutrition(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "getNutrition", types = {NMSItemStack.class})
    public int getNutrition(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemFood#getSaturationModifier(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "getSaturationModifier", types = {NMSItemStack.class})
    public float getSaturationModifier(NMSItemStack itemStack){
        return (float) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemFood#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSItemFood h(){
        return new NMSItemFood(NMSWrapper.getInstance().exec(nmsObject));
    }

}