package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.Reflection;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import me.vilsol.nmswrapper.wraps.world.NMSGameRules;
import org.bukkit.World;

@ReflectiveClass(name = "World")
public class NMSWorld extends NMSWrap {

    public NMSWorld(World world) {
        super(Reflection.executeMethod(world, "getHandle", new Object[]{}, new Object[]{}));
    }

    @ReflectiveMethod(name = "getGameRules")
    public NMSGameRules getGameRules(){
        return new NMSGameRules(NMSWrapper.getInstance().exec(nmsObject));
    }

}
