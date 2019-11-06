import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class AllToDoList {
	private HashMap<Integer, ToDoList> task_list = new HashMap<Integer, ToDoList>();
	
	public void addTaskList(ToDoList list) {
		task_list.put(task_list.size()+1, list);
	}
}
