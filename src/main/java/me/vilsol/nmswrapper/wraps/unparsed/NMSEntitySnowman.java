package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "EntitySnowman")
public class NMSEntitySnowman extends NMSEntityGolem implements NMSIRangedEntity {

    public NMSEntitySnowman(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntitySnowman(NMSWorld world){
        super("EntitySnowman", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySnowman#a(net.minecraft.server.v1_9_R1.EntityLiving, float)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityLiving.class, float.class})
    public void a(NMSEntityLiving entityLiving, float f){
        NMSWrapper.getInstance().exec(nmsObject, entityLiving, f);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySnowman#dropDeathLoot(boolean, int)
     */
    @ReflectiveMethod(name = "dropDeathLoot", types = {boolean.class, int.class})
    public void dropDeathLoot(boolean b, int i){
        NMSWrapper.getInstance().exec(nmsObject, b, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySnowman#getHeadHeight()
     */
    @ReflectiveMethod(name = "getHeadHeight", types = {})
    public float getHeadHeight(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySnowman#getLoot()
     */
    @ReflectiveMethod(name = "getLoot", types = {})
    public NMSItem getLoot(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntitySnowman#initAttributes()
     */
    @ReflectiveMethod(name = "initAttributes", types = {})
    public void initAttributes(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntitySnowman#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public void m(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}