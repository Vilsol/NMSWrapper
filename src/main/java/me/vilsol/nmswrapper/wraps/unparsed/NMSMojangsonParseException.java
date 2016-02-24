package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "MojangsonParseException")
public class NMSMojangsonParseException extends NMSWrap {

    public NMSMojangsonParseException(Object nmsObject){
        super(nmsObject);
    }

    public NMSMojangsonParseException(String s){
        super("MojangsonParseException", new Object[]{String.class}, new Object[]{s});
    }

}