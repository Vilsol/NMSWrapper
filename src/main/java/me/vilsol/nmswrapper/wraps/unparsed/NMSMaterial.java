package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Material")
public class NMSMaterial extends NMSWrap {

    public NMSMaterial(Object nmsObject){
        super(nmsObject);
    }

    public NMSMaterial(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSMaterial(NMSMaterialMapColor materialMapColor){
        super("Material", new Object[]{NMSMaterialMapColor.class}, new Object[]{materialMapColor});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Material#blocksLight()
     */
    @ReflectiveMethod(name = "blocksLight", types = {})
    public boolean blocksLight(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Material#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public NMSMaterial f(){
        return new NMSMaterial(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Material#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public NMSMaterial g(){
        return new NMSMaterial(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Material#getPushReaction()
     */
    @ReflectiveMethod(name = "getPushReaction", types = {})
    public int getPushReaction(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Material#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public NMSMaterial i(){
        return new NMSMaterial(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Material#isAlwaysDestroyable()
     */
    @ReflectiveMethod(name = "isAlwaysDestroyable", types = {})
    public boolean isAlwaysDestroyable(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Material#isBuildable()
     */
    @ReflectiveMethod(name = "isBuildable", types = {})
    public boolean isBuildable(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Material#isBurnable()
     */
    @ReflectiveMethod(name = "isBurnable", types = {})
    public boolean isBurnable(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Material#isLiquid()
     */
    @ReflectiveMethod(name = "isLiquid", types = {})
    public boolean isLiquid(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Material#isReplaceable()
     */
    @ReflectiveMethod(name = "isReplaceable", types = {})
    public boolean isReplaceable(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Material#isSolid()
     */
    @ReflectiveMethod(name = "isSolid", types = {})
    public boolean isSolid(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Material#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public boolean k(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Material#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public NMSMaterial n(){
        return new NMSMaterial(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Material#o()
     */
    @ReflectiveMethod(name = "o", types = {})
    public NMSMaterial o(){
        return new NMSMaterial(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Material#p()
     */
    @ReflectiveMethod(name = "p", types = {})
    public NMSMaterial p(){
        return new NMSMaterial(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Material#r()
     */
    @ReflectiveMethod(name = "r", types = {})
    public NMSMaterialMapColor r(){
        return new NMSMaterialMapColor(NMSWrapper.getInstance().exec(nmsObject));
    }

}