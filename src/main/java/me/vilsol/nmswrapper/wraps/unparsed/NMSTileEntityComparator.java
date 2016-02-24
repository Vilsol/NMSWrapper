package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntityComparator")
public class NMSTileEntityComparator extends NMSTileEntity {

    public NMSTileEntityComparator(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityComparator#a(int)
     */
    @ReflectiveMethod(name = "a", types = {int.class})
    public void a(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntityComparator#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public int b(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}