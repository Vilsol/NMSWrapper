package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSItemStack;

@ReflectiveClass(name = "StructurePieceTreasure")
public class NMSStructurePieceTreasure extends NMSWeightedRandom.NMSWeightedRandomChoice {

    public NMSStructurePieceTreasure(Object nmsObject){
        super(nmsObject);
    }

    public NMSStructurePieceTreasure(NMSItem item, int i, int i1, int i2, int i3){
        super("StructurePieceTreasure", new Object[]{NMSItem.class, int.class, int.class, int.class, int.class}, new Object[]{item, i, i1, i2, i3});
    }

    public NMSStructurePieceTreasure(NMSItemStack itemStack, int i, int i1, int i2){
        super("StructurePieceTreasure", new Object[]{NMSItemStack.class, int.class, int.class, int.class}, new Object[]{itemStack, i, i1, i2});
    }

}