package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSEntity;
import me.vilsol.nmswrapper.wraps.NMSEntityInsentient;
import me.vilsol.nmswrapper.wraps.NMSWorld;

@ReflectiveClass(name = "NavigationSpider")
public class NMSNavigationSpider extends NMSNavigation {

    public NMSNavigationSpider(Object nmsObject){
        super(nmsObject);
    }

    public NMSNavigationSpider(NMSEntityInsentient entityInsentient, NMSWorld world){
        super("NavigationSpider", new Object[]{NMSEntityInsentient.class, NMSWorld.class}, new Object[]{entityInsentient, world});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NavigationSpider#a(net.minecraft.server.v1_8_R3.Entity, double)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntity.class, double.class})
    public boolean a(NMSEntity entity, double d){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity, d);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.NavigationSpider#k()
     */
    @ReflectiveMethod(name = "k", types = {})
    public void k(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

}