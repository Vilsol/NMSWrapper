package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.Reflection;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveField;

@ReflectiveClass(name = "MinecraftServer")
public class NMSMinecraftServer extends NMSWrap {

    private static NMSMinecraftServer instance = new NMSMinecraftServer();

    public static NMSMinecraftServer getServer(){
        return instance;
    }

    private NMSMinecraftServer() {
        super(Reflection.staticReflection("MinecraftServer", "getServer", new Object[]{}, new Object[]{}));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#primaryThread
     */
    @ReflectiveField(name = "primaryThread")
    public Thread getPrimaryThread(){
        return (Thread) NMSWrapper.getInstance().exec(nmsObject);
    }

}
