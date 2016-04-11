package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemBlock")
public class NMSItemBlock extends NMSItem {

    public NMSItemBlock(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemBlock(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSItemBlock(NMSBlock block){
        super("ItemBlock", new Object[]{NMSBlock.class}, new Object[]{block});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemBlock#a(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSEntityHuman.class, NMSBlockPosition.class, NMSItemStack.class})
    public boolean a(NMSWorld world, NMSEntityHuman entityHuman, NMSBlockPosition blockPosition, NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, entityHuman, blockPosition, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemBlock#b(java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {String.class})
    public NMSItemBlock b(String s){
        return new NMSItemBlock(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemBlock#c(java.lang.String)
     */
    @ReflectiveMethod(name = "c", types = {String.class})
    public NMSItem c(String s){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemBlock#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSBlock d(){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemBlock#e_(net.minecraft.server.v1_9_R1.ItemStack)
     */
    @ReflectiveMethod(name = "e_", types = {NMSItemStack.class})
    public String e_(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemBlock#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemBlock#interactWith(net.minecraft.server.v1_9_R1.ItemStack, net.minecraft.server.v1_9_R1.EntityHuman, net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interactWith", types = {NMSItemStack.class, NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interactWith(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, world, blockPosition, enumDirection, f, f1, f2);
    }

}