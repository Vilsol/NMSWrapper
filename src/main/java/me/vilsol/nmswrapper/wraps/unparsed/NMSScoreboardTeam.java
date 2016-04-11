package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ScoreboardTeam")
public class NMSScoreboardTeam extends NMSScoreboardTeamBase {

    public NMSScoreboardTeam(Object nmsObject){
        super(nmsObject);
    }

    public NMSScoreboardTeam(NMSScoreboard scoreboard, String s){
        super("ScoreboardTeam", new Object[]{NMSScoreboard.class, String.class}, new Object[]{scoreboard, s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#a(net.minecraft.server.v1_9_R1.EnumChatFormat)
     */
    @ReflectiveMethod(name = "a", types = {NMSEnumChatFormat.class})
    public void a(NMSEnumChatFormat enumChatFormat){
        NMSWrapper.getInstance().exec(nmsObject, enumChatFormat);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#allowFriendlyFire()
     */
    @ReflectiveMethod(name = "allowFriendlyFire", types = {})
    public boolean allowFriendlyFire(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#b(net.minecraft.server.v1_9_R1.ScoreboardTeamBase$EnumNameTagVisibility)
     */
    @ReflectiveMethod(name = "b", types = {NMSEnumNameTagVisibility.class})
    public void b(NMSEnumNameTagVisibility enumNameTagVisibility){
        NMSWrapper.getInstance().exec(nmsObject, enumNameTagVisibility);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#canSeeFriendlyInvisibles()
     */
    @ReflectiveMethod(name = "canSeeFriendlyInvisibles", types = {})
    public boolean canSeeFriendlyInvisibles(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#getDisplayName()
     */
    @ReflectiveMethod(name = "getDisplayName", types = {})
    public String getDisplayName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#getFormattedName(java.lang.String)
     */
    @ReflectiveMethod(name = "getFormattedName", types = {String.class})
    public String getFormattedName(String s){
        return (String) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#getNameTagVisibility()
     */
    @ReflectiveMethod(name = "getNameTagVisibility", types = {})
    public NMSEnumNameTagVisibility getNameTagVisibility(){
        return new NMSEnumNameTagVisibility(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#getPlayerDisplayName(net.minecraft.server.v1_9_R1.ScoreboardTeamBase, java.lang.String)
     */
    @ReflectiveMethod(name = "getPlayerDisplayName", types = {NMSScoreboardTeamBase.class, String.class})
    public String getPlayerDisplayName(NMSScoreboardTeamBase scoreboardTeamBase, String s){
        return (String) NMSWrapper.getInstance().exec(nmsObject, scoreboardTeamBase, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#getPrefix()
     */
    @ReflectiveMethod(name = "getPrefix", types = {})
    public String getPrefix(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#getSuffix()
     */
    @ReflectiveMethod(name = "getSuffix", types = {})
    public String getSuffix(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public NMSEnumNameTagVisibility j(){
        return new NMSEnumNameTagVisibility(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public NMSEnumChatFormat l(){
        return new NMSEnumChatFormat(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#packOptionData()
     */
    @ReflectiveMethod(name = "packOptionData", types = {})
    public int packOptionData(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#setAllowFriendlyFire(boolean)
     */
    @ReflectiveMethod(name = "setAllowFriendlyFire", types = {boolean.class})
    public void setAllowFriendlyFire(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#setCanSeeFriendlyInvisibles(boolean)
     */
    @ReflectiveMethod(name = "setCanSeeFriendlyInvisibles", types = {boolean.class})
    public void setCanSeeFriendlyInvisibles(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#setDisplayName(java.lang.String)
     */
    @ReflectiveMethod(name = "setDisplayName", types = {String.class})
    public void setDisplayName(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#setNameTagVisibility(net.minecraft.server.v1_9_R1.ScoreboardTeamBase$EnumNameTagVisibility)
     */
    @ReflectiveMethod(name = "setNameTagVisibility", types = {NMSEnumNameTagVisibility.class})
    public void setNameTagVisibility(NMSEnumNameTagVisibility enumNameTagVisibility){
        NMSWrapper.getInstance().exec(nmsObject, enumNameTagVisibility);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#setPrefix(java.lang.String)
     */
    @ReflectiveMethod(name = "setPrefix", types = {String.class})
    public void setPrefix(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ScoreboardTeam#setSuffix(java.lang.String)
     */
    @ReflectiveMethod(name = "setSuffix", types = {String.class})
    public void setSuffix(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

}