package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "WeightedRandom")
public class NMSWeightedRandom extends NMSWrap {

    public NMSWeightedRandom(Object nmsObject){
        super(nmsObject);
    }

    @ReflectiveClass(name = "WeightedRandomChoice")
    public static class NMSWeightedRandomChoice extends NMSWrap {

        public NMSWeightedRandomChoice(Object nmsObject){
            super(nmsObject);
        }

        public NMSWeightedRandomChoice(String nmsName, Object[] paramTypes, Object[] params) {
            super(nmsName, paramTypes, params);
        }

        public NMSWeightedRandomChoice(int i){
            super("WeightedRandomChoice", new Object[]{int.class}, new Object[]{i});
        }

    }

}