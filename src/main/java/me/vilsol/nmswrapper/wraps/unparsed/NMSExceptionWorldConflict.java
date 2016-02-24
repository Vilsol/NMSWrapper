package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ExceptionWorldConflict")
public class NMSExceptionWorldConflict extends Exception {

    public NMSExceptionWorldConflict(Object nmsObject){
        super(nmsObject);
    }

    public NMSExceptionWorldConflict(String s){
        super("ExceptionWorldConflict", new Object[]{String.class}, new Object[]{s});
    }

}