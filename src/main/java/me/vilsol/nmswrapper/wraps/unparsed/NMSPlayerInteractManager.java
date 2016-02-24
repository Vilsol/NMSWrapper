package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "PlayerInteractManager")
public class NMSPlayerInteractManager extends NMSWrap {

    public NMSPlayerInteractManager(Object nmsObject){
        super(nmsObject);
    }

    public NMSPlayerInteractManager(NMSWorld world){
        super("PlayerInteractManager", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInteractManager#a(net.minecraft.server.v1_8_R3.WorldServer)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorldServer.class})
    public void a(NMSWorldServer worldServer){
        NMSWrapper.getInstance().exec(nmsObject, worldServer);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInteractManager#b(net.minecraft.server.v1_8_R3.WorldSettings$EnumGamemode)
     */
    @ReflectiveMethod(name = "b", types = {NMSEnumGamemode.class})
    public void b(NMSEnumGamemode enumGamemode){
        NMSWrapper.getInstance().exec(nmsObject, enumGamemode);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInteractManager#breakBlock(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "breakBlock", types = {NMSBlockPosition.class})
    public boolean breakBlock(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInteractManager#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public boolean c(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PlayerInteractManager#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public void e(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInteractManager#getGameMode()
     */
    @ReflectiveMethod(name = "getGameMode", types = {})
    public NMSEnumGamemode getGameMode(){
        return new NMSEnumGamemode(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInteractManager#interact(net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interact", types = {NMSEntityHuman.class, NMSWorld.class, NMSItemStack.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interact(NMSEntityHuman entityHuman, NMSWorld world, NMSItemStack itemStack, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman, world, itemStack, blockPosition, enumDirection, f, f1, f2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInteractManager#isCreative()
     */
    @ReflectiveMethod(name = "isCreative", types = {})
    public boolean isCreative(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInteractManager#setGameMode(net.minecraft.server.v1_8_R3.WorldSettings$EnumGamemode)
     */
    @ReflectiveMethod(name = "setGameMode", types = {NMSEnumGamemode.class})
    public void setGameMode(NMSEnumGamemode enumGamemode){
        NMSWrapper.getInstance().exec(nmsObject, enumGamemode);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PlayerInteractManager#useItem(net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "useItem", types = {NMSEntityHuman.class, NMSWorld.class, NMSItemStack.class})
    public boolean useItem(NMSEntityHuman entityHuman, NMSWorld world, NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman, world, itemStack);
    }

}