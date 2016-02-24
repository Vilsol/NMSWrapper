package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.io.File;

@ReflectiveClass(name = "WorldLoader")
public class NMSWorldLoader extends NMSWrap implements NMSConvertable {

    public NMSWorldLoader(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldLoader(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSWorldLoader(File file){
        super("WorldLoader", new Object[]{File.class}, new Object[]{file});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldLoader#a(java.lang.String, boolean)
     */
    @ReflectiveMethod(name = "a", types = {String.class, boolean.class})
    public NMSIDataManager a(String s, boolean b){
        return new NMSIDataManager(NMSWrapper.getInstance().exec(nmsObject, s, b));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldLoader#c(java.lang.String)
     */
    @ReflectiveMethod(name = "c", types = {String.class})
    public NMSWorldData c(String s){
        return new NMSWorldData(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldLoader#convert(java.lang.String, net.minecraft.server.v1_8_R3.IProgressUpdate)
     */
    @ReflectiveMethod(name = "convert", types = {String.class, NMSIProgressUpdate.class})
    public boolean convert(String s, NMSIProgressUpdate iProgressUpdate){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s, iProgressUpdate);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldLoader#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public void d(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldLoader#e(java.lang.String)
     */
    @ReflectiveMethod(name = "e", types = {String.class})
    public boolean e(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldLoader#isConvertable(java.lang.String)
     */
    @ReflectiveMethod(name = "isConvertable", types = {String.class})
    public boolean isConvertable(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

}