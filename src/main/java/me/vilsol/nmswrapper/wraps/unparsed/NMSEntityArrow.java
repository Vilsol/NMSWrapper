package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "EntityArrow")
public class NMSEntityArrow extends NMSEntity implements NMSIProjectile {

    public NMSEntityArrow(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityArrow(NMSWorld world){
        super("EntityArrow", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityArrow(NMSWorld world, double d, double d1, double d2){
        super("EntityArrow", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    public NMSEntityArrow(NMSWorld world, NMSEntityLiving entityLiving, NMSEntityLiving entityLiving1, float f, float f1){
        super("EntityArrow", new Object[]{NMSWorld.class, NMSEntityLiving.class, NMSEntityLiving.class, float.class, float.class}, new Object[]{world, entityLiving, entityLiving1, f, f1});
    }

    public NMSEntityArrow(NMSWorld world, NMSEntityLiving entityLiving, float f){
        super("EntityArrow", new Object[]{NMSWorld.class, NMSEntityLiving.class, float.class}, new Object[]{world, entityLiving, f});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityArrow#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityArrow#aD()
     */
    @ReflectiveMethod(name = "aD", types = {})
    public boolean aD(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityArrow#b(double)
     */
    @ReflectiveMethod(name = "b", types = {double.class})
    public void b(double d){
        NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityArrow#d(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "d", types = {NMSEntityHuman.class})
    public void d(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityArrow#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityArrow#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityArrow#inactiveTick()
     */
    @ReflectiveMethod(name = "inactiveTick", types = {})
    public void inactiveTick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityArrow#isCritical()
     */
    @ReflectiveMethod(name = "isCritical", types = {})
    public boolean isCritical(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityArrow#isInGround()
     */
    @ReflectiveMethod(name = "isInGround", types = {})
    public boolean isInGround(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityArrow#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public double j(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityArrow#s_()
     */
    @ReflectiveMethod(name = "s_", types = {})
    public boolean s_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityArrow#setCritical(boolean)
     */
    @ReflectiveMethod(name = "setCritical", types = {boolean.class})
    public void setCritical(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityArrow#setKnockbackStrength(int)
     */
    @ReflectiveMethod(name = "setKnockbackStrength", types = {int.class})
    public void setKnockbackStrength(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityArrow#shoot(double, double, double, float, float)
     */
    @ReflectiveMethod(name = "shoot", types = {double.class, double.class, double.class, float.class, float.class})
    public void shoot(double d, double d1, double d2, float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2, f, f1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityArrow#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}