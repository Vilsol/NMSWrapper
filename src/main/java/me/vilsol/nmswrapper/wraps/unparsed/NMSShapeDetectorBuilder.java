package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ShapeDetectorBuilder")
public class NMSShapeDetectorBuilder extends NMSWrap {

    public NMSShapeDetectorBuilder(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ShapeDetectorBuilder#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSShapeDetectorBuilder a(){
        return new NMSShapeDetectorBuilder(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ShapeDetectorBuilder#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSShapeDetector b(){
        return new NMSShapeDetector(NMSWrapper.getInstance().exec(nmsObject));
    }

}