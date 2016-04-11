package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "WorldProviderHell")
public class NMSWorldProviderHell extends NMSWorldProvider {

    public NMSWorldProviderHell(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProviderHell#a(long, float)
     */
    @ReflectiveMethod(name = "a", types = {long.class, float.class})
    public float a(long l, float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, l, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProviderHell#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProviderHell#canSpawn(int, int)
     */
    @ReflectiveMethod(name = "canSpawn", types = {int.class, int.class})
    public boolean canSpawn(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProviderHell#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProviderHell#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public boolean e(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProviderHell#getChunkProvider()
     */
    @ReflectiveMethod(name = "getChunkProvider", types = {})
    public NMSIChunkProvider getChunkProvider(){
        return (NMSIChunkProvider) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProviderHell#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProviderHell#getSuffix()
     */
    @ReflectiveMethod(name = "getSuffix", types = {})
    public String getSuffix(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProviderHell#getWorldBorder()
     */
    @ReflectiveMethod(name = "getWorldBorder", types = {})
    public NMSWorldBorder getWorldBorder(){
        return new NMSWorldBorder(NMSWrapper.getInstance().exec(nmsObject));
    }

}