package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "EntityCreature")
public class NMSEntityCreature extends NMSEntityInsentient {

    public NMSEntityCreature(Object nmsObject){
        super(nmsObject);
    }

    public NMSEntityCreature(NMSWorld world){
        super("EntityCreature", new Object[]{NMSWorld.class}, new Object[]{world});
    }

    public NMSEntityCreature(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityCreature#a(net.minecraft.server.v1_9_R1.BlockPosition, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSBlockPosition.class, int.class})
    public void a(NMSBlockPosition blockPosition, int i){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityCreature#bR()
     */
    @ReflectiveMethod(name = "bR", types = {})
    public boolean bR(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityCreature#ca()
     */
    @ReflectiveMethod(name = "ca", types = {})
    public void ca(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityCreature#cf()
     */
    @ReflectiveMethod(name = "cf", types = {})
    public boolean cf(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityCreature#cg()
     */
    @ReflectiveMethod(name = "cg", types = {})
    public boolean cg(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityCreature#ch()
     */
    @ReflectiveMethod(name = "ch", types = {})
    public NMSBlockPosition ch(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityCreature#ci()
     */
    @ReflectiveMethod(name = "ci", types = {})
    public float ci(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityCreature#cj()
     */
    @ReflectiveMethod(name = "cj", types = {})
    public void cj(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityCreature#ck()
     */
    @ReflectiveMethod(name = "ck", types = {})
    public boolean ck(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityCreature#e(net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "e", types = {NMSBlockPosition.class})
    public boolean e(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityCreature#o(float)
     */
    @ReflectiveMethod(name = "o", types = {float.class})
    public void o(float f){
        NMSWrapper.getInstance().exec(nmsObject, f);
    }

}