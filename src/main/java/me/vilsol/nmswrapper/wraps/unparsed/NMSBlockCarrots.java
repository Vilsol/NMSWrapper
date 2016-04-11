package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "BlockCarrots")
public class NMSBlockCarrots extends NMSBlockCrops {

    public NMSBlockCarrots(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockCarrots#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public NMSItem l(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.BlockCarrots#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public NMSItem n(){
        return new NMSItem(NMSWrapper.getInstance().exec(nmsObject));
    }

}