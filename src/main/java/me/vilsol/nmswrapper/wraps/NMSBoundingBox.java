package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.Reflection;

public class NMSBoundingBox extends NMSWrap {

    public NMSBoundingBox(Object nmsObject) {
        super(nmsObject);
    }

    public NMSBoundingBox grow(double x, double y, double z) {
        return new NMSBoundingBox(Reflection.doMethod(nmsObject, "grow", new Object[]{double.class, double.class, double.class}, new Object[]{x, y, z}));
    }

    public NMSBoundingBox shrink(double x, double y, double z) {
        return new NMSBoundingBox(Reflection.doMethod(nmsObject, "shrink", new Object[]{double.class, double.class, double.class}, new Object[]{x, y, z}));
    }

    public boolean contains(NMSVec3D vector) {
        return (boolean) Reflection.doMethod(nmsObject, "a", new Object[]{"Vec3D"}, new Object[]{vector});
    }

}
