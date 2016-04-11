package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.inventory.Recipe;

@ReflectiveClass(name = "ShapelessRecipes")
public class NMSShapelessRecipes extends NMSWrap implements NMSIRecipe {

    public NMSShapelessRecipes(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ShapelessRecipes#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public int a(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ShapelessRecipes#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSItemStack b(){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ShapelessRecipes#toBukkitRecipe()
     */
    @ReflectiveMethod(name = "toBukkitRecipe", types = {})
    public Recipe toBukkitRecipe(){
        return (Recipe) NMSWrapper.getInstance().exec(nmsObject);
    }

}