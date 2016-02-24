package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "ItemSpade")
public class NMSItemSpade extends NMSItemTool {

    public NMSItemSpade(Object nmsObject){
        super(nmsObject);
    }

    public NMSItemSpade(NMSEnumToolMaterial enumToolMaterial){
        super("ItemSpade", new Object[]{NMSEnumToolMaterial.class}, new Object[]{enumToolMaterial});
    }

    /**
     * @see net.minecraft.server.v1_8_R3.ItemSpade#canDestroySpecialBlock(net.minecraft.server.v1_8_R3.Block)
     */
    @ReflectiveMethod(name = "canDestroySpecialBlock", types = {NMSBlock.class})
    public boolean canDestroySpecialBlock(NMSBlock block){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, block);
    }

}