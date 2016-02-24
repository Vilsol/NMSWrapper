package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RandomPositionGenerator")
public class NMSRandomPositionGenerator extends NMSWrap {

    public NMSRandomPositionGenerator(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RandomPositionGenerator#a(net.minecraft.server.v1_8_R3.EntityCreature, int, int, net.minecraft.server.v1_8_R3.Vec3D)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityCreature.class, int.class, int.class, NMSVec3D.class})
    public NMSVec3D a(NMSEntityCreature entityCreature, int i, int i1, NMSVec3D vec3D){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject, entityCreature, i, i1, vec3D));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RandomPositionGenerator#b(net.minecraft.server.v1_8_R3.EntityCreature, int, int, net.minecraft.server.v1_8_R3.Vec3D)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityCreature.class, int.class, int.class, NMSVec3D.class})
    public NMSVec3D b(NMSEntityCreature entityCreature, int i, int i1, NMSVec3D vec3D){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject, entityCreature, i, i1, vec3D));
    }

}