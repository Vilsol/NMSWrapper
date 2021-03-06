package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;
import org.bukkit.command.CommandSender;

@ReflectiveClass(name = "CommandBlockListenerAbstract")
public class NMSCommandBlockListenerAbstract extends NMSWrap implements NMSICommandListener {

    public NMSCommandBlockListenerAbstract(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#a(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public boolean a(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#b(net.minecraft.server.v1_9_R1.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "b", types = {NMSIChatBaseComponent.class})
    public void b(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#executeCommand(net.minecraft.server.v1_9_R1.ICommandListener, org.bukkit.command.CommandSender, java.lang.String)
     */
    @ReflectiveMethod(name = "executeCommand", types = {NMSICommandListener.class, CommandSender.class, String.class})
    public int executeCommand(NMSICommandListener iCommandListener, CommandSender commandSender, String s){
        return (int) NMSWrapper.getInstance().exec(nmsObject, iCommandListener, commandSender, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#getCommand()
     */
    @ReflectiveMethod(name = "getCommand", types = {})
    public String getCommand(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#getName()
     */
    @ReflectiveMethod(name = "getName", types = {})
    public String getName(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#getScoreboardDisplayName()
     */
    @ReflectiveMethod(name = "getScoreboardDisplayName", types = {})
    public NMSIChatBaseComponent getScoreboardDisplayName(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#getSendCommandFeedback()
     */
    @ReflectiveMethod(name = "getSendCommandFeedback", types = {})
    public boolean getSendCommandFeedback(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#j()
     */
    @ReflectiveMethod(name = "j", types = {})
    public int j(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public NMSIChatBaseComponent k(){
        return (NMSIChatBaseComponent) NMSWrapper.getInstance().createApplicableObject(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#m()
     */
    @ReflectiveMethod(name = "m", types = {})
    public boolean m(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#n()
     */
    @ReflectiveMethod(name = "n", types = {})
    public NMSCommandObjectiveExecutor n(){
        return new NMSCommandObjectiveExecutor(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#sendMessage(net.minecraft.server.v1_9_R1.IChatBaseComponent)
     */
    @ReflectiveMethod(name = "sendMessage", types = {NMSIChatBaseComponent.class})
    public void sendMessage(NMSIChatBaseComponent iChatBaseComponent){
        NMSWrapper.getInstance().exec(nmsObject, iChatBaseComponent);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#setCommand(java.lang.String)
     */
    @ReflectiveMethod(name = "setCommand", types = {String.class})
    public void setCommand(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.CommandBlockListenerAbstract#setName(java.lang.String)
     */
    @ReflectiveMethod(name = "setName", types = {String.class})
    public void setName(String s){
        NMSWrapper.getInstance().exec(nmsObject, s);
    }

}