package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.net.ServerSocket;

@ReflectiveClass(name = "RemoteConnectionThread")
public class NMSRemoteConnectionThread extends NMSWrap implements Runnable {

    public NMSRemoteConnectionThread(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RemoteConnectionThread#a(boolean)
     */
    @ReflectiveMethod(name = "a", types = {boolean.class})
    public void a(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RemoteConnectionThread#b(java.net.ServerSocket)
     */
    @ReflectiveMethod(name = "b", types = {ServerSocket.class})
    public boolean b(ServerSocket serverSocket){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, serverSocket);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RemoteConnectionThread#c(java.lang.String)
     */
    @ReflectiveMethod(name = "c", types = {String.class})
    public void c(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RemoteConnectionThread#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public int d(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RemoteConnectionThread#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public void e(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}