package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PossibleFishingResult")
public class NMSPossibleFishingResult extends NMSWeightedRandomChoice {

    public NMSPossibleFishingResult(Object nmsObject){
        super(nmsObject);
    }

    public NMSPossibleFishingResult(NMSItemStack itemStack, int i){
        super("PossibleFishingResult", new Object[]{NMSItemStack.class, int.class}, new Object[]{itemStack, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PossibleFishingResult#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSPossibleFishingResult a(){
        return new NMSPossibleFishingResult(NMSWrapper.getInstance().exec(nmsObject));
    }

}