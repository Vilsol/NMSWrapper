package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.*;
import me.vilsol.nmswrapper.reflections.*;
import me.vilsol.nmswrapper.wraps.*;

@ReflectiveClass(name = "EntityTypes")
public class NMSEntityTypes extends NMSWrap {

    public NMSEntityTypes(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityTypes#a(net.minecraft.server.v1_9_R1.Entity, java.lang.String)
     */
    @ReflectiveMethod(name = "a", types = {NMSEntity.class, String.class})
    public boolean a(NMSEntity entity, String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, entity, s);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.EntityTypes#b(java.lang.String)
     */
    @ReflectiveMethod(name = "b", types = {String.class})
    public boolean b(String s){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject, s);
    }

    /**
     * @see net.minecraft.server.v1_9_R1.EntityTypes#createEntityByName(java.lang.String, net.minecraft.server.v1_9_R1.World)
     */
    @ReflectiveMethod(name = "createEntityByName", types = {String.class, NMSWorld.class})
    public NMSEntity createEntityByName(String s, NMSWorld world){
        return new NMSEntity(NMSWrapper.getInstance().exec(nmsObject, s, world));
    }

    @ReflectiveClass(name = "MonsterEggInfo")
    public class NMSMonsterEggInfo extends NMSWrap {

        public NMSMonsterEggInfo(Object nmsObject){
            super(nmsObject);
        }

        public NMSMonsterEggInfo(int i, int i1, int i2){
            super("MonsterEggInfo", new Object[]{int.class, int.class, int.class}, new Object[]{i, i1, i2});
        }

    }

}