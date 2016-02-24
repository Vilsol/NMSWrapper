package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NBTReadLimiter")
public class NMSNBTReadLimiter extends NMSWrap {

    public NMSNBTReadLimiter(Object nmsObject){
        super(nmsObject);
    }

    public NMSNBTReadLimiter(long l){
        super("NBTReadLimiter", new Object[]{long.class}, new Object[]{l});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NBTReadLimiter#a(long)
     */
    @ReflectiveMethod(name = "a", types = {long.class})
    public void a(long l){
        NMSWrapper.getInstance().exec(nmsObject, l);
    }

}