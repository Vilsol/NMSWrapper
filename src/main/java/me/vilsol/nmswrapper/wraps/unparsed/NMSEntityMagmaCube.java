package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityMagmaCube")
public class NMSEntityMagmaCube extends NMSEntitySlime {

    public NMSEntityMagmaCube(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityMagmaCube(NMSWorld world){
        super("EntityMagmaCube", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#bF()
     */
    @ReflectiveMethod(name = "bF", types = {})
    public void bF(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#bH()
     */
    @ReflectiveMethod(name = "bH", types = {})
    public void bH(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#bR()
     */
    @ReflectiveMethod(name = "bR", types = {})
    public boolean bR(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#br()
     */
    @ReflectiveMethod(name = "br", types = {})
    public int br(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#c(float)
     */
    @ReflectiveMethod(name = "c", types = {float.class})
    public float c(float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#canSpawn()
     */
    @ReflectiveMethod(name = "canSpawn", types = {})
    public boolean canSpawn(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#cf()
     */
    @ReflectiveMethod(name = "cf", types = {})
    public NMSEntitySlime cf(){
        return new NMSEntitySlime(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#cg()
     */
    @ReflectiveMethod(name = "cg", types = {})
    public int cg(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#ch()
     */
    @ReflectiveMethod(name = "ch", types = {})
    public void ch(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#ci()
     */
    @ReflectiveMethod(name = "ci", types = {})
    public boolean ci(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#cj()
     */
    @ReflectiveMethod(name = "cj", types = {})
    public int cj(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#ck()
     */
    @ReflectiveMethod(name = "ck", types = {})
    public String ck(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#cl()
     */
    @ReflectiveMethod(name = "cl", types = {})
    public boolean cl(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#e(float, float)
     */
    @ReflectiveMethod(name = "e", types = {float.class, float.class})
    public void e(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#isBurning()
     */
    @ReflectiveMethod(name = "isBurning", types = {})
    public boolean isBurning(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMagmaCube#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public NMSEnumParticle n(){
        return new NMSEnumParticle(NMSWrapper.getInstance().exec(nmsObject));
    }

}