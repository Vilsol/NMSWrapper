package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "GuiStatsComponent")
public class NMSGuiStatsComponent extends JComponent {

    public NMSGuiStatsComponent(Object nmsObject){
        super(nmsObject);
    }

    public NMSGuiStatsComponent(NMSMinecraftServer minecraftServer){
        super("GuiStatsComponent", new Object[]{NMSMinecraftServer.class}, new Object[]{minecraftServer});
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_8_R3.GuiStatsComponent#a(net.minecraft.server.v1_8_R3.GuiStatsComponent)
     */
    @ReflectiveMethod(name = "a", types = {NMSGuiStatsComponent.class})
    public void a(NMSGuiStatsComponent guiStatsComponent){
        NMSWrapper.getInstance().exec(nmsObject, guiStatsComponent);
    }

    /**
     * @see net.minecraft.server.v1_8_R3.GuiStatsComponent#paint(java.awt.Graphics)
     */
    @ReflectiveMethod(name = "paint", types = {Graphics.class})
    public void paint(Graphics graphics){
        NMSWrapper.getInstance().exec(nmsObject, graphics);
    }

}