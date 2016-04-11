package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemGoldenApple")
public class NMSItemGoldenApple extends NMSItemFood {

    public NMSItemGoldenApple(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemGoldenApple(int i, float f, boolean b){
        super("ItemGoldenApple", new Object[]{int.class, float.class, boolean.class}, new Object[]{i, f, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemGoldenApple#c(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public void c(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemGoldenApple#g(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "g", types = {NMSItemStack.class})
    public NMSEnumItemRarity g(NMSItemStack itemStack){
        return new NMSEnumItemRarity(NMSWrapper.getInstance().exec(nmsObject, itemStack));
    }

}