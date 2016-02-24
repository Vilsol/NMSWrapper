package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RemoteControlCommandListener")
public class NMSRemoteControlCommandListener extends NMSWrap implements NMSICommandListener {

    public NMSRemoteControlCommandListener(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#a(net.minecraft.server.v1_8_R3.CommandObjectiveExecutor$EnumCommandResult, int)
     */
    @ReflectiveMethod(name = "a", types = {NMSEnumCommandResult.class, int.class})
    public void a(NMSEnumCommandResult enumCommandResult, int i){
        NMSWrapper.getInstance().exec(nmsObject, enumCommandResult, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSVec3D d(){
        return new NMSVec3D(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public NMSEntity f(){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#getChunkCoordinates()
     */
    @ReflectiveMethod(name = "getChunkCoordinates", types = {})
    public NMSBlockPosition getChunkCoordinates(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#getInstance()
     */
    @ReflectiveMethod(name = "getInstance", types = {})
    public NMSRemoteControlCommandListener getInstance(){
        return new NMSRemoteControlCommandListener(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#getScoreboardDisplayName()
     */
    @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
    public NMSIChatBaseComponent getScoreboardDisplayName(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#getSendCommandFeedback()
     */
    @ReflectiveMethod(name = "getSendCommandFeedback", types = {})
    public boolean getSendCommandFeedback(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#getWorld()
     */
    @ReflectiveMethod(name = "getWorld", types = {})
    public NMSWorld getWorld(){
        return new NMSWorld(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public void i(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public String j(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RemoteControlCommandListener#sendMessage(net.minecraft.server.v1_8_R3.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "sendMessage", types = {NMSIChatBaseComponent.class})
    public void sendMessage(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

}