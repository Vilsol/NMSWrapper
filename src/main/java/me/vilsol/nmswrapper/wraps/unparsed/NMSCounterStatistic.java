package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CounterStatistic")
public class NMSCounterStatistic extends NMSStatistic {

    public NMSCounterStatistic(Object nmsObject){
        super(nmsObject);
    }

    public NMSCounterStatistic(String s, NMSIChatBaseComponent iChatBaseComponent, NMSCounter counter){
        super("CounterStatistic", new Object[]{String.class, NMSIChatBaseComponent.class, NMSCounter.class}, new Object[]{s, iChatBaseComponent, counter});
    }

    public NMSCounterStatistic(String s, NMSIChatBaseComponent iChatBaseComponent){
        super("CounterStatistic", new Object[]{String.class, NMSIChatBaseComponent.class}, new Object[]{s, iChatBaseComponent});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CounterStatistic#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public NMSStatistic h(){
        return new NMSStatistic(NMSWrapper.getInstance().exec(nmsObject));
    }

}