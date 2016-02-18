package me.vilsol.nmswrapper.wraps;

import org.bukkit.util.Vector;

public class NMSVec3D extends NMSWrap {

    public NMSVec3D(Object nmsObject) {
        super(nmsObject);
    }

    public NMSVec3D(double x, double y, double z) {
        super("Vec3D", new Object[]{double.class, double.class, double.class}, new Object[]{x, y, z});
    }

    public NMSVec3D(Vector vector) {
        super("Vec3D", new Object[]{double.class, double.class, double.class}, new Object[]{vector.getX(), vector.getY(), vector.getZ()});
    }

}
