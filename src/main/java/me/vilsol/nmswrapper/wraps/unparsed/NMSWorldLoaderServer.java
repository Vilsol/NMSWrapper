package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

import java.io.File;

@ReflectiveClass(name = "WorldLoaderServer")
public class NMSWorldLoaderServer extends NMSWorldLoader {

    public NMSWorldLoaderServer(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldLoaderServer(File file){
        super("WorldLoaderServer", new Object[]{File.class}, new Object[]{file});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldLoaderServer#a(java.lang.String, boolean)
     */
    @ReflectiveMethod(name = "a", types = {String.class, boolean.class})
    public NMSIDataManager a(String s, boolean b){
        return (NMSIDataManager) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject, s, b));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldLoaderServer#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public int c(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldLoaderServer#convert(java.lang.String, net.minecraft.server.v1_8_R3.IProgressUpdate)
     */
    @ReflectiveMethod(name = "convert", types = {String.class, NMSIProgressUpdate.class})
    public boolean convert(String s, NMSIProgressUpdate iProgressUpdate){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s, iProgressUpdate);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldLoaderServer#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldLoaderServer#isConvertable(java.lang.String)
     */
    @ReflectiveMethod(name = "isConvertable", types = {String.class})
    public boolean isConvertable(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

}