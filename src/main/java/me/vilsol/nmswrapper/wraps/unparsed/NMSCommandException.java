package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "CommandException")
public class NMSCommandException extends NMSWrap {

    public NMSCommandException(Object nmsObject){
        super(nmsObject);
    }

    public NMSCommandException(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSCommandException(String s, Object[] array){
        super("CommandException", new Object[]{String.class, Object[].class}, new Object[]{s, array});
    }

}