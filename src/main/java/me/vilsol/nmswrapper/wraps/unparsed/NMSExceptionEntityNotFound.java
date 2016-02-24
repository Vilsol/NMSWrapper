package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ExceptionEntityNotFound")
public class NMSExceptionEntityNotFound extends NMSCommandException {

    public NMSExceptionEntityNotFound(Object nmsObject){
        super(nmsObject);
    }

    public NMSExceptionEntityNotFound(String s, Object[] array){
        super("ExceptionEntityNotFound", new Object[]{String.class, Object[].class}, new Object[]{s, array});
    }

}