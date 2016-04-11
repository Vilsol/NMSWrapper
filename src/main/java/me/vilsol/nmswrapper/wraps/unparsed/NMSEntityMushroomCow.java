package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityMushroomCow")
public class NMSEntityMushroomCow extends NMSEntityCow {

    public NMSEntityMushroomCow(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityMushroomCow(NMSWorld world){
        super("EntityMushroomCow", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMushroomCow#a(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMushroomCow#b(net.minecraft.server.v1_9_R1.EntityAgeable)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityAgeable.class})
    public NMSEntityCow b(NMSEntityAgeable entityAgeable){
        return new NMSEntityCow(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityMushroomCow#c(net.minecraft.server.v1_9_R1.EntityAgeable)
     */
    @ReflectiveMethod(name = "c", types = {NMSEntityAgeable.class})
    public NMSEntityMushroomCow c(NMSEntityAgeable entityAgeable){
        return new NMSEntityMushroomCow(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityMushroomCow#createChild(net.minecraft.server.v1_9_R1.EntityAgeable)
     */
    @ReflectiveMethod(name = "createChild", types = {NMSEntityAgeable.class})
    public NMSEntityAgeable createChild(NMSEntityAgeable entityAgeable){
        return new NMSEntityAgeable(NMSWrapper.getInstance().exec(nmsObject, entityAgeable));
    }

}