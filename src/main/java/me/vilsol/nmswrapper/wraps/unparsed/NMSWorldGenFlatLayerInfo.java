package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenFlatLayerInfo")
public class NMSWorldGenFlatLayerInfo extends NMSWrap {

    public NMSWorldGenFlatLayerInfo(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldGenFlatLayerInfo(int i, NMSBlock block){
        super("WorldGenFlatLayerInfo", new Object[]{int.class, NMSBlock.class}, new Object[]{i, block});
    }

    public NMSWorldGenFlatLayerInfo(int i, int i1, NMSBlock block){
        super("WorldGenFlatLayerInfo", new Object[]{int.class, int.class, NMSBlock.class}, new Object[]{i, i1, block});
    }

    public NMSWorldGenFlatLayerInfo(int i, int i1, NMSBlock block, int i2){
        super("WorldGenFlatLayerInfo", new Object[]{int.class, int.class, NMSBlock.class, int.class}, new Object[]{i, i1, block, i2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenFlatLayerInfo#b(int)
     */
    @ReflectiveMethod(name = "b", types = {int.class})
    public void b(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenFlatLayerInfo#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSIBlockData c(){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenFlatLayerInfo#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public int d(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldGenFlatLayerInfo#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}