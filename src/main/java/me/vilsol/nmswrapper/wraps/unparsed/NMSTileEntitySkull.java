package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "TileEntitySkull")
public class NMSTileEntitySkull extends NMSTileEntity {

    public NMSTileEntitySkull(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntitySkull#a(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.TileEntitySkull#b(net.minecraft.server.v1_8_R3.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntitySkull#getGameProfile()
     */
    @ReflectiveMethod(name = "getGameProfile", types = {})
    public GameProfile getGameProfile(){
        return new GameProfile(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntitySkull#getRotation()
     */
    @ReflectiveMethod(name = "getRotation", types = {})
    public int getRotation(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntitySkull#getSkullType()
     */
    @ReflectiveMethod(name = "getSkullType", types = {})
    public int getSkullType(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntitySkull#getUpdatePacket()
     */
    @ReflectiveMethod(name = "getUpdatePacket", types = {})
    public NMSPacket getUpdatePacket(){
        return new NMSPacket(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntitySkull#setGameProfile(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "setGameProfile", types = {GameProfile.class})
    public void setGameProfile(GameProfile gameProfile){
        NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntitySkull#setRotation(int)
     */
    @ReflectiveMethod(name = "setRotation", types = {int.class})
    public void setRotation(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.TileEntitySkull#setSkullType(int)
     */
    @ReflectiveMethod(name = "setSkullType", types = {int.class})
    public void setSkullType(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

}