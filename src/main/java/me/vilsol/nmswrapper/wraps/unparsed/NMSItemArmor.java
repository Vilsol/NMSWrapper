package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemArmor")
public class NMSItemArmor extends NMSItem {

    public NMSItemArmor(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemArmor(NMSEnumArmorMaterial enumArmorMaterial, int i, int i1){
        super("ItemArmor", new Object[]{NMSEnumArmorMaterial.class, int.class, int.class}, new Object[]{enumArmorMaterial, i, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemArmor#a(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSWorld.class, NMSEntityHuman.class})
    public NMSItemStack a(NMSItemStack itemStack, NMSWorld world, NMSEntityHuman entityHuman){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, itemStack, world, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemArmor#b(net.minecraft.server.v1_9_R1.ItemStack, int)
     */
    @ReflectiveMethod(name = "b", types = {NMSItemStack.class, int.class})
    public void b(NMSItemStack itemStack, int i){
        NMSWrapper.getInstance().exec(nmsObject, itemStack, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemArmor#c(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "c", types = {NMSItemStack.class})
    public void c(NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemArmor#d_(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "d_", types = {NMSItemStack.class})
    public boolean d_(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemArmor#x_()
     */
    @ReflectiveMethod(name = "x_", types = {})
    public NMSEnumArmorMaterial x_(){
        return new NMSEnumArmorMaterial(NMSWrapper.getInstance().exec(nmsObject));
    }

}