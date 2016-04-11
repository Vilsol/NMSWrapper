package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;

import java.io.File;

@ReflectiveClass(name = "ServerNBTManager")
public class NMSServerNBTManager extends NMSWorldNBTStorage {

    public NMSServerNBTManager(Object nmsObject){
        super(nmsObject);
    }

    public NMSServerNBTManager(File file, String s, boolean b){
        super("ServerNBTManager", new Object[]{File.class, String.class, boolean.class}, new Object[]{file, s, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ServerNBTManager#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ServerNBTManager#createChunkLoader(net.minecraft.server.v1_9_R1.WorldProvider)
     */
    @ReflectiveMethod(name = "createChunkLoader", types = {NMSWorldProvider.class})
    public NMSIChunkLoader createChunkLoader(NMSWorldProvider worldProvider){
        return (NMSIChunkLoader) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, worldProvider));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ServerNBTManager#saveWorldData(net.minecraft.server.v1_9_R1.WorldData, net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "saveWorldData", types = {NMSWorldData.class, NMSNBTTagCompound.class})
    public void saveWorldData(NMSWorldData worldData, NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, worldData, nBTTagCompound);
    }

}