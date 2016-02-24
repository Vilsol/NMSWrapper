package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityGuardian")
public class NMSEntityGuardian extends NMSEntityMonster {

    public NMSEntityGuardian(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityGuardian(NMSWorld world){
        super("EntityGuardian", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public void E(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#a(net.minecraft.server.v1_8_R3.EntityGuardian, boolean)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityGuardian.class, boolean.class})
    public void a(NMSEntityGuardian entityGuardian, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, entityGuardian, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#b(net.minecraft.server.v1_8_R3.World)
     */
    @ReflectiveMethod(name = "b", types = {NMSWorld.class})
    public NMSNavigationAbstract b(NMSWorld world){
        return new NMSNavigationAbstract(NMSWrapper.getInstance().exec(nmsObject, world));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#bQ()
     */
    @ReflectiveMethod(name = "bQ", types = {})
    public int bQ(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#bR()
     */
    @ReflectiveMethod(name = "bR", types = {})
    public boolean bR(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#bo()
     */
    @ReflectiveMethod(name = "bo", types = {})
    public String bo(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#bp()
     */
    @ReflectiveMethod(name = "bp", types = {})
    public String bp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#canSpawn()
     */
    @ReflectiveMethod(name = "canSpawn", types = {})
    public boolean canSpawn(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#cm()
     */
    @ReflectiveMethod(name = "cm", types = {})
    public int cm(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#cp()
     */
    @ReflectiveMethod(name = "cp", types = {})
    public boolean cp(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#cq()
     */
    @ReflectiveMethod(name = "cq", types = {})
    public NMSEntityLiving cq(){
        return new NMSEntityLiving(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#damageEntity(net.minecraft.server.v1_8_R3.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#g(float, float)
     */
    @ReflectiveMethod(name = "g", types = {float.class, float.class})
    public void g(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#getRareDrop()
     */
    @ReflectiveMethod(name = "getRareDrop", types = {})
    public void getRareDrop(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#i(int)
     */
    @ReflectiveMethod(name = "i", types = {int.class})
    public void i(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#isElder()
     */
    @ReflectiveMethod(name = "isElder", types = {})
    public boolean isElder(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public boolean n(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#n_()
     */
    @ReflectiveMethod(name = "n_", types = {})
    public boolean n_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#q(float)
     */
    @ReflectiveMethod(name = "q", types = {float.class})
    public float q(float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#s_()
     */
    @ReflectiveMethod(name = "s_", types = {})
    public boolean s_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#setElder(boolean)
     */
    @ReflectiveMethod(name = "setElder", types = {boolean.class})
    public void setElder(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public int w(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGuardian#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public String z(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}