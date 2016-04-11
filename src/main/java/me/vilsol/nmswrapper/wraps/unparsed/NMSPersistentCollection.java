package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PersistentCollection")
public class NMSPersistentCollection extends NMSWrap {

    public NMSPersistentCollection(Object nmsObject){
        super(nmsObject);
    }

    public NMSPersistentCollection(NMSIDataManager iDataManager){
        super("PersistentCollection", new Object[]{NMSIDataManager.class}, new Object[]{iDataManager});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PersistentCollection#a(java.lang.String)
     */
    @ReflectiveMethod(name = "a", types = {String.class})
    public int a(String s){
        return (int) NMSWrapper.getInstance().exec(nmsObject, s);
    }

}