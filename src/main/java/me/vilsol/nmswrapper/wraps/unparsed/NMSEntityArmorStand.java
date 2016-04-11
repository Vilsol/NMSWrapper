package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityArmorStand")
public class NMSEntityArmorStand extends NMSEntityLiving {

    public NMSEntityArmorStand(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityArmorStand(NMSWorld world){
        super("EntityArmorStand", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityArmorStand(NMSWorld world, double d, double d1, double d2){
        super("EntityArmorStand", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#B()
     */
    @ReflectiveMethod(name = "B", types = {})
    public void B(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#G()
     */
    @ReflectiveMethod(name = "G", types = {})
    public void G(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#a(net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.Vec3D)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class, NMSVec3D.class})
    public boolean a(NMSEntityHuman entityHuman, NMSVec3D vec3D){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman, vec3D);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#aW()
     */
    @ReflectiveMethod(name = "aW", types = {})
    public boolean aW(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#ae()
     */
    @ReflectiveMethod(name = "ae", types = {})
    public boolean ae(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#bA()
     */
    @ReflectiveMethod(name = "bA", types = {})
    public NMSItemStack bA(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#bL()
     */
    @ReflectiveMethod(name = "bL", types = {})
    public void bL(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#bM()
     */
    @ReflectiveMethod(name = "bM", types = {})
    public boolean bM(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#d(int, net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {int.class, NMSItemStack.class})
    public boolean d(int i, NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#damageEntity(net.minecraft.server.v1_9_R1.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#g(float, float)
     */
    @ReflectiveMethod(name = "g", types = {float.class, float.class})
    public void g(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#getEquipment(int)
     */
    @ReflectiveMethod(name = "getEquipment", types = {int.class})
    public NMSItemStack getEquipment(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#h(float, float)
     */
    @ReflectiveMethod(name = "h", types = {float.class, float.class})
    public float h(float f, float f1){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#hasArms()
     */
    @ReflectiveMethod(name = "hasArms", types = {})
    public boolean hasArms(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#hasBasePlate()
     */
    @ReflectiveMethod(name = "hasBasePlate", types = {})
    public boolean hasBasePlate(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#hasGravity()
     */
    @ReflectiveMethod(name = "hasGravity", types = {})
    public boolean hasGravity(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#isBaby()
     */
    @ReflectiveMethod(name = "isBaby", types = {})
    public boolean isBaby(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#isSmall()
     */
    @ReflectiveMethod(name = "isSmall", types = {})
    public boolean isSmall(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#n(boolean)
     */
    @ReflectiveMethod(name = "n", types = {boolean.class})
    public void n(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public boolean s(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setArms(boolean)
     */
    @ReflectiveMethod(name = "setArms", types = {boolean.class})
    public void setArms(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setBasePlate(boolean)
     */
    @ReflectiveMethod(name = "setBasePlate", types = {boolean.class})
    public void setBasePlate(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setBodyPose(net.minecraft.server.v1_9_R1.Vector3f)
     */
    @ReflectiveMethod(name = "setBodyPose", types = {NMSVector3f.class})
    public void setBodyPose(NMSVector3f vector3f){
        NMSWrapper.getInstance().exec(nmsObject, vector3f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setEquipment(int, net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "setEquipment", types = {int.class, NMSItemStack.class})
    public void setEquipment(int i, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, i, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setGravity(boolean)
     */
    @ReflectiveMethod(name = "setGravity", types = {boolean.class})
    public void setGravity(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setHeadPose(net.minecraft.server.v1_9_R1.Vector3f)
     */
    @ReflectiveMethod(name = "setHeadPose", types = {NMSVector3f.class})
    public void setHeadPose(NMSVector3f vector3f){
        NMSWrapper.getInstance().exec(nmsObject, vector3f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setInvisible(boolean)
     */
    @ReflectiveMethod(name = "setInvisible", types = {boolean.class})
    public void setInvisible(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setLeftArmPose(net.minecraft.server.v1_9_R1.Vector3f)
     */
    @ReflectiveMethod(name = "setLeftArmPose", types = {NMSVector3f.class})
    public void setLeftArmPose(NMSVector3f vector3f){
        NMSWrapper.getInstance().exec(nmsObject, vector3f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setLeftLegPose(net.minecraft.server.v1_9_R1.Vector3f)
     */
    @ReflectiveMethod(name = "setLeftLegPose", types = {NMSVector3f.class})
    public void setLeftLegPose(NMSVector3f vector3f){
        NMSWrapper.getInstance().exec(nmsObject, vector3f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setRightArmPose(net.minecraft.server.v1_9_R1.Vector3f)
     */
    @ReflectiveMethod(name = "setRightArmPose", types = {NMSVector3f.class})
    public void setRightArmPose(NMSVector3f vector3f){
        NMSWrapper.getInstance().exec(nmsObject, vector3f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setRightLegPose(net.minecraft.server.v1_9_R1.Vector3f)
     */
    @ReflectiveMethod(name = "setRightLegPose", types = {NMSVector3f.class})
    public void setRightLegPose(NMSVector3f vector3f){
        NMSWrapper.getInstance().exec(nmsObject, vector3f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#setSmall(boolean)
     */
    @ReflectiveMethod(name = "setSmall", types = {boolean.class})
    public void setSmall(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#t()
     */
    @ReflectiveMethod(name = "t", types = {})
    public NMSVector3f t(){
        return new NMSVector3f(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityArmorStand#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public NMSVector3f u(){
        return new NMSVector3f(NMSWrapper.getInstance().exec(nmsObject));
    }

}