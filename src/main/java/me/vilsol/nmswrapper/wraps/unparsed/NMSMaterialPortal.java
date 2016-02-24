package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MaterialPortal")
public class NMSMaterialPortal extends NMSMaterial {

    public NMSMaterialPortal(Object nmsObject){
        super(nmsObject);
    }

    public NMSMaterialPortal(NMSMaterialMapColor materialMapColor){
        super("MaterialPortal", new Object[]{NMSMaterialMapColor.class}, new Object[]{materialMapColor});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MaterialPortal#blocksLight()
     */
    @ReflectiveMethod(name = "blocksLight", types = {})
    public boolean blocksLight(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MaterialPortal#isBuildable()
     */
    @ReflectiveMethod(name = "isBuildable", types = {})
    public boolean isBuildable(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MaterialPortal#isSolid()
     */
    @ReflectiveMethod(name = "isSolid", types = {})
    public boolean isSolid(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}