package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.Reflection;
import me.vilsol.nmswrapper.wraps.nbt.NMSNBTTagCompound;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

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

    public Boolean hasTag() {
        return (Boolean) Reflection.executeMethod(nmsObject, "hasTag", new Object[]{}, new Object[]{});
    }

    public NMSNBTTagCompound getTag() {
        return new NMSNBTTagCompound(Reflection.executeMethod(nmsObject, "getTag", new Object[]{}, new Object[]{}));
    }

    public void setData(int data){
        Reflection.executeMethod(nmsObject, "setData", new Object[]{int.class}, new Object[]{data});
    }

    public NMSItem getItem(){
        return new NMSItem(Reflection.executeMethod(nmsObject, "getItem", new Object[]{}, new Object[]{}));
    }

    public ItemStack getItemStack(){
        return (ItemStack) Reflection.craftStaticReflection("inventory.CraftItemStack", "asCraftMirror", new Object[]{"ItemStack"}, new Object[]{nmsObject});
    }

    public void setTag(NMSNBTTagCompound tag) {
        Reflection.executeMethod(nmsObject, "setTag", new Object[]{"NBTTagCompound"}, new Object[]{tag});
    }

}
