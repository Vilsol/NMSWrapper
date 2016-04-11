package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemBucket")
public class NMSItemBucket extends NMSItem {

    public NMSItemBucket(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemBucket(NMSBlock block){
        super("ItemBucket", new Object[]{NMSBlock.class}, new Object[]{block});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.ItemBucket#a(net.minecraft.server.v1_9_R1.World, net.minecraft.server.v1_9_R1.BlockPosition)
     */
    @ReflectiveMethod(name = "a", types = {NMSWorld.class, NMSBlockPosition.class})
    public boolean a(NMSWorld world, NMSBlockPosition blockPosition){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, world, blockPosition);
    }

}