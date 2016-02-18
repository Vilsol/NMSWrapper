package me.vilsol.nmswrapper.wraps;

import me.vilsol.nmswrapper.Reflection;

import java.util.HashMap;

public class NMSEnumParticle extends NMSWrap {

    private static NMSEnumParticle EXPLOSION_NORMAL = new NMSEnumParticle(0);
    private static NMSEnumParticle EXPLOSION_LARGE = new NMSEnumParticle(1);
    private static NMSEnumParticle EXPLOSION_HUGE = new NMSEnumParticle(2);
    private static NMSEnumParticle FIREWORKS_SPARK = new NMSEnumParticle(3);
    private static NMSEnumParticle WATER_BUBBLE = new NMSEnumParticle(4);
    private static NMSEnumParticle WATER_SPLASH = new NMSEnumParticle(5);
    private static NMSEnumParticle WATER_WAKE = new NMSEnumParticle(6);
    private static NMSEnumParticle SUSPENDED = new NMSEnumParticle(7);
    private static NMSEnumParticle SUSPENDED_DEPTH = new NMSEnumParticle(8);
    private static NMSEnumParticle CRIT = new NMSEnumParticle(9);
    private static NMSEnumParticle CRIT_MAGIC = new NMSEnumParticle(10);
    private static NMSEnumParticle SMOKE_NORMAL = new NMSEnumParticle(11);
    private static NMSEnumParticle SMOKE_LARGE = new NMSEnumParticle(12);
    private static NMSEnumParticle SPELL = new NMSEnumParticle(13);
    private static NMSEnumParticle SPELL_INSTANT = new NMSEnumParticle(14);
    private static NMSEnumParticle SPELL_MOB = new NMSEnumParticle(15);
    private static NMSEnumParticle SPELL_MOB_AMBIENT = new NMSEnumParticle(16);
    private static NMSEnumParticle SPELL_WITCH = new NMSEnumParticle(17);
    private static NMSEnumParticle DRIP_WATER = new NMSEnumParticle(18);
    private static NMSEnumParticle DRIP_LAVA = new NMSEnumParticle(19);
    private static NMSEnumParticle VILLAGER_ANGRY = new NMSEnumParticle(20);
    private static NMSEnumParticle VILLAGER_HAPPY = new NMSEnumParticle(21);
    private static NMSEnumParticle TOWN_AURA = new NMSEnumParticle(22);
    private static NMSEnumParticle NOTE = new NMSEnumParticle(23);
    private static NMSEnumParticle PORTAL = new NMSEnumParticle(24);
    private static NMSEnumParticle ENCHANTMENT_TABLE = new NMSEnumParticle(25);
    private static NMSEnumParticle FLAME = new NMSEnumParticle(26);
    private static NMSEnumParticle LAVA = new NMSEnumParticle(27);
    private static NMSEnumParticle FOOTSTEP = new NMSEnumParticle(28);
    private static NMSEnumParticle CLOUD = new NMSEnumParticle(29);
    private static NMSEnumParticle REDSTONE = new NMSEnumParticle(30);
    private static NMSEnumParticle SNOWBALL = new NMSEnumParticle(31);
    private static NMSEnumParticle SNOW_SHOVEL = new NMSEnumParticle(32);
    private static NMSEnumParticle SLIME = new NMSEnumParticle(33);
    private static NMSEnumParticle HEART = new NMSEnumParticle(34);
    private static NMSEnumParticle BARRIER = new NMSEnumParticle(35);
    private static NMSEnumParticle ITEM_CRACK = new NMSEnumParticle(36);
    private static NMSEnumParticle BLOCK_CRACK = new NMSEnumParticle(37);
    private static NMSEnumParticle BLOCK_DUST = new NMSEnumParticle(38);
    private static NMSEnumParticle WATER_DROP = new NMSEnumParticle(39);
    private static NMSEnumParticle ITEM_TAKE = new NMSEnumParticle(40);
    private static NMSEnumParticle MOB_APPEARANCE = new NMSEnumParticle(41);

    private static HashMap<Integer, NMSEnumParticle> map = new HashMap<>();
    
    private NMSEnumParticle(int position) {
        super(Reflection.getClassDef("EnumParticle").getEnumConstants()[position]);
        map.put(position, this);
    }

    public static NMSEnumParticle getParticle(int position){
        return map.get(position);
    }

    public static NMSEnumParticle getParticle(String name){
        Object[] enumParticles = Reflection.getClassDef("EnumParticle").getEnumConstants();
        for (int i = 0; i < enumParticles.length; i++) {
            if(Reflection.getField(enumParticles[i], "Q").equals(name)){
                return getParticle(i);
            }
        }
        return null;
    }
    
}