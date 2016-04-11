package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSNBTTagList;

import java.util.Random;

@ReflectiveClass(name = "ItemEnchantedBook")
public class NMSItemEnchantedBook extends NMSItem {

    public NMSItemEnchantedBook(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemEnchantedBook#a(java.util.Random, int, int, int)
     */
    @ReflectiveMethod(name = "a", types = {Random.class, int.class, int.class, int.class})
    public NMSStructurePieceTreasure a(Random random, int i, int i1, int i2){
        return new NMSStructurePieceTreasure(NMSWrapper.getInstance().exec(nmsObject, random, i, i1, i2));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemEnchantedBook#b(java.util.Random)
     */
    @ReflectiveMethod(name = "b", types = {Random.class})
    public NMSStructurePieceTreasure b(Random random){
        return new NMSStructurePieceTreasure(NMSWrapper.getInstance().exec(nmsObject, random));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemEnchantedBook#f_(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "f_", types = {NMSItemStack.class})
    public boolean f_(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemEnchantedBook#g(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "g", types = {NMSItemStack.class})
    public NMSEnumItemRarity g(NMSItemStack itemStack){
        return new NMSEnumItemRarity(NMSWrapper.getInstance().exec(nmsObject, itemStack));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemEnchantedBook#h(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "h", types = {NMSItemStack.class})
    public NMSNBTTagList h(NMSItemStack itemStack){
        return new NMSNBTTagList(NMSWrapper.getInstance().exec(nmsObject, itemStack));
    }

}