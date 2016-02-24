package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldGenVillage")
public class NMSWorldGenVillage extends NMSStructureGenerator {

    public NMSWorldGenVillage(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenVillage#a(int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class})
    public boolean a(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldGenVillage#b(int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class})
    public NMSStructureStart b(int i, int i1){
        return new NMSStructureStart(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    @ReflectiveClass(name = "WorldGenVillageStart")
    public class NMSWorldGenVillageStart extends NMSStructureStart {

        public NMSWorldGenVillageStart(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldGenVillageStart(NMSWorld world, Random random, int i, int i1, int i2){
            super("WorldGenVillageStart", new Object[]{NMSWorld.class, Random.class, int.class, int.class, int.class}, new Object[]{world, random, i, i1, i2});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenVillage$WorldGenVillageStart#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
        public void a(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenVillage$WorldGenVillageStart#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
         */
        @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
        public void b(NMSNBTTagCompound nBTTagCompound){
            NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.WorldGenVillage$WorldGenVillageStart#d()
         */
        @ReflectiveMethod(name = "d", types = {})
        public boolean d(){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

}