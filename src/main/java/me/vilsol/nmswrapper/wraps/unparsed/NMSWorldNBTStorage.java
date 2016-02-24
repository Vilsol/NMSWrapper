package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldNBTStorage")
public class NMSWorldNBTStorage extends NMSWrap implements NMSIPlayerFileData {

    public NMSWorldNBTStorage(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldNBTStorage(File file, String s, boolean b){
        super("WorldNBTStorage", new Object[]{File.class, String.class, boolean.class}, new Object[]{file, s, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#createChunkLoader(net.minecraft.server.v1_8_R3.WorldProvider)
     */
    @ReflectiveMethod(name = "createChunkLoader", types = {NMSWorldProvider.class})
    public NMSIChunkLoader createChunkLoader(NMSWorldProvider worldProvider){
        return new NMSIChunkLoader(NMSWrapper.getInstance().exec(nmsObject, worldProvider));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public String g(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#getDataFile(java.lang.String)
     */
    @ReflectiveMethod(name = "getDataFile", types = {String.class})
    public File getDataFile(String s){
        return new File(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#getDirectory()
     */
    @ReflectiveMethod(name = "getDirectory", types = {})
    public File getDirectory(){
        return new File(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#getPlayerData(java.lang.String)
     */
    @ReflectiveMethod(name = "getPlayerData", types = {String.class})
    public NMSNBTTagCompound getPlayerData(String s){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#getPlayerDir()
     */
    @ReflectiveMethod(name = "getPlayerDir", types = {})
    public File getPlayerDir(){
        return new File(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#getPlayerFileData()
     */
    @ReflectiveMethod(name = "getPlayerFileData", types = {})
    public NMSIPlayerFileData getPlayerFileData(){
        return new NMSIPlayerFileData(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#getUUID()
     */
    @ReflectiveMethod(name = "getUUID", types = {})
    public UUID getUUID(){
        return new UUID(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#getWorldData()
     */
    @ReflectiveMethod(name = "getWorldData", types = {})
    public NMSWorldData getWorldData(){
        return new NMSWorldData(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#load(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "load", types = {NMSEntityHuman.class})
    public NMSNBTTagCompound load(NMSEntityHuman entityHuman){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject, entityHuman));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#save(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "save", types = {NMSEntityHuman.class})
    public void save(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldNBTStorage#saveWorldData(net.minecraft.server.v1_8_R3.WorldData)
     */
    @ReflectiveMethod(name = "saveWorldData", types = {NMSWorldData.class})
    public void saveWorldData(NMSWorldData worldData){
        NMSWrapper.getInstance().exec(nmsObject, worldData);
    }

}