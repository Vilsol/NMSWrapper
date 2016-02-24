package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;

@ReflectiveClass(name = "BlockPosition")
public class NMSBlockPosition extends NMSBaseBlockPosition {

    public NMSBlockPosition(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockPosition(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSBlockPosition(int i, int i1, int i2){
        super("BlockPosition", new Object[]{int.class, int.class, int.class}, new Object[]{i, i1, i2});
    }

    public NMSBlockPosition(double d, double d1, double d2){
        super("BlockPosition", new Object[]{double.class, double.class, double.class}, new Object[]{d, d1, d2});
    }

    public NMSBlockPosition(NMSEntity entity){
        super("BlockPosition", new Object[]{NMSEntity.class}, new Object[]{entity});
    }

    public NMSBlockPosition(NMSVec3D vec3D){
        super("BlockPosition", new Object[]{NMSVec3D.class}, new Object[]{vec3D});
    }

    public NMSBlockPosition(NMSBaseBlockPosition baseBlockPosition){
        super("BlockPosition", new Object[]{NMSBaseBlockPosition.class}, new Object[]{baseBlockPosition});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPosition#a(net.minecraft.server.v1_8_R3.BaseBlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSBaseBlockPosition.class})
    public NMSBlockPosition a(NMSBaseBlockPosition baseBlockPosition){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, baseBlockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPosition#asLong()
     */
    @ReflectiveMethod(name = "asLong", types = {})
    public long asLong(){
        return (long) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPosition#b(net.minecraft.server.v1_8_R3.BaseBlockPosition)
     */
    @ReflectiveMethod(name = "b", types = {NMSBaseBlockPosition.class})
    public NMSBlockPosition b(NMSBaseBlockPosition baseBlockPosition){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, baseBlockPosition));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPosition#c(net.minecraft.server.v1_8_R3.BaseBlockPosition)
     */
    @ReflectiveMethod(name = "c", types = {NMSBaseBlockPosition.class})
    public NMSBlockPosition c(NMSBaseBlockPosition baseBlockPosition){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, baseBlockPosition));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPosition#d(net.minecraft.server.v1_8_R3.BaseBlockPosition)
     */
    @ReflectiveMethod(name = "d", types = {NMSBaseBlockPosition.class})
    public NMSBaseBlockPosition d(NMSBaseBlockPosition baseBlockPosition){
        return new NMSBaseBlockPosition(NMSWrapper.getInstance().exec(nmsObject, baseBlockPosition));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPosition#down(int)
     */
    @ReflectiveMethod(name = "down", types = {int.class})
    public NMSBlockPosition down(int i){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPosition#east(int)
     */
    @ReflectiveMethod(name = "east", types = {int.class})
    public NMSBlockPosition east(int i){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPosition#fromLong(long)
     */
    @ReflectiveMethod(name = "fromLong", types = {long.class})
    public NMSBlockPosition fromLong(long l){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, l));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPosition#north(int)
     */
    @ReflectiveMethod(name = "north", types = {int.class})
    public NMSBlockPosition north(int i){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPosition#shift(net.minecraft.server.v1_8_R3.EnumDirection, int)
     */
    @ReflectiveMethod(name = "shift", types = {NMSEnumDirection.class, int.class})
    public NMSBlockPosition shift(NMSEnumDirection enumDirection, int i){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, enumDirection, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPosition#south(int)
     */
    @ReflectiveMethod(name = "south", types = {int.class})
    public NMSBlockPosition south(int i){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockPosition#up(int)
     */
    @ReflectiveMethod(name = "up", types = {int.class})
    public NMSBlockPosition up(int i){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockPosition#west(int)
     */
    @ReflectiveMethod(name = "west", types = {int.class})
    public NMSBlockPosition west(int i){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject, i));
    }

}