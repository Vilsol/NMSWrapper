package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityAnimal")
public class NMSEntityAnimal extends NMSEntityAgeable implements NMSIAnimal {

    public NMSEntityAnimal(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityAnimal(NMSWorld world){
        super("EntityAnimal", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityAnimal(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public void E(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#a(net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class, NMSItemStack.class})
    public void a(NMSEntityHuman entityHuman, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#bR()
     */
    @ReflectiveMethod(name = "bR", types = {})
    public boolean bR(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#c(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "c", types = {NMSEntityHuman.class})
    public void c(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#cq()
     */
    @ReflectiveMethod(name = "cq", types = {})
    public NMSEntityHuman cq(){
        return new NMSEntityHuman(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#cs()
     */
    @ReflectiveMethod(name = "cs", types = {})
    public void cs(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#d(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class})
    public boolean d(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#getExpValue(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "getExpValue", types = {NMSEntityHuman.class})
    public int getExpValue(NMSEntityHuman entityHuman){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#isInLove()
     */
    @ReflectiveMethod(name = "isInLove", types = {})
    public boolean isInLove(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#isTypeNotPersistent()
     */
    @ReflectiveMethod(name = "isTypeNotPersistent", types = {})
    public boolean isTypeNotPersistent(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#mate(net.minecraft.server.v1_8_R3.EntityAnimal)
     */
    @ReflectiveMethod(name = "mate", types = {NMSEntityAnimal.class})
    public boolean mate(NMSEntityAnimal entityAnimal){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityAnimal);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityAnimal#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public int w(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}