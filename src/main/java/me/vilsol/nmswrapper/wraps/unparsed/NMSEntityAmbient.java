package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "EntityAmbient")
public class NMSEntityAmbient extends NMSEntityInsentient implements NMSIAnimal {

    public NMSEntityAmbient(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityAmbient(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSEntityAmbient(NMSWorld world){
        super("EntityAmbient", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityAmbient#a(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityAmbient#cb()
     */
    @ReflectiveMethod(name = "cb", types = {})
    public boolean cb(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}