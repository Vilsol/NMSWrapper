package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldProvider")
public class NMSWorldProvider extends NMSWrap {

    public NMSWorldProvider(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProvider#a(long)
     */
    @ReflectiveMethod(name = "a", types = {long.class})
    public int a(long l){
        return (int) NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProvider#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProvider#byDimension(int)
     */
    @ReflectiveMethod(name = "byDimension", types = {int.class})
    public NMSWorldProvider byDimension(int i){
        return new NMSWorldProvider(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProvider#canSpawn(int, int)
     */
    @ReflectiveMethod(name = "canSpawn", types = {int.class, int.class})
    public boolean canSpawn(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProvider#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProvider#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public boolean e(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProvider#getChunkProvider()
     */
    @ReflectiveMethod(name = "getChunkProvider", types = {})
    public NMSIChunkProvider getChunkProvider(){
        return (NMSIChunkProvider) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProvider#getDimension()
     */
    @ReflectiveMethod(name = "getDimension", types = {})
    public int getDimension(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProvider#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProvider#getSeaLevel()
     */
    @ReflectiveMethod(name = "getSeaLevel", types = {})
    public int getSeaLevel(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProvider#getSuffix()
     */
    @ReflectiveMethod(name = "getSuffix", types = {})
    public String getSuffix(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldProvider#getWorldBorder()
     */
    @ReflectiveMethod(name = "getWorldBorder", types = {})
    public NMSWorldBorder getWorldBorder(){
        return new NMSWorldBorder(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProvider#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSBlockPosition h(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProvider#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public NMSWorldChunkManager m(){
        return new NMSWorldChunkManager(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProvider#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public boolean n(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldProvider#o()
     */
    @ReflectiveMethod(name = "o", types = {})
    public boolean o(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}