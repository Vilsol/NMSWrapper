package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Position")
public class NMSPosition extends NMSWrap implements NMSIPosition {

    public NMSPosition(Object nmsObject){
        super(nmsObject);
    }

    public NMSPosition(double d, double d1, double d2){
        super("Position", new Object[]{double.class, double.class, double.class}, new Object[]{d, d1, d2});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Position#getX()
     */
    @ReflectiveMethod(name = "getX", types = {})
    public double getX(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Position#getY()
     */
    @ReflectiveMethod(name = "getY", types = {})
    public double getY(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Position#getZ()
     */
    @ReflectiveMethod(name = "getZ", types = {})
    public double getZ(){
        return (double) NMSWrapper.getInstance().exec(nmsObject);
    }

}