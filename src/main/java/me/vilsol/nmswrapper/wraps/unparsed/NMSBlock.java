package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "Block")
public class NMSBlock extends NMSWrap {

    public NMSBlock(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlock(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSBlock(NMSMaterial material, NMSMaterialMapColor materialMapColor){
        super("Block", new Object[]{NMSMaterial.class, NMSMaterialMapColor.class}, new Object[]{material, materialMapColor});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#A()
     */
    @ReflectiveMethod(name = "A", types = {})
    public boolean A(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#B()
     */
    @ReflectiveMethod(name = "B", types = {})
    public double B(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#C()
     */
    @ReflectiveMethod(name = "C", types = {})
    public double C(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#D()
     */
    @ReflectiveMethod(name = "D", types = {})
    public double D(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public double E(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#F()
     */
    @ReflectiveMethod(name = "F", types = {})
    public double F(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#G()
     */
    @ReflectiveMethod(name = "G", types = {})
    public double G(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#I()
     */
    @ReflectiveMethod(name = "I", types = {})
    public boolean I(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#J()
     */
    @ReflectiveMethod(name = "J", types = {})
    public boolean J(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#K()
     */
    @ReflectiveMethod(name = "K", types = {})
    public NMSBlock K(){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#N()
     */
    @ReflectiveMethod(name = "N", types = {})
    public boolean N(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#P()
     */
    @ReflectiveMethod(name = "P", types = {})
    public NMSBlockStateList P(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#S()
     */
    @ReflectiveMethod(name = "S", types = {})
    public void S(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#a(net.minecraft.server.v1_8_R3.Block, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlock.class, NMSBlock.class})
    public boolean a(NMSBlock block, NMSBlock block1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block, block1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#asBlock(net.minecraft.server.v1_8_R3.Item)
     */
    @ReflectiveMethod(name = "asBlock", types = {NMSItem.class})
    public NMSBlock asBlock(NMSItem item){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject, item));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#attack(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "attack", types = {NMSWorld.class, NMSBlockPosition.class, NMSEntityHuman.class})
    public void attack(NMSWorld world, NMSBlockPosition blockPosition, NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#b(net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "b", types = {NMSBlock.class})
    public boolean b(NMSBlock block){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#c(java.lang.String)
     */
    @ReflectiveMethod(name = "c", types = {String.class})
    public NMSBlock c(String s){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#canPlace(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "canPlace", types = {NMSWorld.class, NMSBlockPosition.class})
    public boolean canPlace(NMSWorld world, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#doPhysics(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "doPhysics", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSBlock.class})
    public void doPhysics(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, block);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#dropExperience(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, int)
     */
    @ReflectiveMethod(name = "dropExperience", types = {NMSWorld.class, NMSBlockPosition.class, int.class})
    public void dropExperience(NMSWorld world, NMSBlockPosition blockPosition, int i){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#dropNaturally(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, float, int)
     */
    @ReflectiveMethod(name = "dropNaturally", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, float.class, int.class})
    public void dropNaturally(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, float f, int i){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, f, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#e(int)
     */
    @ReflectiveMethod(name = "e", types = {int.class})
    public NMSBlock e(int i){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#fromLegacyData(int)
     */
    @ReflectiveMethod(name = "fromLegacyData", types = {int.class})
    public NMSIBlockData fromLegacyData(int i){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getBlockData()
     */
    @ReflectiveMethod(name = "getBlockData", types = {})
    public NMSIBlockData getBlockData(){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getByCombinedId(int)
     */
    @ReflectiveMethod(name = "getByCombinedId", types = {int.class})
    public NMSIBlockData getByCombinedId(int i){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getById(int)
     */
    @ReflectiveMethod(name = "getById", types = {int.class})
    public NMSBlock getById(int i){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getByName(java.lang.String)
     */
    @ReflectiveMethod(name = "getByName", types = {String.class})
    public NMSBlock getByName(String s){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getCombinedId(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "getCombinedId", types = {NMSIBlockData.class})
    public int getCombinedId(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getDamage(net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getDamage", types = {NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class})
    public float getDamage(NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition){
        return (float) NMSWrapper.getInstance().exec(nmsObject, entityHuman, world, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getDropCount(int, java.util.Random)
     */
    @ReflectiveMethod(name = "getDropCount", types = {int.class, Random.class})
    public int getDropCount(int i, Random random){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i, random);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getDropData(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getDropData", types = {NMSWorld.class, NMSBlockPosition.class})
    public int getDropData(NMSWorld world, NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getDropType(net.minecraft.server.v1_8_R3.IBlockData, java.util.Random, int)
     */
    @ReflectiveMethod(name = "getDropType", types = {NMSIBlockData.class, Random.class, int.class})
    public NMSItem getDropType(NMSIBlockData iBlockData, Random random, int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, iBlockData, random, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getExpDrop(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.IBlockData, int)
     */
    @ReflectiveMethod(name = "getExpDrop", types = {NMSWorld.class, NMSIBlockData.class, int.class})
    public int getExpDrop(NMSWorld world, NMSIBlockData iBlockData, int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, iBlockData, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getId(net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "getId", types = {NMSBlock.class})
    public int getId(NMSBlock block){
        return (int) NMSWrapper.getInstance().exec(nmsObject, block);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getMaterial()
     */
    @ReflectiveMethod(name = "getMaterial", types = {})
    public NMSMaterial getMaterial(){
        return new NMSMaterial(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getPlacedState(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float, int, net.minecraft.server.v1_8_R3.EntityLiving)
     */
    @ReflectiveMethod(name = "getPlacedState", types = {NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class, int.class, NMSEntityLiving.class})
    public NMSIBlockData getPlacedState(NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2, int i, NMSEntityLiving entityLiving){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, enumDirection, f, f1, f2, i, entityLiving));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#getStateList()
     */
    @ReflectiveMethod(name = "getStateList", types = {})
    public NMSBlockStateList getStateList(){
        return new NMSBlockStateList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#i(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "i", types = {NMSIBlockData.class})
    public NMSItemStack i(NMSIBlockData iBlockData){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, iBlockData));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#interact(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interact", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityHuman.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interact(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityHuman entityHuman, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityHuman, enumDirection, f, f1, f2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#isComplexRedstone()
     */
    @ReflectiveMethod(name = "isComplexRedstone", types = {})
    public boolean isComplexRedstone(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#isOccluding()
     */
    @ReflectiveMethod(name = "isOccluding", types = {})
    public boolean isOccluding(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#isPowerSource()
     */
    @ReflectiveMethod(name = "isPowerSource", types = {})
    public boolean isPowerSource(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#isTicking()
     */
    @ReflectiveMethod(name = "isTicking", types = {})
    public boolean isTicking(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#isTileEntity()
     */
    @ReflectiveMethod(name = "isTileEntity", types = {})
    public boolean isTileEntity(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#j(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "j", types = {NMSIBlockData.class})
    public void j(NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#k(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "k", types = {NMSWorld.class, NMSBlockPosition.class})
    public void k(NMSWorld world, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#l(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "l", types = {NMSWorld.class, NMSBlockPosition.class})
    public int l(NMSWorld world, NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#o()
     */
    @ReflectiveMethod(name = "o", types = {})
    public boolean o(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#onPlace(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "onPlace", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void onPlace(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#p()
     */
    @ReflectiveMethod(name = "p", types = {})
    public int p(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#postBreak(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "postBreak", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void postBreak(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#postPlace(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.EntityLiving, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "postPlace", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class, NMSEntityLiving.class, NMSItemStack.class})
    public void postPlace(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData, NMSEntityLiving entityLiving, NMSItemStack itemStack){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData, entityLiving, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#r()
     */
    @ReflectiveMethod(name = "r", types = {})
    public int r(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#range(float, float, float)
     */
    @ReflectiveMethod(name = "range", types = {float.class, float.class, float.class})
    public float range(float f, float f1, float f2){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f, f1, f2);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#remove(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "remove", types = {NMSWorld.class, NMSBlockPosition.class, NMSIBlockData.class})
    public void remove(NMSWorld world, NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, iBlockData);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public boolean s(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#toLegacyData(net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "toLegacyData", types = {NMSIBlockData.class})
    public int toLegacyData(NMSIBlockData iBlockData){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public boolean u(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#updateShape(net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "updateShape", types = {NMSIBlockAccess.class, NMSBlockPosition.class})
    public void updateShape(NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#updateState(net.minecraft.server.v1_8_R3.IBlockData, net.minecraft.server.v1_8_R3.IBlockAccess, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "updateState", types = {NMSIBlockData.class, NMSIBlockAccess.class, NMSBlockPosition.class})
    public NMSIBlockData updateState(NMSIBlockData iBlockData, NMSIBlockAccess iBlockAccess, NMSBlockPosition blockPosition){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, iBlockData, iBlockAccess, blockPosition));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public boolean w(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Block#wasExploded(net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.Explosion)
     */
    @ReflectiveMethod(name = "wasExploded", types = {NMSWorld.class, NMSBlockPosition.class, NMSExplosion.class})
    public void wasExploded(NMSWorld world, NMSBlockPosition blockPosition, NMSExplosion explosion){
        NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, explosion);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Block#x()
     */
    @ReflectiveMethod(name = "x", types = {})
    public NMSBlock x(){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject));
    }

    @ReflectiveClass(name = "StepSound")
    public class NMSStepSound extends NMSWrap {

        public NMSStepSound(Object nmsObject){
            super(nmsObject);
        }

        public NMSStepSound(String s, float f, float f1){
            super("StepSound", new Object[]{String.class, float.class, float.class}, new Object[]{s, f, f1});
        }

        /**
         * @see net.minecraft.server.v1_8_R3.Block$StepSound#getBreakSound()
         */
        @ReflectiveMethod(name = "getBreakSound", types = {})
        public String getBreakSound(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.Block$StepSound#getPlaceSound()
         */
        @ReflectiveMethod(name = "getPlaceSound", types = {})
        public String getPlaceSound(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.Block$StepSound#getStepSound()
         */
        @ReflectiveMethod(name = "getStepSound", types = {})
        public String getStepSound(){
            return (String) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.Block$StepSound#getVolume1()
         */
        @ReflectiveMethod(name = "getVolume1", types = {})
        public float getVolume1(){
            return (float) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * @see net.minecraft.server.v1_8_R3.Block$StepSound#getVolume2()
         */
        @ReflectiveMethod(name = "getVolume2", types = {})
        public float getVolume2(){
            return (float) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

}