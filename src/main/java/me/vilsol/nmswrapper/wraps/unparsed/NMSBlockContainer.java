package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "BlockContainer")
public class NMSBlockContainer extends NMSBlock implements NMSIContainer {

    public NMSBlockContainer(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockContainer(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockContainer#a(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, int, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, int.class, int.class})
    public boolean a(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockContainer#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public int b(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockContainer#e(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "e", types = {NMSWorld.class, NMSBlockPosition.class})
    public boolean e(NMSWorld world, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockContainer#remove(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "remove", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void remove(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

}