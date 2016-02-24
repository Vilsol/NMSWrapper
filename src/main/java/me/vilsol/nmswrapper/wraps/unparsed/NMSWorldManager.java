package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "WorldManager")
public class NMSWorldManager extends NMSWrap implements NMSIWorldAccess {

    public NMSWorldManager(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldManager(NMSMinecraftServer minecraftServer, NMSWorldServer worldServer){
        super("WorldManager", new Object[]{NMSMinecraftServer.class, NMSWorldServer.class}, new Object[]{minecraftServer, worldServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldManager#a(int, net.minecraft.server.v1_8_R3.BlockPosition, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, NMSBlockPosition.class, int.class})
    public void a(int i, NMSBlockPosition blockPosition, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, blockPosition, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldManager#b(int, net.minecraft.server.v1_8_R3.BlockPosition, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, NMSBlockPosition.class, int.class})
    public void b(int i, NMSBlockPosition blockPosition, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, blockPosition, i1);
    }

}