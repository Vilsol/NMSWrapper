package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ExceptionUsage")
public class NMSExceptionUsage extends NMSExceptionInvalidSyntax {

    public NMSExceptionUsage(Object nmsObject){
        super(nmsObject);
    }

    public NMSExceptionUsage(String s, Object[] array){
        super("ExceptionUsage", new Object[]{String.class, Object[].class}, new Object[]{s, array});
    }

}