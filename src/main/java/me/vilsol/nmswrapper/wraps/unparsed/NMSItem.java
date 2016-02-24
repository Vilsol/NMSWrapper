package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "Item")
public class NMSItem extends NMSWrap {

    public NMSItem(Object nmsObject){
        super(nmsObject);
    }

    public NMSItem(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#a(net.minecraft.server.v1_8_R3.Block, net.minecraft.server.v1_8_R3.Item)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlock.class, NMSItem.class})
    public void a(NMSBlock block, NMSItem item){
        NMSWrapper.getInstance().exec(nmsObject, block, item);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public int b(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#c(net.minecraft.server.v1_8_R3.Item)
     */
    @ReflectiveMethod(name = "c", types = {NMSItem.class})
    public NMSItem c(NMSItem item){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, item));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#canDestroySpecialBlock(net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "canDestroySpecialBlock", types = {NMSBlock.class})
    public boolean canDestroySpecialBlock(NMSBlock block){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#d(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "d", types = {NMSItemStack.class})
    public int d(NMSItemStack itemStack){
        return (int) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#e(java.lang.String)
     */
    @ReflectiveMethod(name = "e", types = {String.class})
    public NMSItem e(String s){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#e_(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "e_", types = {NMSItemStack.class})
    public String e_(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public boolean f(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#f_(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "f_", types = {NMSItemStack.class})
    public boolean f_(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#filterData(int)
     */
    @ReflectiveMethod(name = "filterData", types = {int.class})
    public int filterData(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#g(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "g", types = {NMSItemStack.class})
    public NMSEnumItemRarity g(NMSItemStack itemStack){
        return new NMSEnumItemRarity(NMSWrapper.getInstance().exec(nmsObject, itemStack));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#getById(int)
     */
    @ReflectiveMethod(name = "getById", types = {int.class})
    public NMSItem getById(int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#getDestroySpeed(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "getDestroySpeed", types = {NMSItemStack.class, NMSBlock.class})
    public float getDestroySpeed(NMSItemStack itemStack, NMSBlock block){
        return (float) NMSWrapper.getInstance().exec(nmsObject, itemStack, block);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#getId(net.minecraft.server.v1_8_R3.Item)
     */
    @ReflectiveMethod(name = "getId", types = {NMSItem.class})
    public int getId(NMSItem item){
        return (int) NMSWrapper.getInstance().exec(nmsObject, item);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#getItemOf(net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "getItemOf", types = {NMSBlock.class})
    public NMSItem getItemOf(NMSBlock block){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, block));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#getMaxDurability()
     */
    @ReflectiveMethod(name = "getMaxDurability", types = {})
    public int getMaxDurability(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#getMaxStackSize()
     */
    @ReflectiveMethod(name = "getMaxStackSize", types = {})
    public int getMaxStackSize(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#interactWith(net.minecraft.server.v1_8_R3.ItemStack, net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.World, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection, float, float, float)
     */
    @ReflectiveMethod(name = "interactWith", types = {NMSItemStack.class, NMSEntityHuman.class, NMSWorld.class, NMSBlockPosition.class, NMSEnumDirection.class, float.class, float.class, float.class})
    public boolean interactWith(NMSItemStack itemStack, NMSEntityHuman entityHuman, NMSWorld world, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, float f, float f1, float f2){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack, entityHuman, world, blockPosition, enumDirection, f, f1, f2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#j(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "j", types = {NMSItemStack.class})
    public String j(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#k(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "k", types = {NMSItemStack.class})
    public String k(NMSItemStack itemStack){
        return (String) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#l(net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "l", types = {NMSItemStack.class})
    public boolean l(NMSItemStack itemStack){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, itemStack);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public NMSItem n(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#p()
     */
    @ReflectiveMethod(name = "p", types = {})
    public boolean p(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#q()
     */
    @ReflectiveMethod(name = "q", types = {})
    public NMSItem q(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#r()
     */
    @ReflectiveMethod(name = "r", types = {})
    public boolean r(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public boolean s(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#setMaxDurability(int)
     */
    @ReflectiveMethod(name = "setMaxDurability", types = {int.class})
    public NMSItem setMaxDurability(int i){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Item#t()
     */
    @ReflectiveMethod(name = "t", types = {})
    public void t(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Item#usesDurability()
     */
    @ReflectiveMethod(name = "usesDurability", types = {})
    public boolean usesDurability(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}