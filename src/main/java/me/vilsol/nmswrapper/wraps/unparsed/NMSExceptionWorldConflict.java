package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "ExceptionWorldConflict")
public class NMSExceptionWorldConflict extends NMSWrap {

    public NMSExceptionWorldConflict(Object nmsObject){
        super(nmsObject);
    }

    public NMSExceptionWorldConflict(String s){
        super("ExceptionWorldConflict", new Object[]{String.class}, new Object[]{s});
    }

}