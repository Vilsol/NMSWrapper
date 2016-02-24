package me.vilsol.nmswrapper.wraps.unparsed;

import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "LoginListener")
public class NMSLoginListener extends NMSWrap implements NMSIUpdatePlayerListBox {

    public NMSLoginListener(Object nmsObject){
        super(nmsObject);
    }

    public NMSLoginListener(NMSMinecraftServer minecraftServer, NMSNetworkManager networkManager){
        super("LoginListener", new Object[]{NMSMinecraftServer.class, NMSNetworkManager.class}, new Object[]{minecraftServer, networkManager});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.LoginListener#a(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "a", types = {GameProfile.class})
    public GameProfile a(GameProfile gameProfile){
        return (GameProfile) NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.LoginListener#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.LoginListener#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.LoginListener#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public String d(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.LoginListener#disconnect(java.lang.String)
     */
    @ReflectiveMethod(name = "disconnect", types = {String.class})
    public void disconnect(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.LoginListener#initUUID()
     */
    @ReflectiveMethod(name = "initUUID", types = {})
    public void initUUID(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "LoginHandler")
    public class NMSLoginHandler extends NMSWrap {

        public NMSLoginHandler(Object nmsObject){
            super(nmsObject);
        }

        public NMSLoginHandler(NMSLoginListener loginListener){
            super("LoginHandler", new Object[]{NMSLoginListener.class}, new Object[]{loginListener});
        }

    }

}