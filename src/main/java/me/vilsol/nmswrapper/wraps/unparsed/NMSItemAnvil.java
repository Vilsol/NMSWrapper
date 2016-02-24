package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemAnvil")
public class NMSItemAnvil extends NMSItemMultiTexture {

    public NMSItemAnvil(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemAnvil(NMSBlock block){
        super("ItemAnvil", new Object[]{NMSBlock.class}, new Object[]{block});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemAnvil#filterData(int)
     */
    @ReflectiveMethod(name = "filterData", types = {int.class})
    public int filterData(int i){
        return (int) NMSWrapper.getInstance().exec(nmsObject, i);
    }

}