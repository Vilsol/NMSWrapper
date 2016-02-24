package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "FileIOThread")
public class NMSFileIOThread extends NMSWrap implements Runnable {

    public NMSFileIOThread(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.FileIOThread#a(net.minecraft.server.v1_8_R3.IAsyncChunkSaver)
     */
    @ReflectiveMethod(name = "a", types = {NMSIAsyncChunkSaver.class})
    public void a(NMSIAsyncChunkSaver iAsyncChunkSaver){
        NMSWrapper.getInstance().exec(nmsObject, iAsyncChunkSaver);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.FileIOThread#run()
     */
    @ReflectiveMethod(name = "run", types = {})
    public void run(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}