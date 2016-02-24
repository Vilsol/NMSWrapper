package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "StructureBoundingBox")
public class NMSStructureBoundingBox extends NMSWrap {

    public NMSStructureBoundingBox(Object nmsObject){
        super(nmsObject);
    }

    public NMSStructureBoundingBox(NMSStructureBoundingBox structureBoundingBox){
        super("StructureBoundingBox", new Object[]{NMSStructureBoundingBox.class}, new Object[]{structureBoundingBox});
    }

    public NMSStructureBoundingBox(int i, int i1, int i2, int i3, int i4, int i5){
        super("StructureBoundingBox", new Object[]{int.class, int.class, int.class, int.class, int.class, int.class}, new Object[]{i, i1, i2, i3, i4, i5});
    }

    public NMSStructureBoundingBox(NMSBaseBlockPosition baseBlockPosition, NMSBaseBlockPosition baseBlockPosition1){
        super("StructureBoundingBox", new Object[]{NMSBaseBlockPosition.class, NMSBaseBlockPosition.class}, new Object[]{baseBlockPosition, baseBlockPosition1});
    }

    public NMSStructureBoundingBox(int i, int i1, int i2, int i3){
        super("StructureBoundingBox", new Object[]{int.class, int.class, int.class, int.class}, new Object[]{i, i1, i2, i3});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureBoundingBox#a(int, int, int)
     */
    @ReflectiveMethod(name = "a", types = {int.class, int.class, int.class})
    public void a(int i, int i1, int i2){
        NMSWrapper.getInstance().exec(nmsObject, i, i1, i2);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureBoundingBox#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public NMSBaseBlockPosition b(){
        return new NMSBaseBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureBoundingBox#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public int c(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureBoundingBox#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public int d(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureBoundingBox#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public int e(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureBoundingBox#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public NMSBaseBlockPosition f(){
        return new NMSBaseBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.StructureBoundingBox#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public NMSNBTTagIntArray g(){
        return new NMSNBTTagIntArray(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.StructureBoundingBox#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}