package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntityPiston")
public class NMSTileEntityPiston extends NMSTileEntity implements NMSIUpdatePlayerListBox {

    public NMSTileEntityPiston(Object nmsObject){
        super(nmsObject);
    }

    public NMSTileEntityPiston(NMSIBlockData iBlockData, NMSEnumDirection enumDirection, boolean b, boolean b1){
        super("TileEntityPiston", new Object[]{NMSIBlockData.class, NMSEnumDirection.class, boolean.class, boolean.class}, new Object[]{iBlockData, enumDirection, b, b1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityPiston#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityPiston#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityPiston#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityPiston#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityPiston#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public NMSEnumDirection e(){
        return new NMSEnumDirection(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityPiston#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public void h(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntityPiston#u()
     */
    @ReflectiveMethod(name = "u", types = {})
    public int u(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}