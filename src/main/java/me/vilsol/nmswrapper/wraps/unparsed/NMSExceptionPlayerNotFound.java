package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ExceptionPlayerNotFound")
public class NMSExceptionPlayerNotFound extends NMSCommandException {

    public NMSExceptionPlayerNotFound(Object nmsObject){
        super(nmsObject);
    }

    public NMSExceptionPlayerNotFound(String s, Object[] array){
        super("ExceptionPlayerNotFound", new Object[]{String.class, Object[].class}, new Object[]{s, array});
    }

}