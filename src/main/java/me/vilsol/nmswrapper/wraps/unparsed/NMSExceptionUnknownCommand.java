package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ExceptionUnknownCommand")
public class NMSExceptionUnknownCommand extends NMSCommandException {

    public NMSExceptionUnknownCommand(Object nmsObject){
        super(nmsObject);
    }

    public NMSExceptionUnknownCommand(String s, Object[] array){
        super("ExceptionUnknownCommand", new Object[]{String.class, Object[].class}, new Object[]{s, array});
    }

}