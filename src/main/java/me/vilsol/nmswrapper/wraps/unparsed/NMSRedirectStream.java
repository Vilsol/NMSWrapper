package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.io.OutputStream;

@ReflectiveClass(name = "RedirectStream")
public class NMSRedirectStream extends NMSWrap {

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