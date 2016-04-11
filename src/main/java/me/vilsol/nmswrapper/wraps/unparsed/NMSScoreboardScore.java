package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ScoreboardScore")
public class NMSScoreboardScore extends NMSWrap {

    public NMSScoreboardScore(Object nmsObject){
        super(nmsObject);
    }

    public NMSScoreboardScore(NMSScoreboard scoreboard, NMSScoreboardObjective scoreboardObjective, String s){
        super("ScoreboardScore", new Object[]{NMSScoreboard.class, NMSScoreboardObjective.class, String.class}, new Object[]{scoreboard, scoreboardObjective, s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardScore#a(boolean)
     */
    @ReflectiveMethod(name = "a", types = {boolean.class})
    public void a(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardScore#addScore(int)
     */
    @ReflectiveMethod(name = "addScore", types = {int.class})
    public void addScore(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardScore#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public NMSScoreboard f(){
        return new NMSScoreboard(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardScore#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public boolean g(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardScore#getObjective()
     */
    @ReflectiveMethod(name = "getObjective", types = {})
    public NMSScoreboardObjective getObjective(){
        return new NMSScoreboardObjective(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardScore#getPlayerName()
     */
    @ReflectiveMethod(name = "getPlayerName", types = {})
    public String getPlayerName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardScore#getScore()
     */
    @ReflectiveMethod(name = "getScore", types = {})
    public int getScore(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardScore#incrementScore()
     */
    @ReflectiveMethod(name = "incrementScore", types = {})
    public void incrementScore(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardScore#removeScore(int)
     */
    @ReflectiveMethod(name = "removeScore", types = {int.class})
    public void removeScore(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardScore#setScore(int)
     */
    @ReflectiveMethod(name = "setScore", types = {int.class})
    public void setScore(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

}