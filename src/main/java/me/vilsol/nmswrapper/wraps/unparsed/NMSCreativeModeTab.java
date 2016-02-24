package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CreativeModeTab")
public class NMSCreativeModeTab extends NMSWrap {

    public NMSCreativeModeTab(Object nmsObject){
        super(nmsObject);
    }

    public NMSCreativeModeTab(int i, String s){
        super("CreativeModeTab", new Object[]{int.class, String.class}, new Object[]{i, s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CreativeModeTab#a(net.minecraft.server.v1_8_R3.EnchantmentSlotType...)
     */
    @ReflectiveMethod(name = "a", types = {NMSEnchantmentSlotType[].class})
    public NMSCreativeModeTab a(NMSEnchantmentSlotType[] array){
        return new NMSCreativeModeTab(NMSWrapper.getInstance().exec(nmsObject, array));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CreativeModeTab#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSCreativeModeTab i(){
        return new NMSCreativeModeTab(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CreativeModeTab#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public NMSCreativeModeTab k(){
        return new NMSCreativeModeTab(NMSWrapper.getInstance().exec(nmsObject));
    }

}