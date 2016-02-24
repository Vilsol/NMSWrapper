package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "Blocks")
public class NMSBlocks extends NMSWrap {

    public NMSBlocks(Object nmsObject){
        super(nmsObject);
    }

}