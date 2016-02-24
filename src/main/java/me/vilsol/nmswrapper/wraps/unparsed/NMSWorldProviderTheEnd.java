package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldProviderTheEnd")
public class NMSWorldProviderTheEnd extends NMSWorldProvider {

    public NMSWorldProviderTheEnd(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldProviderTheEnd#a(long, float)
     */
    @ReflectiveMethod(name = "a", types = {long.class, float.class})
    public float a(long l, float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, l, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldProviderTheEnd#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldProviderTheEnd#canSpawn(int, int)
     */
    @ReflectiveMethod(name = "canSpawn", types = {int.class, int.class})
    public boolean canSpawn(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldProviderTheEnd#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldProviderTheEnd#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public boolean e(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldProviderTheEnd#getChunkProvider()
     */
    @ReflectiveMethod(name = "getChunkProvider", types = {})
    public NMSIChunkProvider getChunkProvider(){
        return new NMSIChunkProvider(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldProviderTheEnd#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldProviderTheEnd#getSeaLevel()
     */
    @ReflectiveMethod(name = "getSeaLevel", types = {})
    public int getSeaLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldProviderTheEnd#getSuffix()
     */
    @ReflectiveMethod(name = "getSuffix", types = {})
    public String getSuffix(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldProviderTheEnd#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSBlockPosition h(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

}