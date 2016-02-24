package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NameReferencingFileConverter")
public class NMSNameReferencingFileConverter extends NMSWrap {

    public NMSNameReferencingFileConverter(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NameReferencingFileConverter#a(net.minecraft.server.v1_8_R3.PropertyManager)
     */
    @ReflectiveMethod(name = "a", types = {NMSPropertyManager.class})
    public boolean a(NMSPropertyManager propertyManager){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, propertyManager);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NameReferencingFileConverter#b(net.minecraft.server.v1_8_R3.MinecraftServer)
     */
    @ReflectiveMethod(name = "b", types = {NMSMinecraftServer.class})
    public boolean b(NMSMinecraftServer minecraftServer){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, minecraftServer);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NameReferencingFileConverter#c(net.minecraft.server.v1_8_R3.MinecraftServer)
     */
    @ReflectiveMethod(name = "c", types = {NMSMinecraftServer.class})
    public boolean c(NMSMinecraftServer minecraftServer){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, minecraftServer);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NameReferencingFileConverter#d(net.minecraft.server.v1_8_R3.MinecraftServer)
     */
    @ReflectiveMethod(name = "d", types = {NMSMinecraftServer.class})
    public boolean d(NMSMinecraftServer minecraftServer){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, minecraftServer);
    }

}