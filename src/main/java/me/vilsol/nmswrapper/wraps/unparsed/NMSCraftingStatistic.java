package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CraftingStatistic")
public class NMSCraftingStatistic extends NMSStatistic {

    public NMSCraftingStatistic(Object nmsObject){
        super(nmsObject);
    }

    public NMSCraftingStatistic(String s, String s1, NMSIChatBaseComponent iChatBaseComponent, NMSItem item){
        super("CraftingStatistic", new Object[]{String.class, String.class, NMSIChatBaseComponent.class, NMSItem.class}, new Object[]{s, s1, iChatBaseComponent, item});
    }

}