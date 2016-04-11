package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemSword")
public class NMSItemSword extends NMSItem {

    public NMSItemSword(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemSword(NMSEnumToolMaterial enumToolMaterial){
        super("ItemSword", new Object[]{NMSEnumToolMaterial.class}, new Object[]{enumToolMaterial});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemSword#a(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSItemStack.class})
    public boolean a(NMSItemStack itemStack, NMSItemStack itemStack1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, itemStack1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemSword#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public int b(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemSword#canDestroySpecialBlock(net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "canDestroySpecialBlock", types = {NMSBlock.class})
    public boolean canDestroySpecialBlock(NMSBlock block){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemSword#d(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class})
    public int d(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemSword#e(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "e", types = {NMSItemStack.class})
    public NMSEnumAnimation e(NMSItemStack itemStack){
        return new NMSEnumAnimation(NMSWrapper.getInstance().exec(nmsObject, itemStack));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemSword#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public float g(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemSword#getDestroySpeed(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.Block)
     */
    @ReflectiveMethod(name = "getDestroySpeed", types = {NMSItemStack.class, NMSBlock.class})
    public float getDestroySpeed(NMSItemStack itemStack, NMSBlock block){
        return (float) NMSWrapper.getInstance().exec(nmsObject, itemStack, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemSword#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public String h(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}