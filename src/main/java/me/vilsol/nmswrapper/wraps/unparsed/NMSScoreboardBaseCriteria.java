package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ScoreboardBaseCriteria")
public class NMSScoreboardBaseCriteria extends NMSWrap implements NMSIScoreboardCriteria {

    public NMSScoreboardBaseCriteria(Object nmsObject){
        super(nmsObject);
    }

    public NMSScoreboardBaseCriteria(String s){
        super("ScoreboardBaseCriteria", new Object[]{String.class}, new Object[]{s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ScoreboardBaseCriteria#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSEnumScoreboardHealthDisplay c(){
        return new NMSEnumScoreboardHealthDisplay(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ScoreboardBaseCriteria#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ScoreboardBaseCriteria#isReadOnly()
     */
    @ReflectiveMethod(name = "isReadOnly", types = {})
    public boolean isReadOnly(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}