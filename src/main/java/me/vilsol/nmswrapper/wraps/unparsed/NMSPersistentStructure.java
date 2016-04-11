package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PersistentStructure")
public class NMSPersistentStructure extends NMSPersistentBase {

    public NMSPersistentStructure(Object nmsObject){
        super(nmsObject);
    }

    public NMSPersistentStructure(String s){
        super("PersistentStructure", new Object[]{String.class}, new Object[]{s});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PersistentStructure#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSNBTTagCompound a(){
        return new NMSNBTTagCompound(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PersistentStructure#b(int, int)
     */
    @ReflectiveMethod(name = "b", types = {int.class, int.class})
    public String b(int i, int i1){
        return (String) NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

}