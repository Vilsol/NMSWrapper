package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;

// TODO Implement
@ReflectiveClass(name = "IBlockData")
public abstract class NMSBlockContainer extends NMSBlock implements NMSIContainer {

    public NMSBlockContainer(Object nmsObject) {
        super(nmsObject);
    }

    public NMSBlockContainer(NMSMaterial material, NMSMaterialMapColor materialMapColor) {
        super(material, materialMapColor);
    }

}
