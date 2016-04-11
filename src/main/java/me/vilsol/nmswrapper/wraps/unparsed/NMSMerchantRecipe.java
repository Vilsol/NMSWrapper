package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;

@ReflectiveClass(name = "MerchantRecipe")
public class NMSMerchantRecipe extends NMSWrap {

    public NMSMerchantRecipe(Object nmsObject){
        super(nmsObject);
    }

    public NMSMerchantRecipe(NMSNBTTagCompound nBTTagCompound){
        super("MerchantRecipe", new Object[]{NMSNBTTagCompound.class}, new Object[]{nBTTagCompound});
    }

    public NMSMerchantRecipe(NMSItemStack itemStack, NMSItemStack itemStack1, NMSItemStack itemStack2){
        super("MerchantRecipe", new Object[]{NMSItemStack.class, NMSItemStack.class, NMSItemStack.class}, new Object[]{itemStack, itemStack1, itemStack2});
    }

    public NMSMerchantRecipe(NMSItemStack itemStack, NMSItemStack itemStack1, NMSItemStack itemStack2, int i, int i1){
        super("MerchantRecipe", new Object[]{NMSItemStack.class, NMSItemStack.class, NMSItemStack.class, int.class, int.class}, new Object[]{itemStack, itemStack1, itemStack2, i, i1});
    }

    public NMSMerchantRecipe(NMSItemStack itemStack, NMSItemStack itemStack1){
        super("MerchantRecipe", new Object[]{NMSItemStack.class, NMSItemStack.class}, new Object[]{itemStack, itemStack1});
    }

    public NMSMerchantRecipe(NMSItemStack itemStack, NMSItem item){
        super("MerchantRecipe", new Object[]{NMSItemStack.class, NMSItem.class}, new Object[]{itemStack, item});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MerchantRecipe#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MerchantRecipe#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public int e(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MerchantRecipe#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public int f(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MerchantRecipe#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public void g(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MerchantRecipe#getBuyItem1()
     */
    @ReflectiveMethod(name = "getBuyItem1", types = {})
    public NMSItemStack getBuyItem1(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MerchantRecipe#getBuyItem2()
     */
    @ReflectiveMethod(name = "getBuyItem2", types = {})
    public NMSItemStack getBuyItem2(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MerchantRecipe#getBuyItem3()
     */
    @ReflectiveMethod(name = "getBuyItem3", types = {})
    public NMSItemStack getBuyItem3(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MerchantRecipe#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public boolean h(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MerchantRecipe#hasSecondItem()
     */
    @ReflectiveMethod(name = "hasSecondItem", types = {})
    public boolean hasSecondItem(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MerchantRecipe#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public boolean j(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.MerchantRecipe#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public NMSNBTTagCompound k(){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject));
    }

}