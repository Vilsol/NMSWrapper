package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ScoreboardHealthCriteria")
public class NMSScoreboardHealthCriteria extends NMSScoreboardBaseCriteria {

    public NMSScoreboardHealthCriteria(Object nmsObject){
        super(nmsObject);
    }

    public NMSScoreboardHealthCriteria(String s){
        super("ScoreboardHealthCriteria", new Object[]{String.class}, new Object[]{s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ScoreboardHealthCriteria#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSEnumScoreboardHealthDisplay c(){
        return new NMSEnumScoreboardHealthDisplay(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ScoreboardHealthCriteria#isReadOnly()
     */
    @ReflectiveMethod(name = "isReadOnly", types = {})
    public boolean isReadOnly(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}