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
     * @see net.minecraft.server.v1_9_R1.JsonList#a(Object)
     */
    @ReflectiveMethod(name = "a", types = {Object.class})
    public String a(Object k){
        return (String) NMSWrapper.getInstance().exec(nmsObject, k);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.JsonList#add(Object)
     */
    @ReflectiveMethod(name = "add", types = {Object.class})
    public void add(Object v){
        NMSWrapper.getInstance().exec(nmsObject, v);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.JsonList#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public File c(){
        return (File) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.JsonList#d(Object)
     */
    @ReflectiveMethod(name = "d", types = {Object.class})
    public boolean d(Object k){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, k);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.JsonList#get(Object)
     */
    @ReflectiveMethod(name = "get", types = {Object.class})
    public Object get(Object k){
        return NMSWrapper.getInstance().exec(nmsObject, k);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.JsonList#isEmpty()
     */
    @ReflectiveMethod(name = "isEmpty", types = {})
    public boolean isEmpty(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.JsonList#isEnabled()
     */
    @ReflectiveMethod(name = "isEnabled", types = {})
    public boolean isEnabled(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.JsonList#remove(Object)
     */
    @ReflectiveMethod(name = "remove", types = {Object.class})
    public void remove(Object k){
        NMSWrapper.getInstance().exec(nmsObject, k);
    }

}