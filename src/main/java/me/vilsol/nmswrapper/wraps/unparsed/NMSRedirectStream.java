package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "RedirectStream")
public class NMSRedirectStream extends PrintStream {

    public NMSRedirectStream(Object nmsObject){
        super(nmsObject);
    }

    public NMSRedirectStream(String s, OutputStream outputStream){
        super("RedirectStream", new Object[]{String.class, OutputStream.class}, new Object[]{s, outputStream});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.RedirectStream#println(java.lang.Object)
     */
    @ReflectiveMethod(name = "println", types = {Object.class})
    public void println(Object object){
        NMSWrapper.getInstance().exec(nmsObject, object);
    }

}