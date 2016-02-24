package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ExceptionInvalidNumber")
public class NMSExceptionInvalidNumber extends NMSCommandException {

    public NMSExceptionInvalidNumber(Object nmsObject){
        super(nmsObject);
    }

    public NMSExceptionInvalidNumber(String s, Object[] array){
        super("ExceptionInvalidNumber", new Object[]{String.class, Object[].class}, new Object[]{s, array});
    }

}