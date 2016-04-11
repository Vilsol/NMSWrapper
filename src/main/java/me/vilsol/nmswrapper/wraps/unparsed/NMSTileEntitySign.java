package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntitySign")
public class NMSTileEntitySign extends NMSTileEntity {

    public NMSTileEntitySign(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntitySign#F()
     */
    @ReflectiveMethod(name = "F", types = {})
    public boolean F(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntitySign#a(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntityHuman.class})
    public void a(NMSEntityHuman entityHuman){
        NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntitySign#b(net.minecraft.server.v1_9_R1.EntityHuman)
     */
    @ReflectiveMethod(name = "b", types = {NMSEntityHuman.class})
    public boolean b(NMSEntityHuman entityHuman){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entityHuman);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntitySign#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public NMSEntityHuman c(){
        return new NMSEntityHuman(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntitySign#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSCommandObjectiveExecutor d(){
        return new NMSCommandObjectiveExecutor(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntitySign#getUpdatePacket()
     */
    @ReflectiveMethod(name = "getUpdatePacket", types = {})
    public NMSPacket getUpdatePacket(){
        return new NMSPacket(NMSWrapper.getInstance().exec(nmsObject));
    }

}