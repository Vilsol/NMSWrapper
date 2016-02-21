package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.Reflection;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.nbt.NMSNBTTagCompound;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@ReflectiveClass(name = "ItemStack")
public class NMSItemStack extends NMSWrap {

    public NMSItemStack(Material type) {
        this(type, 1);
    }

    public NMSItemStack(Material type, int count) {
        this(type, count, 0);
    }

    public NMSItemStack(Material type, int count, int damage) {
        this(new ItemStack(type, count));
        setData(damage);
    }

    public NMSItemStack(ItemStack itemStack) {
        super(Reflection.craftStaticReflection("inventory.CraftItemStack", "asNMSCopy", new Object[]{ItemStack.class}, new Object[]{itemStack}));
    }

    @ReflectiveMethod(name = "hasTag")
    public Boolean hasTag() {
        return (Boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveMethod(name = "getTag")
    public NMSNBTTagCompound getTag() {
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject));
    }

    @ReflectiveMethod(name = "setData", types = {int.class})
    public void setData(int data){
        NMSWrapper.getInstance().exec(nmsObject, data);
    }

    @ReflectiveMethod(name = "getItem")
    public NMSItem getItem(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    public ItemStack getAsItemStack(){
        // TODO Make this more efficient
        return (ItemStack) Reflection.craftStaticReflection("inventory.CraftItemStack", "asCraftMirror", new Object[]{"ItemStack"}, new Object[]{nmsObject});
    }

    @ReflectiveMethod(name = "setTag", types = {NMSNBTTagCompound.class})
    public void setTag(NMSNBTTagCompound tag) {
        NMSWrapper.getInstance().exec(nmsObject, tag);
    }

}
