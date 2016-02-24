package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "Scoreboard")
public class NMSScoreboard extends NMSWrap {

    public NMSScoreboard(Object nmsObject){
        super(nmsObject);
    }

    public NMSScoreboard(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Scoreboard#a(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntity.class})
    public void a(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#addPlayerToTeam(java.lang.String, java.lang.String)
     */
    @ReflectiveMethod(name = "addPlayerToTeam", types = {String.class, String.class})
    public boolean addPlayerToTeam(String s, String s1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s, s1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.Scoreboard#b(java.lang.String, net.minecraft.server.v1_8_R3.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "b", types = {String.class, NMSScoreboardObjective.class})
    public boolean b(String s, NMSScoreboardObjective scoreboardObjective){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s, scoreboardObjective);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#createTeam(java.lang.String)
     */
    @ReflectiveMethod(name = "createTeam", types = {String.class})
    public NMSScoreboardTeam createTeam(String s){
        return new NMSScoreboardTeam(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#getObjective(java.lang.String)
     */
    @ReflectiveMethod(name = "getObjective", types = {String.class})
    public NMSScoreboardObjective getObjective(String s){
        return new NMSScoreboardObjective(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#getObjectiveForSlot(int)
     */
    @ReflectiveMethod(name = "getObjectiveForSlot", types = {int.class})
    public NMSScoreboardObjective getObjectiveForSlot(int i){
        return new NMSScoreboardObjective(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#getPlayerScoreForObjective(java.lang.String, net.minecraft.server.v1_8_R3.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "getPlayerScoreForObjective", types = {String.class, NMSScoreboardObjective.class})
    public NMSScoreboardScore getPlayerScoreForObjective(String s, NMSScoreboardObjective scoreboardObjective){
        return new NMSScoreboardScore(NMSWrapper.getInstance().exec(nmsObject, s, scoreboardObjective));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#getPlayerTeam(java.lang.String)
     */
    @ReflectiveMethod(name = "getPlayerTeam", types = {String.class})
    public NMSScoreboardTeam getPlayerTeam(String s){
        return new NMSScoreboardTeam(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#getSlotForName(java.lang.String)
     */
    @ReflectiveMethod(name = "getSlotForName", types = {String.class})
    public int getSlotForName(String s){
        return (int) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#getSlotName(int)
     */
    @ReflectiveMethod(name = "getSlotName", types = {int.class})
    public String getSlotName(int i){
        return (String) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#getTeam(java.lang.String)
     */
    @ReflectiveMethod(name = "getTeam", types = {String.class})
    public NMSScoreboardTeam getTeam(String s){
        return new NMSScoreboardTeam(NMSWrapper.getInstance().exec(nmsObject, s));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#handleObjectiveAdded(net.minecraft.server.v1_8_R3.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "handleObjectiveAdded", types = {NMSScoreboardObjective.class})
    public void handleObjectiveAdded(NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardObjective);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#handleObjectiveChanged(net.minecraft.server.v1_8_R3.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "handleObjectiveChanged", types = {NMSScoreboardObjective.class})
    public void handleObjectiveChanged(NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardObjective);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#handleObjectiveRemoved(net.minecraft.server.v1_8_R3.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "handleObjectiveRemoved", types = {NMSScoreboardObjective.class})
    public void handleObjectiveRemoved(NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardObjective);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#handlePlayerRemoved(java.lang.String)
     */
    @ReflectiveMethod(name = "handlePlayerRemoved", types = {String.class})
    public void handlePlayerRemoved(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#handleScoreChanged(net.minecraft.server.v1_8_R3.ScoreboardScore)
     */
    @ReflectiveMethod(name = "handleScoreChanged", types = {NMSScoreboardScore.class})
    public void handleScoreChanged(NMSScoreboardScore scoreboardScore){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardScore);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#handleTeamAdded(net.minecraft.server.v1_8_R3.ScoreboardTeam)
     */
    @ReflectiveMethod(name = "handleTeamAdded", types = {NMSScoreboardTeam.class})
    public void handleTeamAdded(NMSScoreboardTeam scoreboardTeam){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardTeam);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#handleTeamChanged(net.minecraft.server.v1_8_R3.ScoreboardTeam)
     */
    @ReflectiveMethod(name = "handleTeamChanged", types = {NMSScoreboardTeam.class})
    public void handleTeamChanged(NMSScoreboardTeam scoreboardTeam){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardTeam);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#handleTeamRemoved(net.minecraft.server.v1_8_R3.ScoreboardTeam)
     */
    @ReflectiveMethod(name = "handleTeamRemoved", types = {NMSScoreboardTeam.class})
    public void handleTeamRemoved(NMSScoreboardTeam scoreboardTeam){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardTeam);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#registerObjective(java.lang.String, net.minecraft.server.v1_8_R3.IScoreboardCriteria)
     */
    @ReflectiveMethod(name = "registerObjective", types = {String.class, NMSIScoreboardCriteria.class})
    public NMSScoreboardObjective registerObjective(String s, NMSIScoreboardCriteria iScoreboardCriteria){
        return new NMSScoreboardObjective(NMSWrapper.getInstance().exec(nmsObject, s, iScoreboardCriteria));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#removePlayerFromTeam(java.lang.String, net.minecraft.server.v1_8_R3.ScoreboardTeam)
     */
    @ReflectiveMethod(name = "removePlayerFromTeam", types = {String.class, NMSScoreboardTeam.class})
    public void removePlayerFromTeam(String s, NMSScoreboardTeam scoreboardTeam){
        NMSWrapper.getInstance().exec(nmsObject, s, scoreboardTeam);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#removeTeam(net.minecraft.server.v1_8_R3.ScoreboardTeam)
     */
    @ReflectiveMethod(name = "removeTeam", types = {NMSScoreboardTeam.class})
    public void removeTeam(NMSScoreboardTeam scoreboardTeam){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardTeam);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#resetPlayerScores(java.lang.String, net.minecraft.server.v1_8_R3.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "resetPlayerScores", types = {String.class, NMSScoreboardObjective.class})
    public void resetPlayerScores(String s, NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, s, scoreboardObjective);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#setDisplaySlot(int, net.minecraft.server.v1_8_R3.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "setDisplaySlot", types = {int.class, NMSScoreboardObjective.class})
    public void setDisplaySlot(int i, NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, i, scoreboardObjective);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.Scoreboard#unregisterObjective(net.minecraft.server.v1_8_R3.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "unregisterObjective", types = {NMSScoreboardObjective.class})
    public void unregisterObjective(NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardObjective);
    }

}