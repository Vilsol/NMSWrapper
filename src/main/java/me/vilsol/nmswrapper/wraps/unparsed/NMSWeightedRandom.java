package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WeightedRandom")
public class NMSWeightedRandom extends NMSWrap {

    public NMSWeightedRandom(Object nmsObject){
        super(nmsObject);
    }

    @ReflectiveClass(name = "WeightedRandomChoice")
    public class NMSWeightedRandomChoice extends NMSWrap {

        public NMSWeightedRandomChoice(Object nmsObject){
            super(nmsObject);
        }

        public NMSWeightedRandomChoice(int i){
            super("WeightedRandomChoice", new Object[]{int.class}, new Object[]{i});
        }

    }

}