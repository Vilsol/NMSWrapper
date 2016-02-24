package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "InsensitiveStringMap")
public class NMSInsensitiveStringMap extends NMSWrap {

    public NMSInsensitiveStringMap(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.InsensitiveStringMap#a(java.lang.String, V)
     */
    @ReflectiveMethod(name = "a", types = {String.class, V.class})
    public V a(String s, V v){
        return new V(NMSWrapper.getInstance().exec(nmsObject, s, v));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InsensitiveStringMap#clear()
     */
    @ReflectiveMethod(name = "clear", types = {})
    public void clear(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InsensitiveStringMap#containsKey(java.lang.Object)
     */
    @ReflectiveMethod(name = "containsKey", types = {Object.class})
    public boolean containsKey(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InsensitiveStringMap#containsValue(java.lang.Object)
     */
    @ReflectiveMethod(name = "containsValue", types = {Object.class})
    public boolean containsValue(Object object){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, object);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InsensitiveStringMap#get(java.lang.Object)
     */
    @ReflectiveMethod(name = "get", types = {Object.class})
    public V get(Object object){
        return new V(NMSWrapper.getInstance().exec(nmsObject, object));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InsensitiveStringMap#isEmpty()
     */
    @ReflectiveMethod(name = "isEmpty", types = {})
    public boolean isEmpty(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InsensitiveStringMap#put(java.lang.Object, java.lang.Object)
     */
    @ReflectiveMethod(name = "put", types = {Object.class, Object.class})
    public Object put(Object object, Object object1){
        return new Object(NMSWrapper.getInstance().exec(nmsObject, object, object1));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InsensitiveStringMap#remove(java.lang.Object)
     */
    @ReflectiveMethod(name = "remove", types = {Object.class})
    public V remove(Object object){
        return new V(NMSWrapper.getInstance().exec(nmsObject, object));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.InsensitiveStringMap#size()
     */
    @ReflectiveMethod(name = "size", types = {})
    public int size(){
        return (int) NMSWrapper.getInstance().exec(nmsObject);
    }

}