package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.io.File;

@ReflectiveClass(name = "JsonList")
public class NMSJsonList extends NMSWrap {

    public NMSJsonList(Object nmsObject){
        super(nmsObject);
    }

    public NMSJsonList(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSJsonList(File file){
        super("JsonList", new Object[]{File.class}, new Object[]{file});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.JsonList#a(K)
     */
    @ReflectiveMethod(name = "a", types = {K.class})
    public String a(K k){
        return (String) NMSWrapper.getInstance().exec(nmsObject, k);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.JsonList#add(V)
     */
    @ReflectiveMethod(name = "add", types = {V.class})
    public void add(V v){
        NMSWrapper.getInstance().exec(nmsObject, v);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.JsonList#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public File c(){
        return new File(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.JsonList#d(K)
     */
    @ReflectiveMethod(name = "d", types = {K.class})
    public boolean d(K k){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, k);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.JsonList#get(K)
     */
    @ReflectiveMethod(name = "get", types = {K.class})
    public V get(K k){
        return new V(NMSWrapper.getInstance().exec(nmsObject, k));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.JsonList#isEmpty()
     */
    @ReflectiveMethod(name = "isEmpty", types = {})
    public boolean isEmpty(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.JsonList#isEnabled()
     */
    @ReflectiveMethod(name = "isEnabled", types = {})
    public boolean isEnabled(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.JsonList#remove(K)
     */
    @ReflectiveMethod(name = "remove", types = {K.class})
    public void remove(K k){
        NMSWrapper.getInstance().exec(nmsObject, k);
    }

}