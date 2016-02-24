package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "NextTickListEntry")
public class NMSNextTickListEntry extends NMSWrap {

    public NMSNextTickListEntry(Object nmsObject){
        super(nmsObject);
    }

    public NMSNextTickListEntry(NMSBlockPosition blockPosition, NMSBlock block){
        super("NextTickListEntry", new Object[]{NMSBlockPosition.class, NMSBlock.class}, new Object[]{blockPosition, block});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NextTickListEntry#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public NMSBlock a(){
        return new NMSBlock(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NextTickListEntry#compareTo(java.lang.Object)
     */
    @ReflectiveMethod(name = "compareTo", types = {Object.class})
    public int compareTo(Object object){
        return (int) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NextTickListEntry#equals(java.lang.Object)
     */
    @ReflectiveMethod(name = "equals", types = {Object.class})
    public boolean equals(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NextTickListEntry#hashCode()
     */
    @ReflectiveMethod(name = "hashCode", types = {})
    public int hashCode(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.NextTickListEntry#toString()
     */
    @ReflectiveMethod(name = "toString", types = {})
    public String toString(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

}