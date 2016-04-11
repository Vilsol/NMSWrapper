package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemPiston")
public class NMSItemPiston extends NMSItemBlock {

    public NMSItemPiston(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemPiston(NMSBlock block){
        super("ItemPiston", new Object[]{NMSBlock.class}, new Object[]{block});
    }

    /**
     * @see net.minecraft.server.v1_9_R1.ItemPiston#filterData(int)
     */
    @ReflectiveMethod(name = "filterData", types = {int.class})
    public int filterData(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

}