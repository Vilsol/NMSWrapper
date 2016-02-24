package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "DataWatcher")
public class NMSDataWatcher extends NMSWrap {

    public NMSDataWatcher(Object nmsObject){
        super(nmsObject);
    }

    public NMSDataWatcher(NMSEntity entity){
        super("DataWatcher", new Object[]{NMSEntity.class}, new Object[]{entity});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DataWatcher#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DataWatcher#add(int, int)
     */
    @ReflectiveMethod(name = "add", types = {int.class, int.class})
    public void add(int i, int i1){
        NMSWrapper.getInstance().exec(nmsObject, i, i1);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DataWatcher#d()
     */
    @ReflectiveMethod(name = "d", types = {})
    public boolean d(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DataWatcher#e()
     */
    @ReflectiveMethod(name = "e", types = {})
    public void e(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DataWatcher#getByte(int)
     */
    @ReflectiveMethod(name = "getByte", types = {int.class})
    public byte getByte(int i){
        return (byte) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DataWatcher#getFloat(int)
     */
    @ReflectiveMethod(name = "getFloat", types = {int.class})
    public float getFloat(int i){
        return (float) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DataWatcher#getInt(int)
     */
    @ReflectiveMethod(name = "getInt", types = {int.class})
    public int getInt(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DataWatcher#getItemStack(int)
     */
    @ReflectiveMethod(name = "getItemStack", types = {int.class})
    public NMSItemStack getItemStack(int i){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DataWatcher#getShort(int)
     */
    @ReflectiveMethod(name = "getShort", types = {int.class})
    public short getShort(int i){
        return (short) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DataWatcher#getString(int)
     */
    @ReflectiveMethod(name = "getString", types = {int.class})
    public String getString(int i){
        return (String) NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DataWatcher#h(int)
     */
    @ReflectiveMethod(name = "h", types = {int.class})
    public NMSVector3f h(int i){
        return new NMSVector3f(NMSWrapper.getInstance().exec(nmsObject, i));
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DataWatcher#update(int)
     */
    @ReflectiveMethod(name = "update", types = {int.class})
    public void update(int i){
        NMSWrapper.getInstance().exec(nmsObject, i);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.DataWatcher#watch(int, T)
     */
    @ReflectiveMethod(name = "watch", types = {int.class, T.class})
    public void watch(int i, T t){
        NMSWrapper.getInstance().exec(nmsObject, i, t);
    }

    @ReflectiveClass(name = "WatchableObject")
    public class NMSWatchableObject extends NMSWrap {

        public NMSWatchableObject(Object nmsObject){
            super(nmsObject);
        }

        public NMSWatchableObject(int i, int i1, Object object){
            super("WatchableObject", new Object[]{int.class, int.class, Object.class}, new Object[]{i, i1, object});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.DataWatcher$WatchableObject#a(boolean)
         */
        @ReflectiveMethod(name = "a", types = {boolean.class})
        public void a(boolean b){
            NMSWrapper.getInstance().exec(nmsObject, b);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.DataWatcher$WatchableObject#b()
         */
        @ReflectiveMethod(name = "b", types = {})
        public Object b(){
            return new Object(NMSWrapper.getInstance().exec(nmsObject));
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.DataWatcher$WatchableObject#c()
         */
        @ReflectiveMethod(name = "c", types = {})
        public int c(){
            return (int) NMSWrapper.getInstance().exec(nmsObject);
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_8_R3.DataWatcher$WatchableObject#d()
         */
        @ReflectiveMethod(name = "d", types = {})
        public boolean d(){
            return (boolean) NMSWrapper.getInstance().exec(nmsObject);
        }

    }

}