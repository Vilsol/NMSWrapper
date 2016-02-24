package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "ExceptionUsage")
public class NMSExceptionUsage extends NMSWrap {

    public NMSExceptionUsage(Object nmsObject){
        super(nmsObject);
    }

    public NMSExceptionUsage(String s, Object[] array){
        super("ExceptionUsage", new Object[]{String.class, Object[].class}, new Object[]{s, array});
    }

}