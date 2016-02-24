package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockJukeBox")
public class NMSBlockJukeBox extends NMSBlockContainer {

    public NMSBlockJukeBox(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockJukeBox#a(net.minecraft.server.v1_8_R3.World, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, int.class})
    public NMSTileEntity a(NMSWorld world, int i){
        return new NMSTileEntity(NMSWrapper.getInstance().exec(nmsObject, world, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockJukeBox#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public int b(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockJukeBox#dropNaturally(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, float, int)
     */
    @ReflectiveMethod(name = "dropNaturally", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, float.class, int.class})
    public void dropNaturally(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, float f, int i){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, f, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockJukeBox#dropRecord(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "dropRecord", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void dropRecord(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockJukeBox#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockJukeBox#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockJukeBox#interact(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interact", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityHuman.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interact(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityHuman entityHuman, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityHuman, enumDirection, f, f1, f2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockJukeBox#isComplexRedstone()
     */
    @ReflectiveMethod(name = "isComplexRedstone", types = {})
    public boolean isComplexRedstone(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockJukeBox#l(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "l", types = {NMSWorld.class, NMSBlockPosition.class})
    public int l(NMSWorld world, NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockJukeBox#remove(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "remove", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void remove(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockJukeBox#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    @ReflectiveClass(name = "TileEntityRecordPlayer")
    public class NMSTileEntityRecordPlayer extends NMSTileEntity {

        public NMSTileEntityRecordPlayer(Object nmsObject){
            super(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.BlockJukeBox$TileEntityRecordPlayer#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
        public void a(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.BlockJukeBox$TileEntityRecordPlayer#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockJukeBox$TileEntityRecordPlayer#getRecord()
         */
        @ReflectiveMethod(name = "getRecord", types = {})
        public NMSItemStack getRecord(){
            return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockJukeBox$TileEntityRecordPlayer#setRecord(net.minecraft.server.v1_8_R3.ItemStack)
         */
        @ReflectiveMethod(name = "setRecord", types = {NMSItemStack.class})
        public void setRecord(NMSItemStack itemStack){
            NMSWrapper.getInstance().exec(nmsObject, itemStack);
        }

    }

}