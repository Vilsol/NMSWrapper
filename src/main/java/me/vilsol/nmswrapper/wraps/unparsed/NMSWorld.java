package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "World")
public class NMSWorld extends NMSWrap implements NMSIBlockAccess {

    public NMSWorld(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#A(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "A", types = {NMSBlockPosition.class})
    public int A(NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#B(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "B", types = {NMSBlockPosition.class})
    public void B(NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#C()
     */
    @ReflectiveMethod(name = "C", types = {})
    public void C(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#D(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "D", types = {NMSBlockPosition.class})
    public boolean D(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#E(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "E", types = {NMSBlockPosition.class})
    public NMSDifficultyDamageScaler E(NMSBlockPosition blockPosition){
        return new NMSDifficultyDamageScaler(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#F()
     */
    @ReflectiveMethod(name = "F", types = {})
    public int F(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#G()
     */
    @ReflectiveMethod(name = "G", types = {})
    public NMSWorldType G(){
        return new NMSWorldType(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#N()
     */
    @ReflectiveMethod(name = "N", types = {})
    public NMSIChunkProvider N(){
        return new NMSIChunkProvider(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#R()
     */
    @ReflectiveMethod(name = "R", types = {})
    public boolean R(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#S()
     */
    @ReflectiveMethod(name = "S", types = {})
    public boolean S(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#T()
     */
    @ReflectiveMethod(name = "T", types = {})
    public NMSPersistentCollection T(){
        return new NMSPersistentCollection(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#V()
     */
    @ReflectiveMethod(name = "V", types = {})
    public int V(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#Y()
     */
    @ReflectiveMethod(name = "Y", types = {})
    public Calendar Y(){
        return new Calendar(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#a(net.minecraft.server.v1_8_R3.CrashReport)
     */
    @ReflectiveMethod(name = "a", types = {NMSCrashReport.class})
    public NMSCrashReportSystemDetails a(NMSCrashReport crashReport){
        return new NMSCrashReportSystemDetails(NMSWrapper.getInstance().exec(nmsObject, crashReport));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#ab()
     */
    @ReflectiveMethod(name = "ab", types = {})
    public int ab(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#ad()
     */
    @ReflectiveMethod(name = "ad", types = {})
    public boolean ad(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#addEntity(net.minecraft.server.v1_8_R3.Entity, org.bukkit.event.entity.CreatureSpawnEvent$SpawnReason)
     */
    @ReflectiveMethod(name = "addEntity", types = {NMSEntity.class, SpawnReason.class})
    public boolean addEntity(NMSEntity entity, SpawnReason spawnReason){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity, spawnReason);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#addIWorldAccess(net.minecraft.server.v1_8_R3.IWorldAccess)
     */
    @ReflectiveMethod(name = "addIWorldAccess", types = {NMSIWorldAccess.class})
    public void addIWorldAccess(NMSIWorldAccess iWorldAccess){
        NMSWrapper.getInstance().exec(nmsObject, iWorldAccess);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#addParticle(net.minecraft.server.v1_8_R3.EnumParticle, double, double, double, double, double, double, int...)
     */
    @ReflectiveMethod(name = "addParticle", types = {NMSEnumParticle.class, double.class, double.class, double.class, double.class, double.class, double.class, int[].class})
    public void addParticle(NMSEnumParticle enumParticle, double d, double d1, double d2, double d3, double d4, double d5, int[] array){
        NMSWrapper.getInstance().exec(nmsObject, enumParticle, d, d1, d2, d3, d4, d5, array);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#ae()
     */
    @ReflectiveMethod(name = "ae", types = {})
    public NMSPersistentVillage ae(){
        return new NMSPersistentVillage(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#applyPhysics(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "applyPhysics", types = {NMSBlockPosition.class, NMSBlock.class})
    public void applyPhysics(NMSBlockPosition blockPosition, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition, block);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#areChunksLoaded(net.minecraft.server.v1_8_R3.BlockPosition, int, boolean)
     */
    @ReflectiveMethod(name = "areChunksLoaded", types = {NMSBlockPosition.class, int.class, boolean.class})
    public boolean areChunksLoaded(NMSBlockPosition blockPosition, int i, boolean b){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition, i, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#areChunksLoadedBetween(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.BlockPosition, boolean)
     */
    @ReflectiveMethod(name = "areChunksLoadedBetween", types = {NMSBlockPosition.class, NMSBlockPosition.class, boolean.class})
    public boolean areChunksLoadedBetween(NMSBlockPosition blockPosition, NMSBlockPosition blockPosition1, boolean b){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition, blockPosition1, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#b(java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {String.class})
    public int b(String s){
        return (int) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#broadcastEntityEffect(net.minecraft.server.v1_8_R3.Entity, byte)
     */
    @ReflectiveMethod(name = "broadcastEntityEffect", types = {NMSEntity.class, byte.class})
    public void broadcastEntityEffect(NMSEntity entity, byte b){
        NMSWrapper.getInstance().exec(nmsObject, entity, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#c(int, int)
     */
    @ReflectiveMethod(name = "c", types = {int.class, int.class})
    public boolean c(int i, int i1){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#checkSleepStatus()
     */
    @ReflectiveMethod(name = "checkSleepStatus", types = {})
    public void checkSleepStatus(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#chunkToKey(int, int)
     */
    @ReflectiveMethod(name = "chunkToKey", types = {int.class, int.class})
    public long chunkToKey(int i, int i1){
        return (long) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#containsLiquid(net.minecraft.server.v1_8_R3.AxisAlignedBB)
     */
    @ReflectiveMethod(name = "containsLiquid", types = {NMSAxisAlignedBB.class})
    public boolean containsLiquid(NMSAxisAlignedBB axisAlignedBB){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, axisAlignedBB);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#createExplosion(net.minecraft.server.v1_8_R3.Entity, double, double, double, float, boolean, boolean)
     */
    @ReflectiveMethod(name = "createExplosion", types = {NMSEntity.class, double.class, double.class, double.class, float.class, boolean.class, boolean.class})
    public NMSExplosion createExplosion(NMSEntity entity, double d, double d1, double d2, float f, boolean b, boolean b1){
        return new NMSExplosion(NMSWrapper.getInstance().exec(nmsObject, entity, d, d1, d2, f, b, b1));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#d(int)
     */
    @ReflectiveMethod(name = "d", types = {int.class})
    public void d(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#doTick()
     */
    @ReflectiveMethod(name = "doTick", types = {})
    public void doTick(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#douseFire(net.minecraft.server.v1_8_R3.EntityHuman, net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection)
     */
    @ReflectiveMethod(name = "douseFire", types = {NMSEntityHuman.class, NMSBlockPosition.class, NMSEnumDirection.class})
    public boolean douseFire(NMSEntityHuman entityHuman, NMSBlockPosition blockPosition, NMSEnumDirection enumDirection){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman, blockPosition, enumDirection);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#e(net.minecraft.server.v1_8_R3.BlockPosition, boolean)
     */
    @ReflectiveMethod(name = "e", types = {NMSBlockPosition.class, boolean.class})
    public boolean e(NMSBlockPosition blockPosition, boolean b){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#entityJoinedWorld(net.minecraft.server.v1_8_R3.Entity, boolean)
     */
    @ReflectiveMethod(name = "entityJoinedWorld", types = {NMSEntity.class, boolean.class})
    public void entityJoinedWorld(NMSEntity entity, boolean b){
        NMSWrapper.getInstance().exec(nmsObject, entity, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#everyoneSleeping()
     */
    @ReflectiveMethod(name = "everyoneSleeping", types = {})
    public void everyoneSleeping(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#explode(net.minecraft.server.v1_8_R3.Entity, double, double, double, float, boolean)
     */
    @ReflectiveMethod(name = "explode", types = {NMSEntity.class, double.class, double.class, double.class, float.class, boolean.class})
    public NMSExplosion explode(NMSEntity entity, double d, double d1, double d2, float f, boolean b){
        return new NMSExplosion(NMSWrapper.getInstance().exec(nmsObject, entity, d, d1, d2, f, b));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#f(net.minecraft.server.v1_8_R3.BlockPosition, boolean)
     */
    @ReflectiveMethod(name = "f", types = {NMSBlockPosition.class, boolean.class})
    public boolean f(NMSBlockPosition blockPosition, boolean b){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#findNearbyPlayer(double, double, double, double)
     */
    @ReflectiveMethod(name = "findNearbyPlayer", types = {double.class, double.class, double.class, double.class})
    public NMSEntityHuman findNearbyPlayer(double d, double d1, double d2, double d3){
        return new NMSEntityHuman(NMSWrapper.getInstance().exec(nmsObject, d, d1, d2, d3));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#g(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "g", types = {NMSEntity.class})
    public void g(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getBiome(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getBiome", types = {NMSBlockPosition.class})
    public NMSBiomeBase getBiome(NMSBlockPosition blockPosition){
        return new NMSBiomeBase(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getBlockFacePower(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection)
     */
    @ReflectiveMethod(name = "getBlockFacePower", types = {NMSBlockPosition.class, NMSEnumDirection.class})
    public int getBlockFacePower(NMSBlockPosition blockPosition, NMSEnumDirection enumDirection){
        return (int) NMSWrapper.getInstance().exec(nmsObject, blockPosition, enumDirection);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getBlockPower(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getBlockPower", types = {NMSBlockPosition.class})
    public int getBlockPower(NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getChunkAt(int, int)
     */
    @ReflectiveMethod(name = "getChunkAt", types = {int.class, int.class})
    public NMSChunk getChunkAt(int i, int i1){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getChunkAtWorldCoords(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getChunkAtWorldCoords", types = {NMSBlockPosition.class})
    public NMSChunk getChunkAtWorldCoords(NMSBlockPosition blockPosition){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getChunkIfLoaded(int, int)
     */
    @ReflectiveMethod(name = "getChunkIfLoaded", types = {int.class, int.class})
    public NMSChunk getChunkIfLoaded(int i, int i1){
        return new NMSChunk(NMSWrapper.getInstance().exec(nmsObject, i, i1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getDataManager()
     */
    @ReflectiveMethod(name = "getDataManager", types = {})
    public NMSIDataManager getDataManager(){
        return new NMSIDataManager(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getDayTime()
     */
    @ReflectiveMethod(name = "getDayTime", types = {})
    public long getDayTime(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getDifficulty()
     */
    @ReflectiveMethod(name = "getDifficulty", types = {})
    public NMSEnumDifficulty getDifficulty(){
        return new NMSEnumDifficulty(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getGameRules()
     */
    @ReflectiveMethod(name = "getGameRules", types = {})
    public NMSGameRules getGameRules(){
        return new NMSGameRules(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getHeight()
     */
    @ReflectiveMethod(name = "getHeight", types = {})
    public int getHeight(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getHighestBlockYAt(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getHighestBlockYAt", types = {NMSBlockPosition.class})
    public NMSBlockPosition getHighestBlockYAt(NMSBlockPosition blockPosition){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getLightLevel(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getLightLevel", types = {NMSBlockPosition.class})
    public int getLightLevel(NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getScoreboard()
     */
    @ReflectiveMethod(name = "getScoreboard", types = {})
    public NMSScoreboard getScoreboard(){
        return new NMSScoreboard(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getSeed()
     */
    @ReflectiveMethod(name = "getSeed", types = {})
    public long getSeed(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getServer()
     */
    @ReflectiveMethod(name = "getServer", types = {})
    public NMSCraftServer getServer(){
        return new NMSCraftServer(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getSpawn()
     */
    @ReflectiveMethod(name = "getSpawn", types = {})
    public NMSBlockPosition getSpawn(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getTileEntity(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "getTileEntity", types = {NMSBlockPosition.class})
    public NMSTileEntity getTileEntity(NMSBlockPosition blockPosition){
        return new NMSTileEntity(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getTime()
     */
    @ReflectiveMethod(name = "getTime", types = {})
    public long getTime(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getType(net.minecraft.server.v1_8_R3.BlockPosition, boolean)
     */
    @ReflectiveMethod(name = "getType", types = {NMSBlockPosition.class, boolean.class})
    public NMSIBlockData getType(NMSBlockPosition blockPosition, boolean b){
        return new NMSIBlockData(NMSWrapper.getInstance().exec(nmsObject, blockPosition, b));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getWorld()
     */
    @ReflectiveMethod(name = "getWorld", types = {})
    public NMSCraftWorld getWorld(){
        return new NMSCraftWorld(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getWorldBorder()
     */
    @ReflectiveMethod(name = "getWorldBorder", types = {})
    public NMSWorldBorder getWorldBorder(){
        return new NMSWorldBorder(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getWorldChunkManager()
     */
    @ReflectiveMethod(name = "getWorldChunkManager", types = {})
    public NMSWorldChunkManager getWorldChunkManager(){
        return new NMSWorldChunkManager(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#getWorldData()
     */
    @ReflectiveMethod(name = "getWorldData", types = {})
    public NMSWorldData getWorldData(){
        return new NMSWorldData(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#h(float)
     */
    @ReflectiveMethod(name = "h", types = {float.class})
    public float h(float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#i(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "i", types = {NMSBlockPosition.class})
    public boolean i(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#isBlockFacePowered(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.EnumDirection)
     */
    @ReflectiveMethod(name = "isBlockFacePowered", types = {NMSBlockPosition.class, NMSEnumDirection.class})
    public boolean isBlockFacePowered(NMSBlockPosition blockPosition, NMSEnumDirection enumDirection){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition, enumDirection);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#isBlockIndirectlyPowered(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "isBlockIndirectlyPowered", types = {NMSBlockPosition.class})
    public boolean isBlockIndirectlyPowered(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#isChunkLoaded(int, int, boolean)
     */
    @ReflectiveMethod(name = "isChunkLoaded", types = {int.class, int.class, boolean.class})
    public boolean isChunkLoaded(int i, int i1, boolean b){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, i, i1, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#isEmpty(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "isEmpty", types = {NMSBlockPosition.class})
    public boolean isEmpty(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#isLoaded(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "isLoaded", types = {NMSBlockPosition.class})
    public boolean isLoaded(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#isPlayerNearby(double, double, double, double)
     */
    @ReflectiveMethod(name = "isPlayerNearby", types = {double.class, double.class, double.class, double.class})
    public boolean isPlayerNearby(double d, double d1, double d2, double d3){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, d, d1, d2, d3);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#isRainingAt(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "isRainingAt", types = {NMSBlockPosition.class})
    public boolean isRainingAt(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#j(float)
     */
    @ReflectiveMethod(name = "j", types = {float.class})
    public float j(float f){
        return (float) NMSWrapper.getInstance().exec(nmsObject, f);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#k(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "k", types = {NMSBlockPosition.class})
    public int k(NMSBlockPosition blockPosition){
        return (int) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#keyToX(long)
     */
    @ReflectiveMethod(name = "keyToX", types = {long.class})
    public int keyToX(long l){
        return (int) NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#keyToZ(long)
     */
    @ReflectiveMethod(name = "keyToZ", types = {long.class})
    public int keyToZ(long l){
        return (int) NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#kill(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "kill", types = {NMSEntity.class})
    public void kill(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#makeSound(double, double, double, java.lang.String, float, float)
     */
    @ReflectiveMethod(name = "makeSound", types = {double.class, double.class, double.class, String.class, float.class, float.class})
    public void makeSound(double d, double d1, double d2, String s, float f, float f1){
        NMSWrapper.getInstance().exec(nmsObject, d, d1, d2, s, f, f1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#n(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "n", types = {NMSBlockPosition.class})
    public void n(NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#notify(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "notify", types = {NMSBlockPosition.class})
    public void notify(NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#notifyAndUpdatePhysics(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.Chunk, net.minecraft.server.v1_8_R3.Block, net.minecraft.server.v1_8_R3.Block, int)
     */
    @ReflectiveMethod(name = "notifyAndUpdatePhysics", types = {NMSBlockPosition.class, NMSChunk.class, NMSBlock.class, NMSBlock.class, int.class})
    public void notifyAndUpdatePhysics(NMSBlockPosition blockPosition, NMSChunk chunk, NMSBlock block, NMSBlock block1, int i){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition, chunk, block, block1, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#o(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "o", types = {NMSBlockPosition.class})
    public float o(NMSBlockPosition blockPosition){
        return (float) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#p()
     */
    @ReflectiveMethod(name = "p", types = {})
    public void p(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#playBlockAction(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.Block, int, int)
     */
    @ReflectiveMethod(name = "playBlockAction", types = {NMSBlockPosition.class, NMSBlock.class, int.class, int.class})
    public void playBlockAction(NMSBlockPosition blockPosition, NMSBlock block, int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition, block, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#q()
     */
    @ReflectiveMethod(name = "q", types = {})
    public int q(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#r(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "r", types = {NMSBlockPosition.class})
    public NMSBlockPosition r(NMSBlockPosition blockPosition){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, blockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#rayTrace(net.minecraft.server.v1_8_R3.Vec3D, net.minecraft.server.v1_8_R3.Vec3D, boolean, boolean, boolean)
     */
    @ReflectiveMethod(name = "rayTrace", types = {NMSVec3D.class, NMSVec3D.class, boolean.class, boolean.class, boolean.class})
    public NMSMovingObjectPosition rayTrace(NMSVec3D vec3D, NMSVec3D vec3D1, boolean b, boolean b1, boolean b2){
        return new NMSMovingObjectPosition(NMSWrapper.getInstance().exec(nmsObject, vec3D, vec3D1, b, b1, b2));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#removeEntity(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "removeEntity", types = {NMSEntity.class})
    public void removeEntity(NMSEntity entity){
        NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#setAir(net.minecraft.server.v1_8_R3.BlockPosition, boolean)
     */
    @ReflectiveMethod(name = "setAir", types = {NMSBlockPosition.class, boolean.class})
    public boolean setAir(NMSBlockPosition blockPosition, boolean b){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#setDayTime(long)
     */
    @ReflectiveMethod(name = "setDayTime", types = {long.class})
    public void setDayTime(long l){
        NMSWrapper.getInstance().exec(nmsObject, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#setSpawnFlags(boolean, boolean)
     */
    @ReflectiveMethod(name = "setSpawnFlags", types = {boolean.class, boolean.class})
    public void setSpawnFlags(boolean b, boolean b1){
        NMSWrapper.getInstance().exec(nmsObject, b, b1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#setTileEntity(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.TileEntity)
     */
    @ReflectiveMethod(name = "setTileEntity", types = {NMSBlockPosition.class, NMSTileEntity.class})
    public void setTileEntity(NMSBlockPosition blockPosition, NMSTileEntity tileEntity){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition, tileEntity);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#setTypeAndData(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData, int)
     */
    @ReflectiveMethod(name = "setTypeAndData", types = {NMSBlockPosition.class, NMSIBlockData.class, int.class})
    public boolean setTypeAndData(NMSBlockPosition blockPosition, NMSIBlockData iBlockData, int i){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition, iBlockData, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#setTypeUpdate(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.IBlockData)
     */
    @ReflectiveMethod(name = "setTypeUpdate", types = {NMSBlockPosition.class, NMSIBlockData.class})
    public boolean setTypeUpdate(NMSBlockPosition blockPosition, NMSIBlockData iBlockData){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition, iBlockData);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#strikeLightning(net.minecraft.server.v1_8_R3.Entity)
     */
    @ReflectiveMethod(name = "strikeLightning", types = {NMSEntity.class})
    public boolean strikeLightning(NMSEntity entity){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#t(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "t", types = {NMSBlockPosition.class})
    public void t(NMSBlockPosition blockPosition){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#tickEntities()
     */
    @ReflectiveMethod(name = "tickEntities", types = {})
    public void tickEntities(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#triggerEffect(int, net.minecraft.server.v1_8_R3.BlockPosition, int)
     */
    @ReflectiveMethod(name = "triggerEffect", types = {int.class, NMSBlockPosition.class, int.class})
    public void triggerEffect(int i, NMSBlockPosition blockPosition, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, blockPosition, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#u(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "u", types = {NMSBlockPosition.class})
    public boolean u(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#update(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "update", types = {NMSBlockPosition.class, NMSBlock.class})
    public void update(NMSBlockPosition blockPosition, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition, block);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.World#updateAdjacentComparators(net.minecraft.server.v1_8_R3.BlockPosition, net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "updateAdjacentComparators", types = {NMSBlockPosition.class, NMSBlock.class})
    public void updateAdjacentComparators(NMSBlockPosition blockPosition, NMSBlock block){
        NMSWrapper.getInstance().exec(nmsObject, blockPosition, block);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#v(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "v", types = {NMSBlockPosition.class})
    public boolean v(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#w(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "w", types = {NMSBlockPosition.class})
    public boolean w(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#x(net.minecraft.server.v1_8_R3.BlockPosition)
     */
    @ReflectiveMethod(name = "x", types = {NMSBlockPosition.class})
    public boolean x(NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, blockPosition);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.World#y()
     */
    @ReflectiveMethod(name = "y", types = {})
    public float y(){
        return (float) NMSWrapper.getInstance().exec(nmsObject);
    }

}