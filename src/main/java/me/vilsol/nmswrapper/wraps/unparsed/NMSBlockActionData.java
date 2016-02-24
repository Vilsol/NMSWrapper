package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "BlockActionData")
public class NMSBlockActionData extends NMSWrap {

    public NMSBlockActionData(Object nmsObject){
        super(nmsObject);
    }

    public NMSBlockActionData(NMSBlockPosition blockPosition, NMSBlock block, int i, int i1){
        super("BlockActionData", new Object[]{NMSBlockPosition.class, NMSBlock.class, int.class, int.class}, new Object[]{blockPosition, block, i, i1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockActionData#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSBlockPosition a(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockActionData#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public int b(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockActionData#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public int c(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.BlockActionData#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSBlock d(){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockActionData#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.BlockActionData#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}