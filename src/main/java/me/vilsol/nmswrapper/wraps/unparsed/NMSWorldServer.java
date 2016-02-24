package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSEnumParticle;
import me.vilsol.nmswrapper.wraps.NMSWorld;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.UUID;

@ReflectiveClass(name = "WorldServer")
public class NMSWorldServer extends NMSWorld implements NMSIAsyncTaskHandler {

    public NMSWorldServer(Object nmsObject){
        super(nmsObject);
    }

    public NMSWorldServer(NMSMinecraftServer minecraftServer, NMSIDataManager iDataManager, NMSWorldData worldData, int i, NMSMethodProfiler methodProfiler, World.Environment environment, ChunkGenerator chunkGenerator){
        super("WorldServer", new Object[]{NMSMinecraftServer.class, NMSIDataManager.class, NMSWorldData.class, int.class, NMSMethodProfiler.class, World.Environment.class, ChunkGenerator.class}, new Object[]{minecraftServer, iDataManager, worldData, i, methodProfiler, environment, chunkGenerator});
    }

    public NMSWorldServer(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldServer#a(net.minecraft.server.v1_8_R3.EnumParticle, boolean, double, double, double, int, double, double, double, double, int...)
     */
    @ReflectiveMethod(name = "a", types = {NMSEnumParticle.class, boolean.class, double.class, double.class, double.class, int.class, double.class, double.class, double.class, double.class, int[].class})
    public void a(NMSEnumParticle enumParticle, boolean b, double d, double d1, double d2, int i, double d3, double d4, double d5, double d6, int[] array){
        NMSWrapper.getInstance().exec(nmsObject, enumParticle, b, d, d1, d2, i, d3, d4, d5, d6, array);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldServer#b(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntity.class})
    public void b(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#broadcastEntityEffect(net.minecraft.server.v1_8_R3.Entity, byte)
     */
    @ReflectiveMethod(name = "broadcastEntityEffect", types = {NMSEntity.class, byte.class})
    public void broadcastEntityEffect(NMSEntity entity, byte b){
        NMSWrapper.getInstance().exec(nmsObject, entity, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#createExplosion(net.minecraft.server.v1_8_R3.Entity, double, double, double, float, boolean, boolean)
     */
    @ReflectiveMethod(name = "createExplosion", types = {NMSEntity.class, double.class, double.class, double.class, float.class, boolean.class, boolean.class})
    public NMSExplosion createExplosion(NMSEntity entity, double d, double d1, double d2, float f, boolean b, boolean b1){
        return new NMSExplosion(NMSWrapper.getInstance().exec(nmsObject, entity, d, d1, d2, f, b, b1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#doTick()
     */
    @ReflectiveMethod(name = "doTick", types = {})
    public void doTick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldServer#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public void e(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#everyoneDeeplySleeping()
     */
    @ReflectiveMethod(name = "everyoneDeeplySleeping", types = {})
    public boolean everyoneDeeplySleeping(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#everyoneSleeping()
     */
    @ReflectiveMethod(name = "everyoneSleeping", types = {})
    public void everyoneSleeping(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#flushSave()
     */
    @ReflectiveMethod(name = "flushSave", types = {})
    public void flushSave(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#getDimensionSpawn()
     */
    @ReflectiveMethod(name = "getDimensionSpawn", types = {})
    public NMSBlockPosition getDimensionSpawn(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#getEntity(java.util.UUID)
     */
    @ReflectiveMethod(name = "getEntity", types = {UUID.class})
    public NMSEntity getEntity(UUID uUID){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject, uUID));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#getMinecraftServer()
     */
    @ReflectiveMethod(name = "getMinecraftServer", types = {})
    public NMSMinecraftServer getMinecraftServer(){
        return new NMSMinecraftServer(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#getPlayerChunkMap()
     */
    @ReflectiveMethod(name = "getPlayerChunkMap", types = {})
    public NMSPlayerChunkMap getPlayerChunkMap(){
        return new NMSPlayerChunkMap(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#getTileEntity(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getTileEntity", types = {NMSBlockPosition.class})
    public NMSTileEntity getTileEntity(NMSBlockPosition blockPosition){
        return new NMSTileEntity(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#getTracker()
     */
    @ReflectiveMethod(name = "getTracker", types = {})
    public NMSEntityTracker getTracker(){
        return new NMSEntityTracker(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#getTravelAgent()
     */
    @ReflectiveMethod(name = "getTravelAgent", types = {})
    public NMSPortalTravelAgent getTravelAgent(){
        return new NMSPortalTravelAgent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldServer#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#isMainThread()
     */
    @ReflectiveMethod(name = "isMainThread", types = {})
    public boolean isMainThread(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldServer#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public void j(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldServer#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public NMSIChunkProvider k(){
        return (NMSIChunkProvider) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldServer#l()
     */
    @ReflectiveMethod(name = "l", types = {})
    public void l(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldServer#p()
     */
    @ReflectiveMethod(name = "p", types = {})
    public void p(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#playBlockAction(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.Block, int, int)
     */
    @ReflectiveMethod(name = "playBlockAction", types = {NMSBlockPosition.class, NMSBlock.class, int.class, int.class})
    public void playBlockAction(NMSBlockPosition blockPosition, NMSBlock block, int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition, block, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.WorldServer#q()
     */
    @ReflectiveMethod(name = "q", types = {})
    public int q(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#saveLevel()
     */
    @ReflectiveMethod(name = "saveLevel", types = {})
    public void saveLevel(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#sendParticles(net.minecraft.server.v1_8_R3.EntityPlayer, net.minecraft.server.v1_8_R3.EnumParticle, boolean, double, double, double, int, double, double, double, double, int...)
     */
    @ReflectiveMethod(name = "sendParticles", types = {NMSEntityPlayer.class, NMSEnumParticle.class, boolean.class, double.class, double.class, double.class, int.class, double.class, double.class, double.class, double.class, int[].class})
    public void sendParticles(NMSEntityPlayer entityPlayer, NMSEnumParticle enumParticle, boolean b, double d, double d1, double d2, int i, double d3, double d4, double d5, double d6, int[] array){
        NMSWrapper.getInstance().exec(nmsObject, entityPlayer, enumParticle, b, d, d1, d2, i, d3, d4, d5, d6, array);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#strikeLightning(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "strikeLightning", types = {NMSEntity.class})
    public boolean strikeLightning(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.WorldServer#tickEntities()
     */
    @ReflectiveMethod(name = "tickEntities", types = {})
    public void tickEntities(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}