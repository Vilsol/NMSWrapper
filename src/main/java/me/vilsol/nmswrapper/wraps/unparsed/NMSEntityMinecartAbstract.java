package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import org.bukkit.util.Vector;

@ReflectiveClass(name = "EntityMinecartAbstract")
public class NMSEntityMinecartAbstract extends NMSEntity implements NMSINamableTileEntity {

    public NMSEntityMinecartAbstract(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityMinecartAbstract(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSEntityMinecartAbstract(NMSWorld world){
        super("EntityMinecartAbstract", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityMinecartAbstract(NMSWorld world, double d, double d1, double d2){
        super("EntityMinecartAbstract", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#S()
     */
    @ReflectiveMethod(name = "S", types = {})
    public NMSAxisAlignedBB S(){
        return new NMSAxisAlignedBB(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#SetDisplayBlockOffset(int)
     */
    @ReflectiveMethod(name = "SetDisplayBlockOffset", types = {int.class})
    public void SetDisplayBlockOffset(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#a(boolean)
     */
    @ReflectiveMethod(name = "a", types = {boolean.class})
    public void a(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#ae()
     */
    @ReflectiveMethod(name = "ae", types = {})
    public boolean ae(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#an()
     */
    @ReflectiveMethod(name = "an", types = {})
    public double an(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#collide(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "collide", types = {NMSEntity.class})
    public void collide(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#damageEntity(net.minecraft.server.v1_8_R3.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#die()
     */
    @ReflectiveMethod(name = "die", types = {})
    public void die(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#getCustomName()
     */
    @ReflectiveMethod(name = "getCustomName", types = {})
    public String getCustomName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#getDamage()
     */
    @ReflectiveMethod(name = "getDamage", types = {})
    public float getDamage(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#getDerailedVelocityMod()
     */
    @ReflectiveMethod(name = "getDerailedVelocityMod", types = {})
    public Vector getDerailedVelocityMod(){
        return (Vector) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#getDisplayBlock()
     */
    @ReflectiveMethod(name = "getDisplayBlock", types = {})
    public NMSIBlockData getDisplayBlock(){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#getDisplayBlockOffset()
     */
    @ReflectiveMethod(name = "getDisplayBlockOffset", types = {})
    public int getDisplayBlockOffset(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#getFlyingVelocityMod()
     */
    @ReflectiveMethod(name = "getFlyingVelocityMod", types = {})
    public Vector getFlyingVelocityMod(){
        return NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#getScoreboardDisplayName()
     */
    @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
    public NMSIChatBaseComponent getScoreboardDisplayName(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#getType()
     */
    @ReflectiveMethod(name = "getType", types = {})
    public int getType(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#hasCustomName()
     */
    @ReflectiveMethod(name = "hasCustomName", types = {})
    public boolean hasCustomName(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#j(int)
     */
    @ReflectiveMethod(name = "j", types = {int.class})
    public void j(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#k(int)
     */
    @ReflectiveMethod(name = "k", types = {int.class})
    public void k(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public double m(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public void n(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#o()
     */
    @ReflectiveMethod(name = "o", types = {})
    public void o(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#r()
     */
    @ReflectiveMethod(name = "r", types = {})
    public int r(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public NMSEnumMinecartType s(){
        return new NMSEnumMinecartType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#s_()
     */
    @ReflectiveMethod(name = "s_", types = {})
    public boolean s_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#setCustomName(java.lang.String)
     */
    @ReflectiveMethod(name = "setCustomName", types = {String.class})
    public void setCustomName(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#setDamage(float)
     */
    @ReflectiveMethod(name = "setDamage", types = {float.class})
    public void setDamage(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#setDerailedVelocityMod(org.bukkit.util.Vector)
     */
    @ReflectiveMethod(name = "setDerailedVelocityMod", types = {Vector.class})
    public void setDerailedVelocityMod(Vector vector){
        NMSWrapper.getInstance().exec(nmsObject, vector);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#setDisplayBlock(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "setDisplayBlock", types = {NMSIBlockData.class})
    public void setDisplayBlock(NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#setFlyingVelocityMod(org.bukkit.util.Vector)
     */
    @ReflectiveMethod(name = "setFlyingVelocityMod", types = {Vector.class})
    public void setFlyingVelocityMod(Vector vector){
        NMSWrapper.getInstance().exec(nmsObject, vector);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#setPosition(double, double, double)
     */
    @ReflectiveMethod(name = "setPosition", types = {double.class, double.class, double.class})
    public void setPosition(double d, double d1, double d2){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public NMSIBlockData u(){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public int w(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartAbstract#x()
     */
    @ReflectiveMethod(name = "x", types = {})
    public boolean x(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}