package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Path")
public class NMSPath extends NMSWrap {

    public NMSPath(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Path#a(net.minecraft.server.v1_8_R3.PathPoint, float)
     */
    @ReflectiveMethod(name = "a", types = {NMSPathPoint.class, float.class})
    public void a(NMSPathPoint pathPoint, float f){
        NMSWrapper.getInstance().exec(nmsObject, pathPoint, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Path#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSPathPoint c(){
        return new NMSPathPoint(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Path#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public boolean e(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}