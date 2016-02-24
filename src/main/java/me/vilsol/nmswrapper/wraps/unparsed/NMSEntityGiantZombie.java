package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityGiantZombie")
public class NMSEntityGiantZombie extends NMSEntityMonster {

    public NMSEntityGiantZombie(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityGiantZombie(NMSWorld world){
        super("EntityGiantZombie", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityGiantZombie#a(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlockPosition.class})
    public float a(NMSBlockPosition blockPosition){
        return (float) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityGiantZombie#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.EntityGiantZombie#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}