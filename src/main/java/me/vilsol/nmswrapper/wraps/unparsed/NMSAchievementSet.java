package me.vilsol.nmswrapper.wraps.unparsed;

import com.google.common.collect.ForwardingSet;
import com.google.gson.JsonElement;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "AchievementSet")
public class NMSAchievementSet extends ForwardingSet {

    public NMSAchievementSet(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.AchievementSet#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public JsonElement a(){
        return new JsonElement(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.AchievementSet#delegate()
     */
    @ReflectiveMethod(name = "delegate", types = {})
    public Object delegate(){
        return NMSWrapper.getInstance().exec(nmsObject);
    }

}