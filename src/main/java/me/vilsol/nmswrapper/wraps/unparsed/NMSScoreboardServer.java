package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ScoreboardServer")
public class NMSScoreboardServer extends NMSScoreboard {

    public NMSScoreboardServer(Object nmsObject){
        super(nmsObject);
    }

    public NMSScoreboardServer(NMSMinecraftServer minecraftServer){
        super("ScoreboardServer", new Object[]{NMSMinecraftServer.class}, new Object[]{minecraftServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#a(net.minecraft.server.v1_9_R1.PersistentScoreboard)
     */
    @ReflectiveMethod(name = "a", types = {NMSPersistentScoreboard.class})
    public void a(NMSPersistentScoreboard persistentScoreboard){
        NMSWrapper.getInstance().exec(nmsObject, persistentScoreboard);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#addPlayerToTeam(java.lang.String, java.lang.String)
     */
    @ReflectiveMethod(name = "addPlayerToTeam", types = {String.class, String.class})
    public boolean addPlayerToTeam(String s, String s1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s, s1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#e(net.minecraft.server.v1_9_R1.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "e", types = {NMSScoreboardObjective.class})
    public void e(NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardObjective);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#g(net.minecraft.server.v1_9_R1.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "g", types = {NMSScoreboardObjective.class})
    public void g(NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardObjective);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#h(net.minecraft.server.v1_9_R1.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "h", types = {NMSScoreboardObjective.class})
    public int h(NMSScoreboardObjective scoreboardObjective){
        return (int) NMSWrapper.getInstance().exec(nmsObject, scoreboardObjective);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#handleObjectiveAdded(net.minecraft.server.v1_9_R1.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "handleObjectiveAdded", types = {NMSScoreboardObjective.class})
    public void handleObjectiveAdded(NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardObjective);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#handleObjectiveChanged(net.minecraft.server.v1_9_R1.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "handleObjectiveChanged", types = {NMSScoreboardObjective.class})
    public void handleObjectiveChanged(NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardObjective);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#handleObjectiveRemoved(net.minecraft.server.v1_9_R1.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "handleObjectiveRemoved", types = {NMSScoreboardObjective.class})
    public void handleObjectiveRemoved(NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardObjective);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#handlePlayerRemoved(java.lang.String)
     */
    @ReflectiveMethod(name = "handlePlayerRemoved", types = {String.class})
    public void handlePlayerRemoved(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#handleScoreChanged(net.minecraft.server.v1_9_R1.ScoreboardScore)
     */
    @ReflectiveMethod(name = "handleScoreChanged", types = {NMSScoreboardScore.class})
    public void handleScoreChanged(NMSScoreboardScore scoreboardScore){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardScore);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#handleTeamAdded(net.minecraft.server.v1_9_R1.ScoreboardTeam)
     */
    @ReflectiveMethod(name = "handleTeamAdded", types = {NMSScoreboardTeam.class})
    public void handleTeamAdded(NMSScoreboardTeam scoreboardTeam){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardTeam);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#handleTeamChanged(net.minecraft.server.v1_9_R1.ScoreboardTeam)
     */
    @ReflectiveMethod(name = "handleTeamChanged", types = {NMSScoreboardTeam.class})
    public void handleTeamChanged(NMSScoreboardTeam scoreboardTeam){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardTeam);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#handleTeamRemoved(net.minecraft.server.v1_9_R1.ScoreboardTeam)
     */
    @ReflectiveMethod(name = "handleTeamRemoved", types = {NMSScoreboardTeam.class})
    public void handleTeamRemoved(NMSScoreboardTeam scoreboardTeam){
        NMSWrapper.getInstance().exec(nmsObject, scoreboardTeam);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#removePlayerFromTeam(java.lang.String, net.minecraft.server.v1_9_R1.ScoreboardTeam)
     */
    @ReflectiveMethod(name = "removePlayerFromTeam", types = {String.class, NMSScoreboardTeam.class})
    public void removePlayerFromTeam(String s, NMSScoreboardTeam scoreboardTeam){
        NMSWrapper.getInstance().exec(nmsObject, s, scoreboardTeam);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardServer#setDisplaySlot(int, net.minecraft.server.v1_9_R1.ScoreboardObjective)
     */
    @ReflectiveMethod(name = "setDisplaySlot", types = {int.class, NMSScoreboardObjective.class})
    public void setDisplaySlot(int i, NMSScoreboardObjective scoreboardObjective){
        NMSWrapper.getInstance().exec(nmsObject, i, scoreboardObjective);
    }

}