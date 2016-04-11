package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ScoreboardCriteriaInteger")
public class NMSScoreboardCriteriaInteger extends NMSWrap implements NMSIScoreboardCriteria {

    public NMSScoreboardCriteriaInteger(Object nmsObject){
        super(nmsObject);
    }

    public NMSScoreboardCriteriaInteger(String s, NMSEnumChatFormat enumChatFormat){
        super("ScoreboardCriteriaInteger", new Object[]{String.class, NMSEnumChatFormat.class}, new Object[]{s, enumChatFormat});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardCriteriaInteger#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSEnumScoreboardHealthDisplay c(){
        return new NMSEnumScoreboardHealthDisplay(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardCriteriaInteger#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardCriteriaInteger#isReadOnly()
     */
    @ReflectiveMethod(name = "isReadOnly", types = {})
    public boolean isReadOnly(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}