package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSEntity;

@ReflectiveClass(name = "MovingObjectPosition")
public class NMSMovingObjectPosition extends NMSWrap {

    public NMSMovingObjectPosition(Object nmsObject){
        super(nmsObject);
    }

    public NMSMovingObjectPosition(NMSVec3D vec3D, NMSEnumDirection enumDirection, NMSBlockPosition blockPosition){
        super("MovingObjectPosition", new Object[]{NMSVec3D.class, NMSEnumDirection.class, NMSBlockPosition.class}, new Object[]{vec3D, enumDirection, blockPosition});
    }

    public NMSMovingObjectPosition(NMSVec3D vec3D, NMSEnumDirection enumDirection){
        super("MovingObjectPosition", new Object[]{NMSVec3D.class, NMSEnumDirection.class}, new Object[]{vec3D, enumDirection});
    }

    public NMSMovingObjectPosition(NMSEntity entity){
        super("MovingObjectPosition", new Object[]{NMSEntity.class}, new Object[]{entity});
    }

    public NMSMovingObjectPosition(NMSEnumMovingObjectType enumMovingObjectType, NMSVec3D vec3D, NMSEnumDirection enumDirection, NMSBlockPosition blockPosition){
        super("MovingObjectPosition", new Object[]{NMSEnumMovingObjectType.class, NMSVec3D.class, NMSEnumDirection.class, NMSBlockPosition.class}, new Object[]{enumMovingObjectType, vec3D, enumDirection, blockPosition});
    }

    public NMSMovingObjectPosition(NMSEntity entity, NMSVec3D vec3D){
        super("MovingObjectPosition", new Object[]{NMSEntity.class, NMSVec3D.class}, new Object[]{entity, vec3D});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MovingObjectPosition#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSBlockPosition a(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MovingObjectPosition#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}