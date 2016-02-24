package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.util.Random;

@ReflectiveClass(name = "EntitySpider")
public class NMSEntitySpider extends NMSEntityMonster {

    public NMSEntitySpider(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntitySpider(NMSWorld world){
        super("EntitySpider", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#a(boolean)
     */
    @ReflectiveMethod(name = "a", types = {boolean.class})
    public void a(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#aA()
     */
    @ReflectiveMethod(name = "aA", types = {})
    public void aA(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#an()
     */
    @ReflectiveMethod(name = "an", types = {})
    public double an(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#b(net.minecraft.server.v1_8_R3.World)
     */
    @ReflectiveMethod(name = "b", types = {NMSWorld.class})
    public NMSNavigationAbstract b(NMSWorld world){
        return new NMSNavigationAbstract(NMSWrapper.getInstance().exec(nmsObject, world));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#d(net.minecraft.server.v1_8_R3.MobEffect)
     */
    @ReflectiveMethod(name = "d", types = {NMSMobEffect.class})
    public boolean d(NMSMobEffect mobEffect){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, mobEffect);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySpider#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySpider#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySpider#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySpider#getMonsterType()
     */
    @ReflectiveMethod(name = "getMonsterType", types = {})
    public NMSEnumMonsterType getMonsterType(){
        return new NMSEnumMonsterType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySpider#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#k_()
     */
    @ReflectiveMethod(name = "k_", types = {})
    public boolean k_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public boolean n(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntitySpider#prepare(net.minecraft.server.v1_8_R3.DifficultyDamageScaler, net.minecraft.server.v1_8_R3.GroupDataEntity)
     */
    @ReflectiveMethod(name = "prepare", types = {NMSDifficultyDamageScaler.class, NMSGroupDataEntity.class})
    public NMSGroupDataEntity prepare(NMSDifficultyDamageScaler difficultyDamageScaler, NMSGroupDataEntity groupDataEntity){
        return new NMSGroupDataEntity(NMSWrapper.getInstance().exec(nmsObject, difficultyDamageScaler, groupDataEntity));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntitySpider#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "GroupDataSpider")
    public class NMSGroupDataSpider extends NMSWrap implements NMSGroupDataEntity {

        public NMSGroupDataSpider(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.EntitySpider$GroupDataSpider#a(java.util.Random)
         */
        @ReflectiveMethod(name = "a", types = {Random.class})
        public void a(Random random){
            NMSWrapper.getInstance().exec(nmsObject, random);
        }

    }

}