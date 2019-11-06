import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
private HashMap<String, Task> tasks = new HashMap<String, Task>();

	public void addTask (Task task) {
		//Add code here
		tasks.put(task.getDescription(), task);
	}
	public void completeTask(String description) {
		// Add code here
		Task task = null;
		if ((task = tasks.get(description)) != null){
			task.setComplete(true);
		}
	}
	public boolean getStatus(String description) {
		//Add code here
		Task task = null;
		if ((task = tasks.get(description)) != null){
			return task.isComplete();
		}
		return false;
	}
	public Task getTask(String description) {
		// Add code here
		return tasks.get(description);
	}
	public Task removeTask(String description) {
		// Add code here
		return tasks.remove(description);
	}
	public Collection<Task> getAllTasks() {
		return tasks.values();
	}
	public Collection<Task> getCompletedTasks() {
		// Add code here
		Collection<Task> completedTasks = new ArrayList<Task> ();
		Collection<Task> allTasks = new ArrayList<Task> ();
		allTasks = getAllTasks();
		for (Task task: allTasks) 
			if (task.isComplete() == true) completedTasks.add(task);
		return completedTasks;
	}
	
	public void removeMultipleTask(String[] desc) {
		for (String description: desc) {
			if(description != null && description.length() > 0) {
				if(tasks.get(description) != null) {
					tasks.remove(description);
				}
			}
		}
	}
}
