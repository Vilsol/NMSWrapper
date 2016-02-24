package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "MojangsonParseException")
public class NMSMojangsonParseException extends Exception {

    public NMSMojangsonParseException(Object nmsObject){
        super(nmsObject);
    }

    public NMSMojangsonParseException(String s){
        super("MojangsonParseException", new Object[]{String.class}, new Object[]{s});
    }

}