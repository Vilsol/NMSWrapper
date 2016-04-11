package me.vilsol.nmswrapper.wraps.unparsed;

import com.google.gson.JsonObject;
import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

import java.util.Date;

@ReflectiveClass(name = "ExpirableListEntry")
public class NMSExpirableListEntry extends NMSWrap {

    public NMSExpirableListEntry(Object nmsObject){
        super(nmsObject);
    }

    public NMSExpirableListEntry(String nmsName, Object[] paramTypes, Object[] params) {
        super(nmsName, paramTypes, params);
    }

    public NMSExpirableListEntry(Object t, Date date, String s, Date date1, String s1){
        super("ExpirableListEntry", new Object[]{Object.class, Date.class, String.class, Date.class, String.class}, new Object[]{t, date, s, date1, s1});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ExpirableListEntry#a(com.google.gson.JsonObject)
     */
    @ReflectiveMethod(name = "a", types = {JsonObject.class})
    public void a(JsonObject jsonObject){
        NMSWrapper.getInstance().exec(nmsObject, jsonObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ExpirableListEntry#getCreated()
     */
    @ReflectiveMethod(name = "getCreated", types = {})
    public Date getCreated(){
        return (Date) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ExpirableListEntry#getExpires()
     */
    @ReflectiveMethod(name = "getExpires", types = {})
    public Date getExpires(){
        return (Date) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ExpirableListEntry#getReason()
     */
    @ReflectiveMethod(name = "getReason", types = {})
    public String getReason(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ExpirableListEntry#getSource()
     */
    @ReflectiveMethod(name = "getSource", types = {})
    public String getSource(){
        return (String) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ExpirableListEntry#hasExpired()
     */
    @ReflectiveMethod(name = "hasExpired", types = {})
    public boolean hasExpired(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

}