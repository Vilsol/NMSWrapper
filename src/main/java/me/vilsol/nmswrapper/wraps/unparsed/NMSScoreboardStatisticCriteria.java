package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ScoreboardStatisticCriteria")
public class NMSScoreboardStatisticCriteria extends NMSScoreboardBaseCriteria {

    public NMSScoreboardStatisticCriteria(Object nmsObject){
        super(nmsObject);
    }

    public NMSScoreboardStatisticCriteria(NMSStatistic statistic){
        super("ScoreboardStatisticCriteria", new Object[]{NMSStatistic.class}, new Object[]{statistic});
    }

}