package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Achievement")
public class NMSAchievement extends NMSStatistic {

    public NMSAchievement(Object nmsObject){
        super(nmsObject);
    }

    public NMSAchievement(String s, String s1, int i, int i1, NMSItem item, NMSAchievement achievement){
        super("Achievement", new Object[]{String.class, String.class, int.class, int.class, NMSItem.class, NMSAchievement.class}, new Object[]{s, s1, i, i1, item, achievement});
    }

    public NMSAchievement(String s, String s1, int i, int i1, NMSBlock block, NMSAchievement achievement){
        super("Achievement", new Object[]{String.class, String.class, int.class, int.class, NMSBlock.class, NMSAchievement.class}, new Object[]{s, s1, i, i1, block, achievement});
    }

    public NMSAchievement(String s, String s1, int i, int i1, NMSItemStack itemStack, NMSAchievement achievement){
        super("Achievement", new Object[]{String.class, String.class, int.class, int.class, NMSItemStack.class, NMSAchievement.class}, new Object[]{s, s1, i, i1, itemStack, achievement});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Achievement#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSAchievement a(){
        return new NMSAchievement(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Achievement#b(java.lang.Class)
     */
    @ReflectiveMethod(name = "b", types = {Class.class})
    public NMSStatistic b(Class c){
        return new NMSStatistic(NMSWrapper.getInstance().exec(nmsObject, c));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Achievement#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSAchievement c(){
        return new NMSAchievement(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Achievement#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Achievement#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public NMSIChatBaseComponent e(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Achievement#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Achievement#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSStatistic h(){
        return new NMSStatistic(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Achievement#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSStatistic i(){
        return new NMSStatistic(NMSWrapper.getInstance().exec(nmsObject));
    }

}