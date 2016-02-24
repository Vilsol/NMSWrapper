package me.vilsol.nmswrapper.wraps.unparsed;

import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.io.File;
import java.lang.reflect.Proxy;
import java.security.KeyPair;

@ReflectiveClass(name = "MinecraftServer")
public class NMSMinecraftServer extends NMSWrap implements NMSIMojangStatistics {

    public NMSMinecraftServer(Object nmsObject){
        super(nmsObject);
    }

    public NMSMinecraftServer(NMSOptionSet optionSet, Proxy proxy, File file){
        super("MinecraftServer", new Object[]{NMSOptionSet.class, Proxy.class, File.class}, new Object[]{optionSet, proxy, file});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#B()
     */
    @ReflectiveMethod(name = "B", types = {})
    public void B(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#C()
     */
    @ReflectiveMethod(name = "C", types = {})
    public void C(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#E()
     */
    @ReflectiveMethod(name = "E", types = {})
    public String E(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#F()
     */
    @ReflectiveMethod(name = "F", types = {})
    public int F(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#G()
     */
    @ReflectiveMethod(name = "G", types = {})
    public String G(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#I()
     */
    @ReflectiveMethod(name = "I", types = {})
    public int I(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#J()
     */
    @ReflectiveMethod(name = "J", types = {})
    public int J(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#O()
     */
    @ReflectiveMethod(name = "O", types = {})
    public boolean O(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#Q()
     */
    @ReflectiveMethod(name = "Q", types = {})
    public KeyPair Q(){
        return (KeyPair) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#R()
     */
    @ReflectiveMethod(name = "R", types = {})
    public int R(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#S()
     */
    @ReflectiveMethod(name = "S", types = {})
    public String S(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#T()
     */
    @ReflectiveMethod(name = "T", types = {})
    public boolean T(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#U()
     */
    @ReflectiveMethod(name = "U", types = {})
    public String U(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#X()
     */
    @ReflectiveMethod(name = "X", types = {})
    public boolean X(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#a(net.minecraft.server.v1_8_R3.CommandObjectiveExecutor$EnumCommandResult, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSEnumCommandResult.class, int.class})
    public void a(NMSEnumCommandResult enumCommandResult, int i){
        NMSWrapper.getInstance().exec(nmsObject, enumCommandResult, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#aB()
     */
    @ReflectiveMethod(name = "aB", types = {})
    public boolean aB(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#aD()
     */
    @ReflectiveMethod(name = "aD", types = {})
    public MinecraftSessionService aD(){
        return new MinecraftSessionService(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#aG()
     */
    @ReflectiveMethod(name = "aG", types = {})
    public NMSServerPing aG(){
        return new NMSServerPing(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#aH()
     */
    @ReflectiveMethod(name = "aH", types = {})
    public void aH(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#aI()
     */
    @ReflectiveMethod(name = "aI", types = {})
    public int aI(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#aK()
     */
    @ReflectiveMethod(name = "aK", types = {})
    public int aK(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#aL()
     */
    @ReflectiveMethod(name = "aL", types = {})
    public long aL(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#aM()
     */
    @ReflectiveMethod(name = "aM", types = {})
    public Thread aM(){
        return (Thread) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#a_(java.lang.String, int)
     */
    @ReflectiveMethod(name = "a_", types = {String.class, int.class})
    public void a_(String s, int i){
        NMSWrapper.getInstance().exec(nmsObject, s, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#aa()
     */
    @ReflectiveMethod(name = "aa", types = {})
    public void aa(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#ae()
     */
    @ReflectiveMethod(name = "ae", types = {})
    public boolean ae(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#ai()
     */
    @ReflectiveMethod(name = "ai", types = {})
    public boolean ai(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#aq()
     */
    @ReflectiveMethod(name = "aq", types = {})
    public NMSServerConnection aq(){
        return new NMSServerConnection(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#as()
     */
    @ReflectiveMethod(name = "as", types = {})
    public boolean as(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#at()
     */
    @ReflectiveMethod(name = "at", types = {})
    public int at(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#au()
     */
    @ReflectiveMethod(name = "au", types = {})
    public void au(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#ay()
     */
    @ReflectiveMethod(name = "ay", types = {})
    public Proxy ay(){
        return new Proxy(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#az()
     */
    @ReflectiveMethod(name = "az", types = {})
    public long az(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#b(net.minecraft.server.v1_8_R3.MojangStatisticsGenerator)
     */
    @ReflectiveMethod(name = "b", types = {NMSMojangStatisticsGenerator.class})
    public void b(NMSMojangStatisticsGenerator mojangStatisticsGenerator){
        NMSWrapper.getInstance().exec(nmsObject, mojangStatisticsGenerator);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#c(int)
     */
    @ReflectiveMethod(name = "c", types = {int.class})
    public void c(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSVec3D d(){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public NMSEntity f(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#g(java.lang.String)
     */
    @ReflectiveMethod(name = "g", types = {String.class})
    public void g(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getAllowFlight()
     */
    @ReflectiveMethod(name = "getAllowFlight", types = {})
    public boolean getAllowFlight(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getAllowNether()
     */
    @ReflectiveMethod(name = "getAllowNether", types = {})
    public boolean getAllowNether(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getChunkCoordinates()
     */
    @ReflectiveMethod(name = "getChunkCoordinates", types = {})
    public NMSBlockPosition getChunkCoordinates(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getCommandHandler()
     */
    @ReflectiveMethod(name = "getCommandHandler", types = {})
    public NMSICommandHandler getCommandHandler(){
        return new NMSICommandHandler(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getConvertable()
     */
    @ReflectiveMethod(name = "getConvertable", types = {})
    public NMSConvertable getConvertable(){
        return new NMSConvertable(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getDifficulty()
     */
    @ReflectiveMethod(name = "getDifficulty", types = {})
    public NMSEnumDifficulty getDifficulty(){
        return new NMSEnumDifficulty(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getEnableCommandBlock()
     */
    @ReflectiveMethod(name = "getEnableCommandBlock", types = {})
    public boolean getEnableCommandBlock(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getForceGamemode()
     */
    @ReflectiveMethod(name = "getForceGamemode", types = {})
    public boolean getForceGamemode(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getGameProfileRepository()
     */
    @ReflectiveMethod(name = "getGameProfileRepository", types = {})
    public GameProfileRepository getGameProfileRepository(){
        return new GameProfileRepository(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getGamemode()
     */
    @ReflectiveMethod(name = "getGamemode", types = {})
    public NMSEnumGamemode getGamemode(){
        return new NMSEnumGamemode(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getGenerateStructures()
     */
    @ReflectiveMethod(name = "getGenerateStructures", types = {})
    public boolean getGenerateStructures(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getIdleTimeout()
     */
    @ReflectiveMethod(name = "getIdleTimeout", types = {})
    public int getIdleTimeout(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getMaxBuildHeight()
     */
    @ReflectiveMethod(name = "getMaxBuildHeight", types = {})
    public int getMaxBuildHeight(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getMotd()
     */
    @ReflectiveMethod(name = "getMotd", types = {})
    public String getMotd(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getOnlineMode()
     */
    @ReflectiveMethod(name = "getOnlineMode", types = {})
    public boolean getOnlineMode(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getPVP()
     */
    @ReflectiveMethod(name = "getPVP", types = {})
    public boolean getPVP(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getPlayerList()
     */
    @ReflectiveMethod(name = "getPlayerList", types = {})
    public NMSPlayerList getPlayerList(){
        return new NMSPlayerList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getPropertyManager()
     */
    @ReflectiveMethod(name = "getPropertyManager", types = {})
    public NMSPropertyManager getPropertyManager(){
        return new NMSPropertyManager(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getResourcePack()
     */
    @ReflectiveMethod(name = "getResourcePack", types = {})
    public String getResourcePack(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getResourcePackHash()
     */
    @ReflectiveMethod(name = "getResourcePackHash", types = {})
    public String getResourcePackHash(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getScoreboardDisplayName()
     */
    @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
    public NMSIChatBaseComponent getScoreboardDisplayName(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getSendCommandFeedback()
     */
    @ReflectiveMethod(name = "getSendCommandFeedback", types = {})
    public boolean getSendCommandFeedback(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getServer()
     */
    @ReflectiveMethod(name = "getServer", types = {})
    public NMSMinecraftServer getServer(){
        return new NMSMinecraftServer(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getServerConnection()
     */
    @ReflectiveMethod(name = "getServerConnection", types = {})
    public NMSServerConnection getServerConnection(){
        return new NMSServerConnection(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getServerIp()
     */
    @ReflectiveMethod(name = "getServerIp", types = {})
    public String getServerIp(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getServerModName()
     */
    @ReflectiveMethod(name = "getServerModName", types = {})
    public String getServerModName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getSnooperEnabled()
     */
    @ReflectiveMethod(name = "getSnooperEnabled", types = {})
    public boolean getSnooperEnabled(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getSpawnAnimals()
     */
    @ReflectiveMethod(name = "getSpawnAnimals", types = {})
    public boolean getSpawnAnimals(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getSpawnMonsters()
     */
    @ReflectiveMethod(name = "getSpawnMonsters", types = {})
    public boolean getSpawnMonsters(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getSpawnNPCs()
     */
    @ReflectiveMethod(name = "getSpawnNPCs", types = {})
    public boolean getSpawnNPCs(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getSpawnProtection()
     */
    @ReflectiveMethod(name = "getSpawnProtection", types = {})
    public int getSpawnProtection(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getUserCache()
     */
    @ReflectiveMethod(name = "getUserCache", types = {})
    public NMSUserCache getUserCache(){
        return new NMSUserCache(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getVersion()
     */
    @ReflectiveMethod(name = "getVersion", types = {})
    public String getVersion(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getWorld()
     */
    @ReflectiveMethod(name = "getWorld", types = {})
    public NMSWorld getWorld(){
        return new NMSWorld(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#getWorldServer(int)
     */
    @ReflectiveMethod(name = "getWorldServer", types = {int.class})
    public NMSWorldServer getWorldServer(int i){
        return new NMSWorldServer(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#h(java.lang.String)
     */
    @ReflectiveMethod(name = "h", types = {String.class})
    public void h(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#i(java.lang.String)
     */
    @ReflectiveMethod(name = "i", types = {String.class})
    public void i(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#info(java.lang.String)
     */
    @ReflectiveMethod(name = "info", types = {String.class})
    public void info(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#isDebugging()
     */
    @ReflectiveMethod(name = "isDebugging", types = {})
    public boolean isDebugging(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#isHardcore()
     */
    @ReflectiveMethod(name = "isHardcore", types = {})
    public boolean isHardcore(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#isMainThread()
     */
    @ReflectiveMethod(name = "isMainThread", types = {})
    public boolean isMainThread(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#isRunning()
     */
    @ReflectiveMethod(name = "isRunning", types = {})
    public boolean isRunning(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#isStopped()
     */
    @ReflectiveMethod(name = "isStopped", types = {})
    public boolean isStopped(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public void k(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#main(org.bukkit.craftbukkit.libs.joptsimple.OptionSet)
     */
    @ReflectiveMethod(name = "main", types = {NMSOptionSet.class})
    public void main(NMSOptionSet optionSet){
        NMSWrapper.getInstance().exec(nmsObject, optionSet);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#p()
     */
    @ReflectiveMethod(name = "p", types = {})
    public int p(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#q()
     */
    @ReflectiveMethod(name = "q", types = {})
    public boolean q(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#r()
     */
    @ReflectiveMethod(name = "r", types = {})
    public boolean r(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#run()
     */
    @ReflectiveMethod(name = "run", types = {})
    public void run(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#s()
     */
    @ReflectiveMethod(name = "s", types = {})
    public void s(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#safeShutdown()
     */
    @ReflectiveMethod(name = "safeShutdown", types = {})
    public void safeShutdown(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#sendMessage(net.minecraft.server.v1_8_R3.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "sendMessage", types = {NMSIChatBaseComponent.class})
    public void sendMessage(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setAllowFlight(boolean)
     */
    @ReflectiveMethod(name = "setAllowFlight", types = {boolean.class})
    public void setAllowFlight(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setForceGamemode(boolean)
     */
    @ReflectiveMethod(name = "setForceGamemode", types = {boolean.class})
    public void setForceGamemode(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setGamemode(net.minecraft.server.v1_8_R3.WorldSettings$EnumGamemode)
     */
    @ReflectiveMethod(name = "setGamemode", types = {NMSEnumGamemode.class})
    public void setGamemode(NMSEnumGamemode enumGamemode){
        NMSWrapper.getInstance().exec(nmsObject, enumGamemode);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setIdleTimeout(int)
     */
    @ReflectiveMethod(name = "setIdleTimeout", types = {int.class})
    public void setIdleTimeout(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setMotd(java.lang.String)
     */
    @ReflectiveMethod(name = "setMotd", types = {String.class})
    public void setMotd(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setOnlineMode(boolean)
     */
    @ReflectiveMethod(name = "setOnlineMode", types = {boolean.class})
    public void setOnlineMode(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setPVP(boolean)
     */
    @ReflectiveMethod(name = "setPVP", types = {boolean.class})
    public void setPVP(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setPort(int)
     */
    @ReflectiveMethod(name = "setPort", types = {int.class})
    public void setPort(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setResourcePack(java.lang.String, java.lang.String)
     */
    @ReflectiveMethod(name = "setResourcePack", types = {String.class, String.class})
    public void setResourcePack(String s, String s1){
        NMSWrapper.getInstance().exec(nmsObject, s, s1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setSpawnAnimals(boolean)
     */
    @ReflectiveMethod(name = "setSpawnAnimals", types = {boolean.class})
    public void setSpawnAnimals(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setSpawnNPCs(boolean)
     */
    @ReflectiveMethod(name = "setSpawnNPCs", types = {boolean.class})
    public void setSpawnNPCs(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#setWorld(java.lang.String)
     */
    @ReflectiveMethod(name = "setWorld", types = {String.class})
    public void setWorld(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#warning(java.lang.String)
     */
    @ReflectiveMethod(name = "warning", types = {String.class})
    public void warning(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#y()
     */
    @ReflectiveMethod(name = "y", types = {})
    public File y(){
        return (File) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.MinecraftServer#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public void z(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}