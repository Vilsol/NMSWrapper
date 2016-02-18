package me.vilsol.nmswrapper.wraps.world;

import me.vilsol.nmswrapper.Reflection;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.World;

public class NMSWorld extends NMSWrap {

    public NMSWorld(World world) {
        super(Reflection.doMethod(world, "getHandle", new Object[]{}, new Object[]{}));
    }

    public NMSGameRules getGameRules(){
        return new NMSGameRules(Reflection.doMethod(nmsObject, "getGameRules", new Object[]{}, new Object[]{}));
    }

    public void sendParticles(){

    }

}
