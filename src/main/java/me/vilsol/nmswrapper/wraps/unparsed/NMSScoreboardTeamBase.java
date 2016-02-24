package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ScoreboardTeamBase")
public class NMSScoreboardTeamBase extends NMSWrap {

    public NMSScoreboardTeamBase(Object nmsObject){
        super(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ScoreboardTeamBase#allowFriendlyFire()
     */
    @ReflectiveMethod(name = "allowFriendlyFire", types = {})
    public boolean allowFriendlyFire(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ScoreboardTeamBase#getFormattedName(java.lang.String)
     */
    @ReflectiveMethod(name = "getFormattedName", types = {String.class})
    public String getFormattedName(String s){
        return (String) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ScoreboardTeamBase#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ScoreboardTeamBase#isAlly(net.minecraft.server.v1_8_R3.ScoreboardTeamBase)
     */
    @ReflectiveMethod(name = "isAlly", types = {NMSScoreboardTeamBase.class})
    public boolean isAlly(NMSScoreboardTeamBase scoreboardTeamBase){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, scoreboardTeamBase);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.ScoreboardTeamBase#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public NMSEnumNameTagVisibility j(){
        return new NMSEnumNameTagVisibility(NMSWrapper.getInstance().exec(nmsObject));
    }

}