package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ShapeDetectorBlock")
public class NMSShapeDetectorBlock extends NMSWrap {

    public NMSShapeDetectorBlock(Object nmsObject){
        super(nmsObject);
    }

    public NMSShapeDetectorBlock(NMSWorld world, NMSBlockPosition blockPosition, boolean b){
        super("ShapeDetectorBlock", new Object[]{NMSWorld.class, NMSBlockPosition.class, boolean.class}, new Object[]{world, blockPosition, b});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ShapeDetectorBlock#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSIBlockData a(){
        return (NMSIBlockData) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ShapeDetectorBlock#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSTileEntity b(){
        return new NMSTileEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ShapeDetectorBlock#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSBlockPosition d(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

}