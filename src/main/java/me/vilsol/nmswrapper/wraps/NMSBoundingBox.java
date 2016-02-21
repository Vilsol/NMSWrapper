package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "AxisAlignedBB")
public class NMSBoundingBox extends NMSWrap {

    public NMSBoundingBox(Object nmsObject) {
        super(nmsObject);
    }

    @ReflectiveMethod(name = "grow", types = {double.class, double.class, double.class})
    public NMSBoundingBox grow(double x, double y, double z) {
        return new NMSBoundingBox(NMSWrapper.getInstance().exec(nmsObject, x, y, z));
    }

    @ReflectiveMethod(name = "shrink", types = {double.class, double.class, double.class})
    public NMSBoundingBox shrink(double x, double y, double z) {
        return new NMSBoundingBox(NMSWrapper.getInstance().exec(nmsObject, x, y, z));
    }

    @ReflectiveMethod(name = "a", types = {NMSVec3D.class})
    public boolean contains(NMSVec3D vector) {
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, vector);
    }

}
