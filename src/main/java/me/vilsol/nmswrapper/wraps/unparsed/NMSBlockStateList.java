package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockStateList")
public class NMSBlockStateList extends NMSWrap {

    public NMSBlockStateList(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockStateList(NMSBlock block, NMSIBlockState[] array){
        super("BlockStateList", new Object[]{NMSBlock.class, NMSIBlockState[].class}, new Object[]{block, array});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockStateList#getBlock()
     */
    @ReflectiveMethod(name = "getBlock", types = {})
    public NMSBlock getBlock(){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockStateList#getBlockData()
     */
    @ReflectiveMethod(name = "getBlockData", types = {})
    public NMSIBlockData getBlockData(){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockStateList#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}