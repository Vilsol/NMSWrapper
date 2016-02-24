package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "BlockAnvil")
public class NMSBlockAnvil extends NMSBlockFalling {

    public NMSBlockAnvil(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockAnvil#a(net.minecraft.server.v1_8_R3.EntityFallingBlock)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityFallingBlock.class})
    public void a(NMSEntityFallingBlock entityFallingBlock){
        NMSWrapper.getInstance().exec(nmsObject, entityFallingBlock);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockAnvil#a_(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "a_", types = {NMSWorld.class, NMSBlockPosition.class})
    public void a_(NMSWorld world, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockAnvil#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockAnvil#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockAnvil#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockAnvil#getDropData(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "getDropData", types = {NMSIBlockData.class})
    public int getDropData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockAnvil#getPlacedState(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float, int, net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "getPlacedState", types = {NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class, int.class, NMSEntityLiving.class})
    public NMSIBlockData getPlacedState(NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2, int i, NMSEntityLiving entityLiving){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, enumDirection, f, f1, f2, i, entityLiving));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockAnvil#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockAnvil#interact(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interact", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityHuman.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interact(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityHuman entityHuman, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityHuman, enumDirection, f, f1, f2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockAnvil#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockAnvil#updateShape(net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "updateShape", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public void updateShape(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
    }

    @ReflectiveClass(name = "TileEntityContainerAnvil")
    public class NMSTileEntityContainerAnvil extends NMSWrap implements NMSITileEntityContainer {

        public NMSTileEntityContainerAnvil(Object nmsObject){
            super(nmsObject);
        }

        public NMSTileEntityContainerAnvil(NMSWorld world, NMSBlockPosition blockPosition){
            super("TileEntityContainerAnvil", new Object[]{NMSWorld.class, NMSBlockPosition.class}, new Object[]{world, blockPosition});
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockAnvil$TileEntityContainerAnvil#createContainer(net.minecraft.server.v1_8_R3.PlayerInventory, net.minecraft.server.v1_8_R3.EntityHuman)
         */
        @ReflectiveMethod(name = "createContainer", types = {NMSPlayerInventory.class, NMSEntityHuman.class})
        public NMSContainer createContainer(NMSPlayerInventory playerInventory, NMSEntityHuman entityHuman){
            return new NMSContainer(NMSWrapper.getInstance().exec(nmsObject, playerInventory, entityHuman));
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockAnvil$TileEntityContainerAnvil#getContainerName()
         */
        @ReflectiveMethod(name = "getContainerName", types = {})
        public String getContainerName(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockAnvil$TileEntityContainerAnvil#getName()
         */
        @ReflectiveMethod(name = "getName", types = {})
        public String getName(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockAnvil$TileEntityContainerAnvil#getScoreboardDisplayName()
         */
        @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
        public NMSIChatBaseComponent getScoreboardDisplayName(){
            return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockAnvil$TileEntityContainerAnvil#hasCustomName()
         */
        @ReflectiveMethod(name = "hasCustomName", types = {})
        public boolean hasCustomName(){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

}