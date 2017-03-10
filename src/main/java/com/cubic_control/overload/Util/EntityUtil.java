package com.cubic_control.overload.Util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAITasks.EntityAITaskEntry;

public class EntityUtil {
	public static void cancelCurrentTasks(EntityLiving ent) {
	    Iterator<?> iterator = ent.tasks.taskEntries.iterator();

	    List<EntityAITasks.EntityAITaskEntry> currentTasks = new ArrayList<EntityAITasks.EntityAITaskEntry>();
	    while (iterator.hasNext()) {
	      EntityAITaskEntry entityaitaskentry = (EntityAITasks.EntityAITaskEntry) iterator.next();
	      if(entityaitaskentry != null) {
	        currentTasks.add(entityaitaskentry);
	      }
	    }
	    //Only available way to stop current execution is to remove all current tasks, then re-add them 
	    for (EntityAITaskEntry task : currentTasks) {
	      ent.tasks.removeTask(task.action);
	      ent.tasks.addTask(task.priority, task.action);
	    }
	    ent.getNavigator().clearPathEntity();
	  }
}
