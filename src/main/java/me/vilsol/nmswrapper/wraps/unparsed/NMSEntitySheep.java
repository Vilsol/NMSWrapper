package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "EntitySheep")
public class NMSEntitySheep extends NMSEntityAnimal {

    public NMSEntitySheep(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntitySheep(NMSWorld world){
        super("EntitySheep", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySheep#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public void E(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySheep#a(java.util.Random)
     */
    @ReflectiveMethod(name = "a", types = {Random.class})
    public NMSEnumColor a(Random random){
        return new NMSEnumColor(NMSWrapper.getInstance().exec(nmsObject, random));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySheep#b(net.minecraft.server.v1_9_R1.EntityAgeable)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityAgeable.class})
    public NMSEntitySheep b(NMSEntityAgeable entityAgeable){
        return new NMSEntitySheep(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySheep#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySheep#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySheep#createChild(net.minecraft.server.v1_9_R1.EntityAgeable)
     */
    @ReflectiveMethod(name = "createChild", types = {NMSEntityAgeable.class})
    public NMSEntityAgeable createChild(NMSEntityAgeable entityAgeable){
        return new NMSEntityAgeable(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySheep#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySheep#getColor()
     */
    @ReflectiveMethod(name = "getColor", types = {})
    public NMSEnumColor getColor(){
        return new NMSEnumColor(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySheep#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySheep#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySheep#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySheep#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySheep#isSheared()
     */
    @ReflectiveMethod(name = "isSheared", types = {})
    public boolean isSheared(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySheep#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySheep#prepare(net.minecraft.server.v1_9_R1.DifficultyDamageScaler, net.minecraft.server.v1_9_R1.GroupDataEntity)
     */
    @ReflectiveMethod(name = "prepare", types = {NMSDifficultyDamageScaler.class, NMSGroupDataEntity.class})
    public NMSGroupDataEntity prepare(NMSDifficultyDamageScaler difficultyDamageScaler, NMSGroupDataEntity groupDataEntity){
        return (NMSGroupDataEntity) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, difficultyDamageScaler, groupDataEntity));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySheep#setColor(net.minecraft.server.v1_9_R1.EnumColor)
     */
    @ReflectiveMethod(name = "setColor", types = {NMSEnumColor.class})
    public void setColor(NMSEnumColor enumColor){
        NMSWrapper.getInstance().exec(nmsObject, enumColor);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySheep#setSheared(boolean)
     */
    @ReflectiveMethod(name = "setSheared", types = {boolean.class})
    public void setSheared(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySheep#v()
     */
    @ReflectiveMethod(name = "v", types = {})
    public void v(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySheep#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}