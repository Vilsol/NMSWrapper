package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MaterialGas")
public class NMSMaterialGas extends NMSMaterial {

    public NMSMaterialGas(Object nmsObject){
        super(nmsObject);
    }

    public NMSMaterialGas(NMSMaterialMapColor materialMapColor){
        super("MaterialGas", new Object[]{NMSMaterialMapColor.class}, new Object[]{materialMapColor});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MaterialGas#blocksLight()
     */
    @ReflectiveMethod(name = "blocksLight", types = {})
    public boolean blocksLight(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MaterialGas#isBuildable()
     */
    @ReflectiveMethod(name = "isBuildable", types = {})
    public boolean isBuildable(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MaterialGas#isSolid()
     */
    @ReflectiveMethod(name = "isSolid", types = {})
    public boolean isSolid(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}