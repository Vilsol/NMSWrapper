package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import org.bukkit.event.entity.CreatureSpawnEvent;

@ReflectiveClass(name = "ItemMonsterEgg")
public class NMSItemMonsterEgg extends NMSItem {

    public NMSItemMonsterEgg(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemMonsterEgg#a(net.minecraft.server.v1_9_R1.World, int, double, double, double)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, int.class, double.class, double.class, double.class})
    public NMSEntity a(NMSWorld world, int i, double d, double d1, double d2){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject, world, i, d, d1, d2));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemMonsterEgg#interactWith(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interactWith", types = {NMSItemStack.class, NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interactWith(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, world, blockPosition, enumDirection, f, f1, f2);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemMonsterEgg#spawnCreature(net.minecraft.server.v1_9_R1.World, int, double, double, double, org.bukkit.event.entity.CreatureSpawnEvent$SpawnReason)
     */
    @ReflectiveMethod(name = "spawnCreature", types = {NMSWorld.class, int.class, double.class, double.class, double.class, CreatureSpawnEvent.SpawnReason.class})
    public NMSEntity spawnCreature(NMSWorld world, int i, double d, double d1, double d2, CreatureSpawnEvent.SpawnReason spawnReason){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject, world, i, d, d1, d2, spawnReason));
    }

}