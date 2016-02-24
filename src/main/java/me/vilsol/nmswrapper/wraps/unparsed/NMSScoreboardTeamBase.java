package me.vilsol.nmswrapper.wraps.unparsed;


import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

// TODO Implement
@ReflectiveClass(name = "ScoreboardTeamBase")
public abstract class NMSScoreboardTeamBase extends NMSWrap {

    public NMSScoreboardTeamBase(Object nmsObject) {
        super(nmsObject);
    }

    public NMSScoreboardTeamBase(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

}
