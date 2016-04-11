package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ScoreboardObjective")
public class NMSScoreboardObjective extends NMSWrap {

    public NMSScoreboardObjective(Object nmsObject){
        super(nmsObject);
    }

    public NMSScoreboardObjective(NMSScoreboard scoreboard, String s, NMSIScoreboardCriteria iScoreboardCriteria){
        super("ScoreboardObjective", new Object[]{NMSScoreboard.class, String.class, NMSIScoreboardCriteria.class}, new Object[]{scoreboard, s, iScoreboardCriteria});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardObjective#a(net.minecraft.server.v1_9_R1.IScoreboardCriteria$EnumScoreboardHealthDisplay)
     */
    @ReflectiveMethod(name = "a", types = {NMSEnumScoreboardHealthDisplay.class})
    public void a(NMSEnumScoreboardHealthDisplay enumScoreboardHealthDisplay){
        NMSWrapper.getInstance().exec(nmsObject, enumScoreboardHealthDisplay);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardObjective#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public NMSEnumScoreboardHealthDisplay e(){
        return new NMSEnumScoreboardHealthDisplay(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardObjective#getCriteria()
     */
    @ReflectiveMethod(name = "getCriteria", types = {})
    public NMSIScoreboardCriteria getCriteria(){
        return (NMSIScoreboardCriteria) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardObjective#getDisplayName()
     */
    @ReflectiveMethod(name = "getDisplayName", types = {})
    public String getDisplayName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardObjective#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardObjective#setDisplayName(java.lang.String)
     */
    @ReflectiveMethod(name = "setDisplayName", types = {String.class})
    public void setDisplayName(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

}