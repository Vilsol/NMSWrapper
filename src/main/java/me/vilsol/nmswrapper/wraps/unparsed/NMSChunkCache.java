package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChunkCache")
public class NMSChunkCache extends NMSWrap implements NMSIBlockAccess {

    public NMSChunkCache(Object nmsObject){
        super(nmsObject);
    }

    public NMSChunkCache(NMSWorld world, NMSBlockPosition blockPosition, NMSBlockPosition blockPosition1, int i){
        super("ChunkCache", new Object[]{NMSWorld.class, NMSBlockPosition.class, NMSBlockPosition.class, int.class}, new Object[]{world, blockPosition, blockPosition1, i});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkCache#getBlockPower(net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.EnumDirection)
     */
    @ReflectiveMethod(name = "getBlockPower", types = {NMSBlockPosition.class, NMSEnumDirection.class})
    public int getBlockPower(NMSBlockPosition blockPosition, NMSEnumDirection enumDirection){
        return (int) NMSWrapper.getInstance().exec(nmsObject, blockPosition, enumDirection);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkCache#getTileEntity(net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "getTileEntity", types = {NMSBlockPosition.class})
    public NMSTileEntity getTileEntity(NMSBlockPosition blockPosition){
        return new NMSTileEntity(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkCache#getType(net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "getType", types = {NMSBlockPosition.class})
    public NMSIBlockData getType(NMSBlockPosition blockPosition){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ChunkCache#isEmpty(net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "isEmpty", types = {NMSBlockPosition.class})
    public boolean isEmpty(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

}