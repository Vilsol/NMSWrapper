package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ExceptionInvalidSyntax")
public class NMSExceptionInvalidSyntax extends NMSCommandException {

    public NMSExceptionInvalidSyntax(Object nmsObject){
        super(nmsObject);
    }

    public NMSExceptionInvalidSyntax(String s, Object[] array){
        super("ExceptionInvalidSyntax", new Object[]{String.class, Object[].class}, new Object[]{s, array});
    }

}