package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RegionFile")
public class NMSRegionFile extends NMSWrap {

    public NMSRegionFile(Object nmsObject){
        super(nmsObject);
    }

    public NMSRegionFile(File file){
        super("RegionFile", new Object[]{File.class}, new Object[]{file});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegionFile#a(int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class})
    public DataInputStream a(int i, int i1){
        return new DataInputStream(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegionFile#b(int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class})
    public DataOutputStream b(int i, int i1){
        return new DataOutputStream(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RegionFile#c(int, int)
     */
    @ReflectiveMethod(name = "c", types = {int.class, int.class})
    public boolean c(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RegionFile#chunkExists(int, int)
     */
    @ReflectiveMethod(name = "chunkExists", types = {int.class, int.class})
    public boolean chunkExists(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

}