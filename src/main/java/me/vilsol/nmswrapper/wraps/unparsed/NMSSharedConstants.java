package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "SharedConstants")
public class NMSSharedConstants extends NMSWrap {

    public NMSSharedConstants(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.SharedConstants#a(java.lang.String)
     */
    @ReflectiveMethod(name = "a", types = {String.class})
    public String a(String s){
        return (String) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.SharedConstants#isAllowedChatCharacter(char)
     */
    @ReflectiveMethod(name = "isAllowedChatCharacter", types = {char.class})
    public boolean isAllowedChatCharacter(char c){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, c);
    }

}