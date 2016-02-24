package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "EntityWaterAnimal")
public class NMSEntityWaterAnimal extends NMSEntityInsentient implements NMSIAnimal {

    public NMSEntityWaterAnimal(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityWaterAnimal(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSEntityWaterAnimal(NMSWorld world){
        super("EntityWaterAnimal", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWaterAnimal#K()
     */
    @ReflectiveMethod(name = "K", types = {})
    public void K(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWaterAnimal#aL()
     */
    @ReflectiveMethod(name = "aL", types = {})
    public boolean aL(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWaterAnimal#aY()
     */
    @ReflectiveMethod(name = "aY", types = {})
    public boolean aY(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWaterAnimal#bR()
     */
    @ReflectiveMethod(name = "bR", types = {})
    public boolean bR(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityWaterAnimal#canSpawn()
     */
    @ReflectiveMethod(name = "canSpawn", types = {})
    public boolean canSpawn(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityWaterAnimal#getExpValue(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "getExpValue", types = {NMSEntityHuman.class})
    public int getExpValue(NMSEntityHuman entityHuman){
        return (int) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityWaterAnimal#isTypeNotPersistent()
     */
    @ReflectiveMethod(name = "isTypeNotPersistent", types = {})
    public boolean isTypeNotPersistent(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityWaterAnimal#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public int w(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}