package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "CommandException")
public class NMSCommandException extends Exception {

    public NMSCommandException(Object nmsObject){
        super(nmsObject);
    }

    public NMSCommandException(String s, Object[] array){
        super("CommandException", new Object[]{String.class, Object[].class}, new Object[]{s, array});
    }

}