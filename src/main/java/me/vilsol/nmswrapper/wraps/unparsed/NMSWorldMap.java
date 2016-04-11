package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldMap")
public class NMSWorldMap extends NMSPersistentBase {

    public NMSWorldMap(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldMap(String s){
        super("WorldMap", new Object[]{String.class}, new Object[]{s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldMap#a(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public NMSWorldMapHumanTracker a(NMSEntityHuman entityHuman){
        return new NMSWorldMapHumanTracker(NMSWrapper.getInstance().exec(nmsObject, entityHuman));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.WorldMap#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.WorldMap#flagDirty(int, int)
     */
    @ReflectiveMethod(name = "flagDirty", types = {int.class, int.class})
    public void flagDirty(int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    @ReflectiveClass(name = "WorldMapHumanTracker")
    public class NMSWorldMapHumanTracker extends NMSWrap {

        public NMSWorldMapHumanTracker(Object nmsObject){
            super(nmsObject);
        }

        public NMSWorldMapHumanTracker(NMSWorldMap worldMap, NMSEntityHuman entityHuman){
            super("WorldMapHumanTracker", new Object[]{NMSWorldMap.class, NMSEntityHuman.class}, new Object[]{worldMap, entityHuman});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.WorldMap$WorldMapHumanTracker#a(int, int)
         */
        @ReflectiveMethod(name = "a", types = {int.class, int.class})
        public void a(int i, int i1){
            NMSWrapper.getInstance().exec(nmsObject, i, i1);
        }

    }

}