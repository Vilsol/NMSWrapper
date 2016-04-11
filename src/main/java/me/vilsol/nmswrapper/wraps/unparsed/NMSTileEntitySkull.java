package me.vilsol.nmswrapper.wraps.unparsed;

import com.mojang.authlib.GameProfile;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSNBTTagCompound;

@ReflectiveClass(name = "TileEntitySkull")
public class NMSTileEntitySkull extends NMSTileEntity {

    public NMSTileEntitySkull(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntitySkull#a(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "a", types = {NMSNBTTagCompound.class})
    public void a(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.TileEntitySkull#b(net.minecraft.server.v1_9_R1.NBTTagCompound)
     */
    @ReflectiveMethod(name = "b", types = {NMSNBTTagCompound.class})
    public void b(NMSNBTTagCompound nBTTagCompound){
        NMSWrapper.getInstance().exec(nmsObject, nBTTagCompound);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntitySkull#getGameProfile()
     */
    @ReflectiveMethod(name = "getGameProfile", types = {})
    public GameProfile getGameProfile(){
        return (GameProfile) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntitySkull#getRotation()
     */
    @ReflectiveMethod(name = "getRotation", types = {})
    public int getRotation(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntitySkull#getSkullType()
     */
    @ReflectiveMethod(name = "getSkullType", types = {})
    public int getSkullType(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntitySkull#getUpdatePacket()
     */
    @ReflectiveMethod(name = "getUpdatePacket", types = {})
    public NMSPacket getUpdatePacket(){
        return new NMSPacket(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntitySkull#setGameProfile(com.mojang.authlib.GameProfile)
     */
    @ReflectiveMethod(name = "setGameProfile", types = {GameProfile.class})
    public void setGameProfile(GameProfile gameProfile){
        NMSWrapper.getInstance().exec(nmsObject, gameProfile);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntitySkull#setRotation(int)
     */
    @ReflectiveMethod(name = "setRotation", types = {int.class})
    public void setRotation(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.TileEntitySkull#setSkullType(int)
     */
    @ReflectiveMethod(name = "setSkullType", types = {int.class})
    public void setSkullType(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

}