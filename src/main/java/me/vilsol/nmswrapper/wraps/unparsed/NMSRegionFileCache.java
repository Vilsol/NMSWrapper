package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;

@ReflectiveClass(name = "RegionFileCache")
public class NMSRegionFileCache extends NMSWrap {

    public NMSRegionFileCache(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.RegionFileCache#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.RegionFileCache#c(java.io.File, int, int)
     */
    @ReflectiveMethod(name = "c", types = {File.class, int.class, int.class})
    public DataInputStream c(File file, int i, int i1){
        return (DataInputStream) NMSWrapper.getInstance().exec(nmsObject, file, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.RegionFileCache#d(java.io.File, int, int)
     */
    @ReflectiveMethod(name = "d", types = {File.class, int.class, int.class})
    public DataOutputStream d(File file, int i, int i1){
        return (DataOutputStream) NMSWrapper.getInstance().exec(nmsObject, file, i, i1);
    }

}