package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "BlockCloth")
public class NMSBlockCloth extends NMSBlock {

    public NMSBlockCloth(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockCloth(NMSMaterial material){
        super("BlockCloth", new Object[]{NMSMaterial.class}, new Object[]{material});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockCloth#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockCloth#g(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "g", types = {NMSIBlockData.class})
    public NMSMaterialMapColor g(NMSIBlockData iBlockData){
        return new NMSMaterialMapColor(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockCloth#getDropData(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "getDropData", types = {NMSIBlockData.class})
    public int getDropData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockCloth#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockCloth#toLegacyData(net.minecraft.server.v1_9_R1.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

}