package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "EntityMinecartChest")
public class NMSEntityMinecartChest extends NMSEntityMinecartContainer {

    public NMSEntityMinecartChest(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityMinecartChest(NMSWorld world){
        super("EntityMinecartChest", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityMinecartChest(NMSWorld world, double d, double d1, double d2){
        super("EntityMinecartChest", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartChest#a(net.minecraft.server.v1_9_R1.DamageSource)
     */
    @ReflectiveMethod(name = "a", types = {NMSDamageSource.class})
    public void a(NMSDamageSource damageSource){
        NMSWrapper.getInstance().exec(nmsObject, damageSource);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityMinecartChest#createContainer(net.minecraft.server.v1_9_R1.PlayerInventory, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "createContainer", types = {NMSPlayerInventory.class, NMSEntityHuman.class})
    public NMSContainer createContainer(NMSPlayerInventory playerInventory, NMSEntityHuman entityHuman){
        return new NMSContainer(NMSWrapper.getInstance().exec(nmsObject, playerInventory, entityHuman));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityMinecartChest#getContainerName()
     */
    @ReflectiveMethod(name = "getContainerName", types = {})
    public String getContainerName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityMinecartChest#getSize()
     */
    @ReflectiveMethod(name = "getSize", types = {})
    public int getSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartChest#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public NMSEnumMinecartType s(){
        return new NMSEnumMinecartType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartChest#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public NMSIBlockData u(){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMinecartChest#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public int w(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}