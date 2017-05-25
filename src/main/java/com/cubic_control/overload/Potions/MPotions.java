package com.cubic_control.overload.Potions;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.cubic_control.overload.Configuration.MConfiguration;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;

public class MPotions {
	public static Potion frostbite;
	
	public static void createPotions(){
		startPotions();
		frostbite = new ModPotion(MConfiguration.potionID_frostbite, true, 0x6FD5F7, "potion.frostbite").setIconIndex(0, 0).func_111184_a(SharedMonsterAttributes.movementSpeed, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.1D, 2).func_111184_a(SharedMonsterAttributes.attackDamage, "22653B89-116E-49DC-9B6B-9971489B5BE5", 1.0D, 0);
	}
	
	public static void startPotions(){
		Potion[] potionTypes = null;
		
		for(Field f : Potion.class.getDeclaredFields()){
			f.setAccessible(true);
			try{
				if(f.getName().equals("potionTypes") || f.getName().equals("field_76425_a")){
					Field field = Field.class.getDeclaredField("modifiers");
					field.setAccessible(true);
					field.setInt(f, f.getModifiers() & ~Modifier.FINAL);
					potionTypes = (Potion[])f.get(null);
					final Potion[] newPotionTypes = new Potion[256];
					System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
					f.set(null, newPotionTypes);
				}
			}catch(Exception e){
				System.err.println("Severe error, please report this to the mod author:");
				System.err.println(e);
			}
		}
	}
}
