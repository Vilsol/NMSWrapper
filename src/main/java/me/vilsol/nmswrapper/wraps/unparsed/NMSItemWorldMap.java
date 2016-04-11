package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "ItemWorldMap")
public class NMSItemWorldMap extends NMSItemWorldMapBase {

    public NMSItemWorldMap(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemWorldMap#a(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.Entity, int, boolean)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSWorld.class, NMSEntity.class, int.class, boolean.class})
    public void a(NMSItemStack itemStack, NMSWorld world, NMSEntity entity, int i, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entity, i, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemWorldMap#c(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public NMSPacket c(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        return new NMSPacket(NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemWorldMap#d(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public void d(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemWorldMap#getSavedMap(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.World)
     */
    @ReflectiveMethod(name = "getSavedMap", types = {NMSItemStack.class, NMSWorld.class})
    public NMSWorldMap getSavedMap(NMSItemStack itemStack, NMSWorld world){
        return new NMSWorldMap(NMSWrapper.getInstance().exec(nmsObject, itemStack, world));
    }

}