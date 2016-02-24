package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;

@ReflectiveClass(name = "WeightedRandomEnchant")
public class NMSWeightedRandomEnchant extends NMSWeightedRandom.NMSWeightedRandomChoice {

    public NMSWeightedRandomEnchant(Object nmsObject){
        super(nmsObject);
    }

    public NMSWeightedRandomEnchant(NMSEnchantment enchantment, int i){
        super("WeightedRandomEnchant", new Object[]{NMSEnchantment.class, int.class}, new Object[]{enchantment, i});
    }

}