package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "Explosion")
public class NMSExplosion extends NMSWrap {

    public NMSExplosion(Object nmsObject){
        super(nmsObject);
    }

    public NMSExplosion(NMSWorld world, NMSEntity entity, double d, double d1, double d2, float f, boolean b, boolean b1){
        super("Explosion", new Object[]{NMSWorld.class, NMSEntity.class, double.class, double.class, double.class, float.class, boolean.class, boolean.class}, new Object[]{world, entity, d, d1, d2, f, b, b1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Explosion#a(boolean)
     */
    @ReflectiveMethod(name = "a", types = {boolean.class})
    public void a(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Explosion#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSEntityLiving c(){
        return new NMSEntityLiving(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Explosion#clearBlocks()
     */
    @ReflectiveMethod(name = "clearBlocks", types = {})
    public void clearBlocks(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}