package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ChatTypeAdapterFactory")
public class NMSChatTypeAdapterFactory extends NMSWrap {

    public NMSChatTypeAdapterFactory(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ChatTypeAdapterFactory#a(net.minecraft.server.v1_9_R1.ChatTypeAdapterFactory, java.lang.Object)
     */
    @ReflectiveMethod(name = "a", types = {NMSChatTypeAdapterFactory.class, Object.class})
    public String a(NMSChatTypeAdapterFactory chatTypeAdapterFactory, Object object){
        return (String) NMSWrapper.getInstance().exec(nmsObject, chatTypeAdapterFactory, object);
    }

}