package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MaterialLiquid")
public class NMSMaterialLiquid extends NMSMaterial {

    public NMSMaterialLiquid(Object nmsObject){
        super(nmsObject);
    }

    public NMSMaterialLiquid(NMSMaterialMapColor materialMapColor){
        super("MaterialLiquid", new Object[]{NMSMaterialMapColor.class}, new Object[]{materialMapColor});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MaterialLiquid#isBuildable()
     */
    @ReflectiveMethod(name = "isBuildable", types = {})
    public boolean isBuildable(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MaterialLiquid#isLiquid()
     */
    @ReflectiveMethod(name = "isLiquid", types = {})
    public boolean isLiquid(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MaterialLiquid#isSolid()
     */
    @ReflectiveMethod(name = "isSolid", types = {})
    public boolean isSolid(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}