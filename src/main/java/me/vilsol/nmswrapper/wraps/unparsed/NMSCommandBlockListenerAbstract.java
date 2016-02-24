package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandBlockListenerAbstract")
public class NMSCommandBlockListenerAbstract extends NMSWrap implements NMSICommandListener {

    public NMSCommandBlockListenerAbstract(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#a(net.minecraft.server.v1_8_R3.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#b(net.minecraft.server.v1_8_R3.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "b", types = {NMSIChatBaseComponent.class})
    public void b(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#executeCommand(net.minecraft.server.v1_8_R3.ICommandListener, org.bukkit.command.CommandSender, java.lang.String)
     */
    @ReflectiveMethod(name = "executeCommand", types = {NMSICommandListener.class, CommandSender.class, String.class})
    public int executeCommand(NMSICommandListener iCommandListener, CommandSender commandSender, String s){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iCommandListener, commandSender, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#getCommand()
     */
    @ReflectiveMethod(name = "getCommand", types = {})
    public String getCommand(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#getScoreboardDisplayName()
     */
    @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
    public NMSIChatBaseComponent getScoreboardDisplayName(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#getSendCommandFeedback()
     */
    @ReflectiveMethod(name = "getSendCommandFeedback", types = {})
    public boolean getSendCommandFeedback(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public int j(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public NMSIChatBaseComponent k(){
        return new NMSIChatBaseComponent(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public boolean m(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public NMSCommandObjectiveExecutor n(){
        return new NMSCommandObjectiveExecutor(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#sendMessage(net.minecraft.server.v1_8_R3.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "sendMessage", types = {NMSIChatBaseComponent.class})
    public void sendMessage(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#setCommand(java.lang.String)
     */
    @ReflectiveMethod(name = "setCommand", types = {String.class})
    public void setCommand(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.CommandBlockListenerAbstract#setName(java.lang.String)
     */
    @ReflectiveMethod(name = "setName", types = {String.class})
    public void setName(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

}