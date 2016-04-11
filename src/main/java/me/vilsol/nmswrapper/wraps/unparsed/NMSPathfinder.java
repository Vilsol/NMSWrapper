package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Pathfinder")
public class NMSPathfinder extends NMSWrap {

    public NMSPathfinder(Object nmsObject){
        super(nmsObject);
    }

    public NMSPathfinder(NMSPathfinderAbstract pathfinderAbstract){
        super("Pathfinder", new Object[]{NMSPathfinderAbstract.class}, new Object[]{pathfinderAbstract});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.Pathfinder#a(net.minecraft.server.v1_9_R1.IBlockAccess, net.minecraft.server.v1_9_R1.Entity, net.minecraft.server.v1_9_R1.BlockPosition, float)
     */
    @ReflectiveMethod(name = "a", types = {NMSIBlockAccess.class, NMSEntity.class, NMSBlockPosition.class, float.class})
    public NMSPathEntity a(NMSIBlockAccess iBlockAccess, NMSEntity entity, NMSBlockPosition blockPosition, float f){
        return new NMSPathEntity(NMSWrapper.getInstance().exec(nmsObject, iBlockAccess, entity, blockPosition, f));
    }

}