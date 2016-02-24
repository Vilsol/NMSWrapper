package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemTool")
public class NMSItemTool extends NMSItem {

    public NMSItemTool(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemTool(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemTool#a(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "a", types = {NMSItemStack.class, NMSItemStack.class})
    public boolean a(NMSItemStack itemStack, NMSItemStack itemStack1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, itemStack1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemTool#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public int b(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemTool#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public NMSEnumToolMaterial g(){
        return new NMSEnumToolMaterial(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemTool#getDestroySpeed(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "getDestroySpeed", types = {NMSItemStack.class, NMSBlock.class})
    public float getDestroySpeed(NMSItemStack itemStack, NMSBlock block){
        return (float) NMSWrapper.getInstance().exec(nmsObject, itemStack, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ItemTool#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public String h(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}