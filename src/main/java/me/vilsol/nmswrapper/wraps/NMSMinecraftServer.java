package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.Reflection;

public class NMSMinecraftServer extends NMSWrap {

    private static NMSMinecraftServer instance = new NMSMinecraftServer();

    public static NMSMinecraftServer getServer(){
        return instance;
    }

    private NMSMinecraftServer() {
        super(Reflection.staticReflection("MinecraftServer", "getServer", new Object[]{}, new Object[]{}));
    }

    public Thread getPrimaryThread(){
        return (Thread) Reflection.getField(nmsObject, "primaryThread");
    }

}
