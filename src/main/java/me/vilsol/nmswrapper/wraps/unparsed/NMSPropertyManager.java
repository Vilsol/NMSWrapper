package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PropertyManager")
public class NMSPropertyManager extends NMSWrap {

    public NMSPropertyManager(Object nmsObject){
        super(nmsObject);
    }

    public NMSPropertyManager(File file){
        super("PropertyManager", new Object[]{File.class}, new Object[]{file});
    }

    public NMSPropertyManager(NMSOptionSet optionSet){
        super("PropertyManager", new Object[]{NMSOptionSet.class}, new Object[]{optionSet});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PropertyManager#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public void a(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PropertyManager#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public File c(){
        return new File(NMSWrapper.getInstance().exec(nmsObject));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PropertyManager#getBoolean(java.lang.String, boolean)
     */
    @ReflectiveMethod(name = "getBoolean", types = {String.class, boolean.class})
    public boolean getBoolean(String s, boolean b){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s, b);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PropertyManager#getInt(java.lang.String, int)
     */
    @ReflectiveMethod(name = "getInt", types = {String.class, int.class})
    public int getInt(String s, int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, s, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PropertyManager#getLong(java.lang.String, long)
     */
    @ReflectiveMethod(name = "getLong", types = {String.class, long.class})
    public long getLong(String s, long l){
        return (long) NMSWrapper.getInstance().exec(nmsObject, s, l);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PropertyManager#getString(java.lang.String, java.lang.String)
     */
    @ReflectiveMethod(name = "getString", types = {String.class, String.class})
    public String getString(String s, String s1){
        return (String) NMSWrapper.getInstance().exec(nmsObject, s, s1);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PropertyManager#savePropertiesFile()
     */
    @ReflectiveMethod(name = "savePropertiesFile", types = {})
    public void savePropertiesFile(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.PropertyManager#setProperty(java.lang.String, java.lang.Object)
     */
    @ReflectiveMethod(name = "setProperty", types = {String.class, Object.class})
    public void setProperty(String s, Object object){
        NMSWrapper.getInstance().exec(nmsObject, s, object);
    }

}