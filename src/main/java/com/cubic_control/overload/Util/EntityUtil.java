package com.cubic_control.overload.Util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAITasks.EntityAITaskEntry;

public class EntityUtil {
	public static void cancelCurrentTasks(EntityLiving entity) {
		Iterator<?> iterator = entity.tasks.taskEntries.iterator();
		List<EntityAITasks.EntityAITaskEntry> currentTasks = new ArrayList<EntityAITasks.EntityAITaskEntry>();
		
		while(iterator.hasNext()){
			EntityAITaskEntry entry = (EntityAITasks.EntityAITaskEntry)iterator.next();
			if(entry != null){
				currentTasks.add(entry);
			}
		}
		for(EntityAITaskEntry task : currentTasks){
			entity.tasks.removeTask(task.action);
			entity.tasks.addTask(task.priority, task.action);
		}
		entity.getNavigator().clearPathEntity();
	}
}
