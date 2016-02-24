package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockWorkbench")
public class NMSBlockWorkbench extends NMSBlock {

    public NMSBlockWorkbench(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockWorkbench#interact(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interact", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityHuman.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interact(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityHuman entityHuman, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityHuman, enumDirection, f, f1, f2);
    }

    @ReflectiveClass(name = "TileEntityContainerWorkbench")
    public class NMSTileEntityContainerWorkbench extends NMSWrap implements NMSITileEntityContainer {

        public NMSTileEntityContainerWorkbench(Object nmsObject){
            super(nmsObject);
        }

        public NMSTileEntityContainerWorkbench(NMSWorld world, NMSBlockPosition blockPosition){
            super("TileEntityContainerWorkbench", new Object[]{NMSWorld.class, NMSBlockPosition.class}, new Object[]{world, blockPosition});
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockWorkbench$TileEntityContainerWorkbench#createContainer(net.minecraft.server.v1_8_R3.PlayerInventory, net.minecraft.server.v1_8_R3.EntityHuman)
         */
        @ReflectiveMethod(name = "createContainer", types = {NMSPlayerInventory.class, NMSEntityHuman.class})
        public NMSContainer createContainer(NMSPlayerInventory playerInventory, NMSEntityHuman entityHuman){
            return new NMSContainer(NMSWrapper.getInstance().exec(nmsObject, playerInventory, entityHuman));
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockWorkbench$TileEntityContainerWorkbench#getContainerName()
         */
        @ReflectiveMethod(name = "getContainerName", types = {})
        public String getContainerName(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockWorkbench$TileEntityContainerWorkbench#getName()
         */
        @ReflectiveMethod(name = "getName", types = {})
        public String getName(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockWorkbench$TileEntityContainerWorkbench#getScoreboardDisplayName()
         */
        @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
        public NMSIChatBaseComponent getScoreboardDisplayName(){
            return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * @see net.minecraft.server.v1_8_R3.BlockWorkbench$TileEntityContainerWorkbench#hasCustomName()
         */
        @ReflectiveMethod(name = "hasCustomName", types = {})
        public boolean hasCustomName(){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

}