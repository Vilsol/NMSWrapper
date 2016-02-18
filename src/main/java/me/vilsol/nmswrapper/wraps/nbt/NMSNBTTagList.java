package me.vilsol.nmswrapper.wraps.nbt;

public class NMSNBTTagList extends NMSNBTBase {

    public NMSNBTTagList(Object nmsObject) {
        super(nmsObject);
    }

    public NMSNBTTagList() {
        super("NBTTagList", new Object[]{}, new Object[]{});
    }

}
