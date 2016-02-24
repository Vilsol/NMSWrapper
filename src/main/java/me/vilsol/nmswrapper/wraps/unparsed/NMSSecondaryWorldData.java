package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "SecondaryWorldData")
public class NMSSecondaryWorldData extends NMSWorldData {

    public NMSSecondaryWorldData(Object nmsObject){
        super(nmsObject);
    }

    public NMSSecondaryWorldData(NMSWorldData worldData){
        super("SecondaryWorldData", new Object[]{NMSWorldData.class}, new Object[]{worldData});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#a(net.minecraft.server.v1_8_R3.WorldType)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorldType.class})
    public void a(NMSWorldType worldType){
        NMSWrapper.getInstance().exec(nmsObject, worldType);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#c(boolean)
     */
    @ReflectiveMethod(name = "c", types = {boolean.class})
    public void c(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#d(boolean)
     */
    @ReflectiveMethod(name = "d", types = {boolean.class})
    public void d(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#e(boolean)
     */
    @ReflectiveMethod(name = "e", types = {boolean.class})
    public void e(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#getDayTime()
     */
    @ReflectiveMethod(name = "getDayTime", types = {})
    public long getDayTime(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#getDifficulty()
     */
    @ReflectiveMethod(name = "getDifficulty", types = {})
    public NMSEnumDifficulty getDifficulty(){
        return new NMSEnumDifficulty(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#getGameType()
     */
    @ReflectiveMethod(name = "getGameType", types = {})
    public NMSEnumGamemode getGameType(){
        return new NMSEnumGamemode(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#getSeed()
     */
    @ReflectiveMethod(name = "getSeed", types = {})
    public long getSeed(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#getThunderDuration()
     */
    @ReflectiveMethod(name = "getThunderDuration", types = {})
    public int getThunderDuration(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#getTime()
     */
    @ReflectiveMethod(name = "getTime", types = {})
    public long getTime(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#getType()
     */
    @ReflectiveMethod(name = "getType", types = {})
    public NMSWorldType getType(){
        return new NMSWorldType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#getWeatherDuration()
     */
    @ReflectiveMethod(name = "getWeatherDuration", types = {})
    public int getWeatherDuration(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#hasStorm()
     */
    @ReflectiveMethod(name = "hasStorm", types = {})
    public boolean hasStorm(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSNBTTagCompound i(){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#isDifficultyLocked()
     */
    @ReflectiveMethod(name = "isDifficultyLocked", types = {})
    public boolean isDifficultyLocked(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#isHardcore()
     */
    @ReflectiveMethod(name = "isHardcore", types = {})
    public boolean isHardcore(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#isThundering()
     */
    @ReflectiveMethod(name = "isThundering", types = {})
    public boolean isThundering(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public int l(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#setDayTime(long)
     */
    @ReflectiveMethod(name = "setDayTime", types = {long.class})
    public void setDayTime(long l){
        NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#setDifficulty(net.minecraft.server.v1_8_R3.EnumDifficulty)
     */
    @ReflectiveMethod(name = "setDifficulty", types = {NMSEnumDifficulty.class})
    public void setDifficulty(NMSEnumDifficulty enumDifficulty){
        NMSWrapper.getInstance().exec(nmsObject, enumDifficulty);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#setSpawn(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "setSpawn", types = {NMSBlockPosition.class})
    public void setSpawn(NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#setStorm(boolean)
     */
    @ReflectiveMethod(name = "setStorm", types = {boolean.class})
    public void setStorm(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#setThunderDuration(int)
     */
    @ReflectiveMethod(name = "setThunderDuration", types = {int.class})
    public void setThunderDuration(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#setThundering(boolean)
     */
    @ReflectiveMethod(name = "setThundering", types = {boolean.class})
    public void setThundering(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#setTime(long)
     */
    @ReflectiveMethod(name = "setTime", types = {long.class})
    public void setTime(long l){
        NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#setWeatherDuration(int)
     */
    @ReflectiveMethod(name = "setWeatherDuration", types = {int.class})
    public void setWeatherDuration(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#shouldGenerateMapFeatures()
     */
    @ReflectiveMethod(name = "shouldGenerateMapFeatures", types = {})
    public boolean shouldGenerateMapFeatures(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#v()
     */
    @ReflectiveMethod(name = "v", types = {})
    public boolean v(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#w()
     */
    @ReflectiveMethod(name = "w", types = {})
    public boolean w(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldData#x()
     */
    @ReflectiveMethod(name = "x", types = {})
    public NMSGameRules x(){
        return new NMSGameRules(NMSWrapper.getInstance().exec(nmsObject));
    }

}