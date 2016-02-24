package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "VillageDoor")
public class NMSVillageDoor extends NMSWrap {

    public NMSVillageDoor(Object nmsObject){
        super(nmsObject);
    }

    public NMSVillageDoor(NMSBlockPosition blockPosition, int i, int i1, int i2){
        super("VillageDoor", new Object[]{NMSBlockPosition.class, int.class, int.class, int.class}, new Object[]{blockPosition, i, i1, i2});
    }

    public NMSVillageDoor(NMSBlockPosition blockPosition, NMSEnumDirection enumDirection, int i){
        super("VillageDoor", new Object[]{NMSBlockPosition.class, NMSEnumDirection.class, int.class}, new Object[]{blockPosition, enumDirection, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.VillageDoor#a(boolean)
     */
    @ReflectiveMethod(name = "a", types = {boolean.class})
    public void a(boolean b){
        NMSWrapper.getInstance().exec(nmsObject, b);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.VillageDoor#b()
     */
    @ReflectiveMethod(name = "b", types = {})
    public void b(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.VillageDoor#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public int c(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.VillageDoor#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public NMSBlockPosition d(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.VillageDoor#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public NMSBlockPosition e(){
        return new NMSBlockPosition(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.VillageDoor#f()
     */
    @ReflectiveMethod(name = "f", types = {})
    public int f(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.VillageDoor#g()
     */
    @ReflectiveMethod(name = "g", types = {})
    public int g(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.VillageDoor#h()
     */
    @ReflectiveMethod(name = "h", types = {})
    public int h(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.VillageDoor#i()
     */
    @ReflectiveMethod(name = "i", types = {})
    public boolean i(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}