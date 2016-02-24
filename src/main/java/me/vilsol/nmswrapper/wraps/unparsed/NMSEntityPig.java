package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityPig")
public class NMSEntityPig extends NMSEntityAnimal {

    public NMSEntityPig(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityPig(NMSWorld world){
        super("EntityPig", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPig#a(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPig#b(net.minecraft.server.v1_8_R3.EntityAgeable)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityAgeable.class})
    public NMSEntityPig b(NMSEntityAgeable entityAgeable){
        return new NMSEntityPig(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPig#bW()
     */
    @ReflectiveMethod(name = "bW", types = {})
    public boolean bW(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPig#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPig#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPig#cm()
     */
    @ReflectiveMethod(name = "cm", types = {})
    public NMSPathfinderGoalPassengerCarrotStick cm(){
        return new NMSPathfinderGoalPassengerCarrotStick(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityPig#createChild(net.minecraft.server.v1_8_R3.EntityAgeable)
     */
    @ReflectiveMethod(name = "createChild", types = {NMSEntityAgeable.class})
    public NMSEntityAgeable createChild(NMSEntityAgeable entityAgeable){
        return new NMSEntityAgeable(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPig#d(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class})
    public boolean d(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityPig#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPig#e(float, float)
     */
    @ReflectiveMethod(name = "e", types = {float.class, float.class})
    public void e(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityPig#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPig#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityPig#hasSaddle()
     */
    @ReflectiveMethod(name = "hasSaddle", types = {})
    public boolean hasSaddle(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityPig#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityPig#onLightningStrike(net.minecraft.server.v1_8_R3.EntityLightning)
     */
    @ReflectiveMethod(name = "onLightningStrike", types = {NMSEntityLightning.class})
    public void onLightningStrike(NMSEntityLightning entityLightning){
        NMSWrapper.getInstance().exec(nmsObject, entityLightning);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityPig#setSaddle(boolean)
     */
    @ReflectiveMethod(name = "setSaddle", types = {boolean.class})
    public void setSaddle(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityPig#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}