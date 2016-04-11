package me.vilsol.nmswrapper.wraps.unparsed;

import me.vilsol.nmswrapper.NMSWrapper;
import me.vilsol.nmswrapper.reflections.ReflectiveClass;
import me.vilsol.nmswrapper.reflections.ReflectiveMethod;
import me.vilsol.nmswrapper.wraps.NMSWrap;

@ReflectiveClass(name = "PathfinderGoalNearestAttackableTarget")
public class NMSPathfinderGoalNearestAttackableTarget extends NMSWrap {

    public NMSPathfinderGoalNearestAttackableTarget(Object nmsObject){
        super(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalNearestAttackableTarget#a()
     */
    @ReflectiveMethod(name = "a", types = {})
    public boolean a(){
        return (boolean) NMSWrapper.getInstance().exec(nmsObject);
    }

    /**
     * TODO Find correct name
     * @see net.minecraft.server.v1_9_R1.PathfinderGoalNearestAttackableTarget#c()
     */
    @ReflectiveMethod(name = "c", types = {})
    public void c(){
        NMSWrapper.getInstance().exec(nmsObject);
    }

    @ReflectiveClass(name = "DistanceComparator")
    public class NMSDistanceComparator extends NMSWrap {

        public NMSDistanceComparator(Object nmsObject){
            super(nmsObject);
        }

        public NMSDistanceComparator(NMSEntity entity){
            super("DistanceComparator", new Object[]{NMSEntity.class}, new Object[]{entity});
        }

        /**
         * TODO Find correct name
         * @see net.minecraft.server.v1_9_R1.PathfinderGoalNearestAttackableTarget$DistanceComparator#a(net.minecraft.server.v1_9_R1.Entity, net.minecraft.server.v1_9_R1.Entity)
         */
        @ReflectiveMethod(name = "a", types = {NMSEntity.class, NMSEntity.class})
        public int a(NMSEntity entity, NMSEntity entity1){
            return (int) NMSWrapper.getInstance().exec(nmsObject, entity, entity1);
        }

        /**
         * @see net.minecraft.server.v1_9_R1.PathfinderGoalNearestAttackableTarget$DistanceComparator#compare(java.lang.Object, java.lang.Object)
         */
        @ReflectiveMethod(name = "compare", types = {Object.class, Object.class})
        public int compare(Object object, Object object1){
            return (int) NMSWrapper.getInstance().exec(nmsObject, object, object1);
        }

    }

}