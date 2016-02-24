package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldData")
public class NMSWorldData extends NMSWrap {

    public NMSWorldData(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldData(NMSNBTTagCompound nBTTagCompound){
        super("WorldData", new Object[]{NMSNBTTagCompound.class}, new Object[]{nBTTagCompound});
    }

    public NMSWorldData(NMSWorldSettings worldSettings, String s){
        super("WorldData", new Object[]{NMSWorldSettings.class, String.class}, new Object[]{worldSettings, s});
    }

    public NMSWorldData(NMSWorldData worldData){
        super("WorldData", new Object[]{NMSWorldData.class}, new Object[]{worldData});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#A()
     */
    @ReflectiveMethod(name = "A", types = {})
    public int A(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#C()
     */
    @ReflectiveMethod(name = "C", types = {})
    public double C(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#D()
     */
    @ReflectiveMethod(name = "D", types = {})
    public double D(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public double E(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#F()
     */
    @ReflectiveMethod(name = "F", types = {})
    public long F(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#G()
     */
    @ReflectiveMethod(name = "G", types = {})
    public double G(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#H()
     */
    @ReflectiveMethod(name = "H", types = {})
    public double H(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#I()
     */
    @ReflectiveMethod(name = "I", types = {})
    public double I(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#J()
     */
    @ReflectiveMethod(name = "J", types = {})
    public int J(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#K()
     */
    @ReflectiveMethod(name = "K", types = {})
    public int K(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#a(net.minecraft.server.v1_8_R3.CrashReportSystemDetails)
     */
    @ReflectiveMethod(name = "a", types = {NMSCrashReportSystemDetails.class})
    public void a(NMSCrashReportSystemDetails crashReportSystemDetails){
        NMSWrapper.getInstance().exec(nmsObject, crashReportSystemDetails);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#b(double)
     */
    @ReflectiveMethod(name = "b", types = {double.class})
    public void b(double d){
        NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#c(double)
     */
    @ReflectiveMethod(name = "c", types = {double.class})
    public void c(double d){
        NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#checkName(java.lang.String)
     */
    @ReflectiveMethod(name = "checkName", types = {String.class})
    public void checkName(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#d(double)
     */
    @ReflectiveMethod(name = "d", types = {double.class})
    public void d(double d){
        NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#e(boolean)
     */
    @ReflectiveMethod(name = "e", types = {boolean.class})
    public void e(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#f(double)
     */
    @ReflectiveMethod(name = "f", types = {double.class})
    public void f(double d){
        NMSWrapper.getInstance().exec(nmsObject, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#g(boolean)
     */
    @ReflectiveMethod(name = "g", types = {boolean.class})
    public void g(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#getDayTime()
     */
    @ReflectiveMethod(name = "getDayTime", types = {})
    public long getDayTime(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#getDifficulty()
     */
    @ReflectiveMethod(name = "getDifficulty", types = {})
    public NMSEnumDifficulty getDifficulty(){
        return new NMSEnumDifficulty(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#getGameType()
     */
    @ReflectiveMethod(name = "getGameType", types = {})
    public NMSEnumGamemode getGameType(){
        return new NMSEnumGamemode(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#getGeneratorOptions()
     */
    @ReflectiveMethod(name = "getGeneratorOptions", types = {})
    public String getGeneratorOptions(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#getSeed()
     */
    @ReflectiveMethod(name = "getSeed", types = {})
    public long getSeed(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#getThunderDuration()
     */
    @ReflectiveMethod(name = "getThunderDuration", types = {})
    public int getThunderDuration(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#getTime()
     */
    @ReflectiveMethod(name = "getTime", types = {})
    public long getTime(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#getType()
     */
    @ReflectiveMethod(name = "getType", types = {})
    public NMSWorldType getType(){
        return new NMSWorldType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#getWeatherDuration()
     */
    @ReflectiveMethod(name = "getWeatherDuration", types = {})
    public int getWeatherDuration(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#hasStorm()
     */
    @ReflectiveMethod(name = "hasStorm", types = {})
    public boolean hasStorm(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#i(int)
     */
    @ReflectiveMethod(name = "i", types = {int.class})
    public void i(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#isDifficultyLocked()
     */
    @ReflectiveMethod(name = "isDifficultyLocked", types = {})
    public boolean isDifficultyLocked(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#isHardcore()
     */
    @ReflectiveMethod(name = "isHardcore", types = {})
    public boolean isHardcore(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#isThundering()
     */
    @ReflectiveMethod(name = "isThundering", types = {})
    public boolean isThundering(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#j(int)
     */
    @ReflectiveMethod(name = "j", types = {int.class})
    public void j(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#k(int)
     */
    @ReflectiveMethod(name = "k", types = {int.class})
    public void k(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public int l(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#setDayTime(long)
     */
    @ReflectiveMethod(name = "setDayTime", types = {long.class})
    public void setDayTime(long l){
        NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#setDifficulty(net.minecraft.server.v1_8_R3.EnumDifficulty)
     */
    @ReflectiveMethod(name = "setDifficulty", types = {NMSEnumDifficulty.class})
    public void setDifficulty(NMSEnumDifficulty enumDifficulty){
        NMSWrapper.getInstance().exec(nmsObject, enumDifficulty);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#setGameType(net.minecraft.server.v1_8_R3.WorldSettings$EnumGamemode)
     */
    @ReflectiveMethod(name = "setGameType", types = {NMSEnumGamemode.class})
    public void setGameType(NMSEnumGamemode enumGamemode){
        NMSWrapper.getInstance().exec(nmsObject, enumGamemode);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#setSpawn(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "setSpawn", types = {NMSBlockPosition.class})
    public void setSpawn(NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#setStorm(boolean)
     */
    @ReflectiveMethod(name = "setStorm", types = {boolean.class})
    public void setStorm(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#setThunderDuration(int)
     */
    @ReflectiveMethod(name = "setThunderDuration", types = {int.class})
    public void setThunderDuration(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#setThundering(boolean)
     */
    @ReflectiveMethod(name = "setThundering", types = {boolean.class})
    public void setThundering(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#setTime(long)
     */
    @ReflectiveMethod(name = "setTime", types = {long.class})
    public void setTime(long l){
        NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#setWeatherDuration(int)
     */
    @ReflectiveMethod(name = "setWeatherDuration", types = {int.class})
    public void setWeatherDuration(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldData#shouldGenerateMapFeatures()
     */
    @ReflectiveMethod(name = "shouldGenerateMapFeatures", types = {})
    public boolean shouldGenerateMapFeatures(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#v()
     */
    @ReflectiveMethod(name = "v", types = {})
    public boolean v(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public boolean w(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldData#x()
     */
    @ReflectiveMethod(name = "x", types = {})
    public NMSGameRules x(){
        return new NMSGameRules(NMSWrapper.getInstance().exec(nmsObject));
    }

}