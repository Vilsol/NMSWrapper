package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityMinecartRideable")
public class NMSEntityMinecartRideable extends NMSEntityMinecartAbstract {

    public NMSEntityMinecartRideable(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityMinecartRideable(NMSWorld world){
        super("EntityMinecartRideable", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityMinecartRideable(NMSWorld world, double d, double d1, double d2){
        super("EntityMinecartRideable", new Object[]{NMSWorld.class, double.class, double.class, double.class}, new Object[]{world, d, d1, d2});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartRideable#a(int, int, int, boolean)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class, int.class, boolean.class})
    public void a(int i, int i1, int i2, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, i, i1, i2, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartRideable#e(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "e", types = {NMSEntityHuman.class})
    public boolean e(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityMinecartRideable#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public NMSEnumMinecartType s(){
        return new NMSEnumMinecartType(NMSWrapper.getInstance().exec(nmsObject));
    }

}