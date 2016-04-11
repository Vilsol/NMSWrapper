package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MaterialDecoration")
public class NMSMaterialDecoration extends NMSMaterial {

    public NMSMaterialDecoration(Object nmsObject){
        super(nmsObject);
    }

    public NMSMaterialDecoration(NMSMaterialMapColor materialMapColor){
        super("MaterialDecoration", new Object[]{NMSMaterialMapColor.class}, new Object[]{materialMapColor});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MaterialDecoration#blocksLight()
     */
    @ReflectiveMethod(name = "blocksLight", types = {})
    public boolean blocksLight(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MaterialDecoration#isBuildable()
     */
    @ReflectiveMethod(name = "isBuildable", types = {})
    public boolean isBuildable(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.MaterialDecoration#isSolid()
     */
    @ReflectiveMethod(name = "isSolid", types = {})
    public boolean isSolid(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}