package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "ChatMessageException")
public class NMSChatMessageException extends NMSWrap {

    public NMSChatMessageException(Object nmsObject){
        super(nmsObject);
    }

    public NMSChatMessageException(NMSChatMessage chatMessage, String s){
        super("ChatMessageException", new Object[]{NMSChatMessage.class, String.class}, new Object[]{chatMessage, s});
    }

    public NMSChatMessageException(NMSChatMessage chatMessage, int i){
        super("ChatMessageException", new Object[]{NMSChatMessage.class, int.class}, new Object[]{chatMessage, i});
    }

    public NMSChatMessageException(NMSChatMessage chatMessage, Throwable throwable){
        super("ChatMessageException", new Object[]{NMSChatMessage.class, Throwable.class}, new Object[]{chatMessage, throwable});
    }

}