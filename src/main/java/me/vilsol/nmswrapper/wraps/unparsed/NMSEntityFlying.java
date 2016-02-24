package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "EntityFlying")
public class NMSEntityFlying extends NMSEntityInsentient {

    public NMSEntityFlying(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityFlying(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSEntityFlying(NMSWorld world){
        super("EntityFlying", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFlying#a(double, boolean, net.minecraft.server.v1_8_R3.Block, net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {double.class, boolean.class, NMSBlock.class, NMSBlockPosition.class})
    public void a(double d, boolean b, NMSBlock block, NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, d, b, block, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFlying#e(float, float)
     */
    @ReflectiveMethod(name = "e", types = {float.class, float.class})
    public void e(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFlying#g(float, float)
     */
    @ReflectiveMethod(name = "g", types = {float.class, float.class})
    public void g(float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, f, f1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.EntityFlying#k_()
     */
    @ReflectiveMethod(name = "k_", types = {})
    public boolean k_(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}