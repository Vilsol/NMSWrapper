package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;
import me.vilsol.nmswrapper.wraps.NMSWorld;

import java.util.Random;

@ReflectiveClass(name = "WorldGenMonument")
public class NMSWorldGenMonument extends NMSStructureGenerator {

    public NMSWorldGenMonument(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenMonument#a(int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class})
    public boolean a(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldGenMonument#b(int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class})
    public NMSStructureStart b(int i, int i1){
        return new NMSStructureStart(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    @ReflectiveClass(name = "WorldGenMonumentStart")
    public class NMSWorldGenMonumentStart extends NMSStructureStart {

        public NMSWorldGenMonumentStart(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenMonumentStart(NMSWorld world, Random random, int i, int i1){
            super("WorldGenMonumentStart", new Object[]{NMSWorld.class, Random.class, int.class, int.class}, new Object[]{world, random, i, i1});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenMonument$WorldGenMonumentStart#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
        public void a(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldGenMonument$WorldGenMonumentStart#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

    }

}