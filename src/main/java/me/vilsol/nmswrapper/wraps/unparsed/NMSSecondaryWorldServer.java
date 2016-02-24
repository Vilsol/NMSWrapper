package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

@ReflectiveClass(name = "SecondaryWorldServer")
public class NMSSecondaryWorldServer extends NMSWorldServer {

    public NMSSecondaryWorldServer(Object nmsObject){
        super(nmsObject);
    }

    public NMSSecondaryWorldServer(NMSMinecraftServer minecraftServer, NMSIDataManager iDataManager, int i, NMSWorldServer worldServer, NMSMethodProfiler methodProfiler, NMSWorldData worldData, World.Environment environment, ChunkGenerator chunkGenerator){
        super("SecondaryWorldServer", new Object[]{NMSMinecraftServer.class, NMSIDataManager.class, int.class, NMSWorldServer.class, NMSMethodProfiler.class, NMSWorldData.class, World.Environment.class, ChunkGenerator.class}, new Object[]{minecraftServer, iDataManager, i, worldServer, methodProfiler, worldData, environment, chunkGenerator});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.SecondaryWorldServer#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSWorld b(){
        return new NMSWorld(NMSWrapper.getInstance().exec(nmsObject));
    }

}