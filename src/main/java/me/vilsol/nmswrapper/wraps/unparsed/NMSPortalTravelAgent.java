package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.entity.NMSEntity;
import org.bukkit.Location;
import org.bukkit.util.Vector;

@ReflectiveClass(name = "PortalTravelAgent")
public class NMSPortalTravelAgent extends NMSWrap {

    public NMSPortalTravelAgent(Object nmsObject){
        super(nmsObject);
    }

    public NMSPortalTravelAgent(NMSWorldServer worldServer){
        super("PortalTravelAgent", new Object[]{NMSWorldServer.class}, new Object[]{worldServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PortalTravelAgent#a(long)
     */
    @ReflectiveMethod(name = "a", types = {long.class})
    public void a(long l){
        NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PortalTravelAgent#adjustExit(net.minecraft.server.v1_8_R3.Entity, org.bukkit.Location, org.bukkit.util.Vector)
     */
    @ReflectiveMethod(name = "adjustExit", types = {NMSEntity.class, Location.class, Vector.class})
    public void adjustExit(NMSEntity entity, Location location, Vector vector){
        NMSWrapper.getInstance().exec(nmsObject, entity, location, vector);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PortalTravelAgent#b(net.minecraft.server.v1_8_R3.Entity, float)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntity.class, float.class})
    public boolean b(NMSEntity entity, float f){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity, f);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PortalTravelAgent#createPortal(double, double, double, int)
     */
    @ReflectiveMethod(name = "createPortal", types = {double.class, double.class, double.class, int.class})
    public boolean createPortal(double d, double d1, double d2, int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, d, d1, d2, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PortalTravelAgent#findPortal(double, double, double, int)
     */
    @ReflectiveMethod(name = "findPortal", types = {double.class, double.class, double.class, int.class})
    public NMSBlockPosition findPortal(double d, double d1, double d2, int i){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, d, d1, d2, i));
    }

    @ReflectiveClass(name = "ChunkCoordinatesPortal")
    public class NMSChunkCoordinatesPortal extends NMSBlockPosition {

        public NMSChunkCoordinatesPortal(Object nmsObject){
            super(nmsObject);
        }

        public NMSChunkCoordinatesPortal(NMSPortalTravelAgent portalTravelAgent, NMSBlockPosition blockPosition, long l){
            super("ChunkCoordinatesPortal", new Object[]{NMSPortalTravelAgent.class, NMSBlockPosition.class, long.class}, new Object[]{portalTravelAgent, blockPosition, l});
        }

    }

}