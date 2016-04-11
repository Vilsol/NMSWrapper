package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "DifficultyDamageScaler")
public class NMSDifficultyDamageScaler extends NMSWrap {

    public NMSDifficultyDamageScaler(Object nmsObject){
        super(nmsObject);
    }

    public NMSDifficultyDamageScaler(NMSEnumDifficulty enumDifficulty, long l, long l1, float f){
        super("DifficultyDamageScaler", new Object[]{NMSEnumDifficulty.class, long.class, long.class, float.class}, new Object[]{enumDifficulty, l, l1, f});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DifficultyDamageScaler#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public float c(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

}