package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "PacketPlayOutMapChunk")
public class NMSPacketPlayOutMapChunk extends NMSWrap {

    public NMSPacketPlayOutMapChunk(Object nmsObject){
        super(nmsObject);
    }

    public NMSPacketPlayOutMapChunk(NMSChunk chunk, boolean b, int i){
        super("PacketPlayOutMapChunk", new Object[]{NMSChunk.class, boolean.class, int.class}, new Object[]{chunk, b, i});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.PacketPlayOutMapChunk#a(net.minecraft.server.v1_8_R3.PacketListener)
     */
    @ReflectiveMethod(name = "a", types = {NMSPacketListener.class})
    public void a(NMSPacketListener packetListener){
        NMSWrapper.getInstance().exec(nmsObject, packetListener);
    }

    @ReflectiveClass(name = "ChunkMap")
    public class NMSChunkMap extends NMSWrap {

        public NMSChunkMap(Object nmsObject){
            super(nmsObject);
        }

    }

}