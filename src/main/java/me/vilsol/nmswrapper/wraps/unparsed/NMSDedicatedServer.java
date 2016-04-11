package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "DedicatedServer")
public class NMSDedicatedServer extends NMSMinecraftServer implements NMSIMinecraftServer {

    public NMSDedicatedServer(Object nmsObject){
        super(nmsObject);
    }

    public NMSDedicatedServer(NMSOptionSet optionSet){
        super("DedicatedServer", new Object[]{NMSOptionSet.class}, new Object[]{optionSet});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#B()
     */
    @ReflectiveMethod(name = "B", types = {})
    public void B(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#a(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition, net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class, NMSEntityHuman.class})
    public boolean a(NMSWorld world, NMSBlockPosition blockPosition, NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#aB()
     */
    @ReflectiveMethod(name = "aB", types = {})
    public boolean aB(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#aI()
     */
    @ReflectiveMethod(name = "aI", types = {})
    public int aI(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#aK()
     */
    @ReflectiveMethod(name = "aK", types = {})
    public int aK(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#aO()
     */
    @ReflectiveMethod(name = "aO", types = {})
    public void aO(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#aP()
     */
    @ReflectiveMethod(name = "aP", types = {})
    public NMSDedicatedPlayerList aP(){
        return new NMSDedicatedPlayerList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#aQ()
     */
    @ReflectiveMethod(name = "aQ", types = {})
    public void aQ(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#aR()
     */
    @ReflectiveMethod(name = "aR", types = {})
    public boolean aR(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#aS()
     */
    @ReflectiveMethod(name = "aS", types = {})
    public long aS(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#ae()
     */
    @ReflectiveMethod(name = "ae", types = {})
    public boolean ae(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#ai()
     */
    @ReflectiveMethod(name = "ai", types = {})
    public boolean ai(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#as()
     */
    @ReflectiveMethod(name = "as", types = {})
    public boolean as(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public String b(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#executeRemoteCommand(java.lang.String)
     */
    @ReflectiveMethod(name = "executeRemoteCommand", types = {String.class})
    public String executeRemoteCommand(String s){
        return (String) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#getAllowNether()
     */
    @ReflectiveMethod(name = "getAllowNether", types = {})
    public boolean getAllowNether(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#getDifficulty()
     */
    @ReflectiveMethod(name = "getDifficulty", types = {})
    public NMSEnumDifficulty getDifficulty(){
        return new NMSEnumDifficulty(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#getEnableCommandBlock()
     */
    @ReflectiveMethod(name = "getEnableCommandBlock", types = {})
    public boolean getEnableCommandBlock(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#getGamemode()
     */
    @ReflectiveMethod(name = "getGamemode", types = {})
    public NMSEnumGamemode getGamemode(){
        return new NMSEnumGamemode(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#getGenerateStructures()
     */
    @ReflectiveMethod(name = "getGenerateStructures", types = {})
    public boolean getGenerateStructures(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#getPlayerList()
     */
    @ReflectiveMethod(name = "getPlayerList", types = {})
    public NMSPlayerList getPlayerList(){
        return new NMSPlayerList(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#getPlugins()
     */
    @ReflectiveMethod(name = "getPlugins", types = {})
    public String getPlugins(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#getPropertyManager()
     */
    @ReflectiveMethod(name = "getPropertyManager", types = {})
    public NMSPropertyManager getPropertyManager(){
        return new NMSPropertyManager(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#getSnooperEnabled()
     */
    @ReflectiveMethod(name = "getSnooperEnabled", types = {})
    public boolean getSnooperEnabled(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#getSpawnMonsters()
     */
    @ReflectiveMethod(name = "getSpawnMonsters", types = {})
    public boolean getSpawnMonsters(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#getSpawnProtection()
     */
    @ReflectiveMethod(name = "getSpawnProtection", types = {})
    public int getSpawnProtection(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#isHardcore()
     */
    @ReflectiveMethod(name = "isHardcore", types = {})
    public boolean isHardcore(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#issueCommand(java.lang.String, net.minecraft.server.v1_9_R1.ICommandListener)
     */
    @ReflectiveMethod(name = "issueCommand", types = {String.class, NMSICommandListener.class})
    public void issueCommand(String s, NMSICommandListener iCommandListener){
        NMSWrapper.getInstance().exec(nmsObject, s, iCommandListener);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#p()
     */
    @ReflectiveMethod(name = "p", types = {})
    public int p(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#q()
     */
    @ReflectiveMethod(name = "q", types = {})
    public boolean q(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#r()
     */
    @ReflectiveMethod(name = "r", types = {})
    public boolean r(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#setGamemode(net.minecraft.server.v1_9_R1.WorldSettings$EnumGamemode)
     */
    @ReflectiveMethod(name = "setGamemode", types = {NMSEnumGamemode.class})
    public void setGamemode(NMSEnumGamemode enumGamemode){
        NMSWrapper.getInstance().exec(nmsObject, enumGamemode);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#setIdleTimeout(int)
     */
    @ReflectiveMethod(name = "setIdleTimeout", types = {int.class})
    public void setIdleTimeout(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.DedicatedServer#z()
     */
    @ReflectiveMethod(name = "z", types = {})
    public void z(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}