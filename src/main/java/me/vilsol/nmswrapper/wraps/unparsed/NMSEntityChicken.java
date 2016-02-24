package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityChicken")
public class NMSEntityChicken extends NMSEntityAnimal {

    public NMSEntityChicken(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityChicken(NMSWorld world){
        super("EntityChicken", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityChicken#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityChicken#al()
     */
    @ReflectiveMethod(name = "al", types = {})
    public void al(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityChicken#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityChicken#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityChicken#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityChicken#createChild(net.minecraft.server.v1_8_R3.EntityAgeable)
     */
    @ReflectiveMethod(name = "createChild", types = {NMSEntityAgeable.class})
    public NMSEntityAgeable createChild(NMSEntityAgeable entityAgeable){
        return new NMSEntityAgeable(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityChicken#d(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class})
    public boolean d(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityChicken#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityChicken#e(float, float)
     */
    @ReflectiveMethod(name = "e", types = {float.class, float.class})
    public void e(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityChicken#getExpValue(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "getExpValue", types = {NMSEntityHuman.class})
    public int getExpValue(NMSEntityHuman entityHuman){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityChicken#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityChicken#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityChicken#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityChicken#isChickenJockey()
     */
    @ReflectiveMethod(name = "isChickenJockey", types = {})
    public boolean isChickenJockey(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityChicken#isTypeNotPersistent()
     */
    @ReflectiveMethod(name = "isTypeNotPersistent", types = {})
    public boolean isTypeNotPersistent(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityChicken#l(boolean)
     */
    @ReflectiveMethod(name = "l", types = {boolean.class})
    public void l(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityChicken#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityChicken#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}