package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSItemStack;

@ReflectiveClass(name = "PossibleFishingResult")
public class NMSPossibleFishingResult extends NMSWeightedRandom.NMSWeightedRandomChoice {

    public NMSPossibleFishingResult(Object nmsObject){
        super(nmsObject);
    }

    public NMSPossibleFishingResult(NMSItemStack itemStack, int i){
        super("PossibleFishingResult", new Object[]{NMSItemStack.class, int.class}, new Object[]{itemStack, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PossibleFishingResult#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSPossibleFishingResult a(){
        return new NMSPossibleFishingResult(NMSWrapper.getInstance().exec(nmsObject));
    }

}