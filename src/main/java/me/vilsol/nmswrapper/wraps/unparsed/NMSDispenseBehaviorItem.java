package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "DispenseBehaviorItem")
public class NMSDispenseBehaviorItem extends NMSWrap implements NMSIDispenseBehavior {

    public NMSDispenseBehaviorItem(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DispenseBehaviorItem#a(net.minecraft.server.v1_8_R3.ISourceBlock, net.minecraft.server.v1_8_R3.EnumDirection)
     */
    @ReflectiveMethod(name = "a", types = {NMSISourceBlock.class, NMSEnumDirection.class})
    public void a(NMSISourceBlock iSourceBlock, NMSEnumDirection enumDirection){
        NMSWrapper.getInstance().exec(nmsObject, iSourceBlock, enumDirection);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.DispenseBehaviorItem#b(net.minecraft.server.v1_8_R3.ISourceBlock, net.minecraft.server.v1_8_R3.ItemStack)
     */
    @ReflectiveMethod(name = "b", types = {NMSISourceBlock.class, NMSItemStack.class})
    public NMSItemStack b(NMSISourceBlock iSourceBlock, NMSItemStack itemStack){
        return new NMSItemStack(NMSWrapper.getInstance().exec(nmsObject, iSourceBlock, itemStack));
    }

}