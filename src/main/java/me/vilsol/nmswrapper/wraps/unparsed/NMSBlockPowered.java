package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockPowered")
public class NMSBlockPowered extends NMSBlock {

    public NMSBlockPowered(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockPowered(NMSMaterial material, NMSMaterialMapColor materialMapColor){
        super("BlockPowered", new Object[]{NMSMaterial.class, NMSMaterialMapColor.class}, new Object[]{material, materialMapColor});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockPowered#a(net.minecraft.server.v1_9_R1.IBlockAccess, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.IBlockData, net.minecraft.server.v1_9_R1.EnumDirection)
     */
    @ReflectiveMethod(name = "a", types = {NMSIBlockAccess.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEnumDirection.class})
    public int a(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEnumDirection enumDirection){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition, iBlockData, enumDirection);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.BlockPowered#isPowerSource()
     */
    @ReflectiveMethod(name = "isPowerSource", types = {})
    public boolean isPowerSource(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}