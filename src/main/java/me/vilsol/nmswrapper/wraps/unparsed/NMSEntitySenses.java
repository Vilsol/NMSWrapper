package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntitySenses")
public class NMSEntitySenses extends NMSWrap {

    public NMSEntitySenses(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntitySenses(NMSEntityInsentient entityInsentient){
        super("EntitySenses", new Object[]{NMSEntityInsentient.class}, new Object[]{entityInsentient});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySenses#a(net.minecraft.server.v1_9_R1.Entity)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntity.class})
    public boolean a(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

}