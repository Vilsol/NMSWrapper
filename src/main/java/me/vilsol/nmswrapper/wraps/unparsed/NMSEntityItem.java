package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityItem")
public class NMSEntityItem extends NMSEntity {

    public NMSEntityItem(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityItem(NMSWorld world, double d, double d1, double d2){
        super("EntityItem", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    public NMSEntityItem(NMSWorld world, double d, double d1, double d2, NMSItemStack itemStack){
        super("EntityItem", new Object[]{NMSWorld.class, double.class, double.class, double.class, NMSItemStack.class}, new Object[]{world, d, d1, d2, itemStack});
    }

    public NMSEntityItem(NMSWorld world){
        super("EntityItem", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#W()
     */
    @ReflectiveMethod(name = "W", types = {})
    public boolean W(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public void a(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#aD()
     */
    @ReflectiveMethod(name = "aD", types = {})
    public boolean aD(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#b(java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {String.class})
    public void b(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityItem#burn(int)
     */
    @ReflectiveMethod(name = "burn", types = {int.class})
    public void burn(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#c(java.lang.String)
     */
    @ReflectiveMethod(name = "c", types = {String.class})
    public void c(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#d(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "d", types = {NMSEntityHuman.class})
    public void d(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityItem#damageEntity(net.minecraft.server.v1_8_R3.DamageSource, float)
     */
    @ReflectiveMethod(name = "damageEntity", types = {NMSDamageSource.class, float.class})
    public boolean damageEntity(NMSDamageSource damageSource, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, damageSource, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityItem#getItemStack()
     */
    @ReflectiveMethod(name = "getItemStack", types = {})
    public NMSItemStack getItemStack(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityItem#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityItem#inactiveTick()
     */
    @ReflectiveMethod(name = "inactiveTick", types = {})
    public void inactiveTick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public void j(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public String m(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public String n(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#p()
     */
    @ReflectiveMethod(name = "p", types = {})
    public void p(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#q()
     */
    @ReflectiveMethod(name = "q", types = {})
    public void q(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#r()
     */
    @ReflectiveMethod(name = "r", types = {})
    public void r(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public boolean s(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#s_()
     */
    @ReflectiveMethod(name = "s_", types = {})
    public boolean s_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityItem#setItemStack(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "setItemStack", types = {NMSItemStack.class})
    public void setItemStack(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#t_()
     */
    @ReflectiveMethod(name = "t_", types = {})
    public void t_(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public void u(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityItem#v()
     */
    @ReflectiveMethod(name = "v", types = {})
    public void v(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}