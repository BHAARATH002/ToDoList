import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;


public class ToDoListTest extends TestCase{
	// Define Test Fixtures
	private ToDoList toDoList;
	private Task task1, task2, task3;
	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		//Initialise Test Fixtures
		task1 = new Task("Task 1",false);
		task2 = new Task("Task 2",true);
		task3 = new Task("Task 3",true);
		
		toDoList = new ToDoList();
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialise test Fixtures
		task1 = null;
		task2 = null;
		task3 = null;
		
		toDoList = null;
	}

	@Test
	public void testAddTask() {
		assertNotNull(toDoList);
		toDoList.addTask(task1);
		assertEquals(toDoList.getAllTasks().size(),1);
		assertEquals(task1, toDoList.getTask(task1.getDescription()));
	}
	@Test
	public void testGetStatus() {
		assertNotNull(toDoList);
		toDoList.addTask(task1);
		assertEquals(false, toDoList.getStatus(task1.getDescription()));
		toDoList.completeTask(task1.getDescription());
		assertEquals(true, toDoList.getStatus(task1.getDescription()));
	}
	@Test
	public void testRemoveTask() {
		assertNotNull(toDoList);
		toDoList.addTask(task1);
		toDoList.addTask(task2);;
		
		toDoList.removeTask(task1.getDescription());
		assertNull(toDoList.getTask(task1.getDescription()));	
	}
	@Test
	public void testGetCompletedTasks() {
		task1.setComplete(true);
		task3.setComplete(true);
		toDoList.addTask(task1);
		toDoList.addTask(task2);
		
		Collection<Task> tasks = toDoList.getCompletedTasks();
		assertEquals(2, tasks.size());
	}
	@Test
	public void testRemoveMultipleTask() {
		int ori_size = toDoList.getAllTasks().size();	//original size of toDoList
		//all 3 tasks into toDoList
		toDoList.addTask(task1);
		toDoList.addTask(task2);
		toDoList.addTask(task3);
		
		//set all tasks' description into string array
		String[] desc_list =  {task1.getDescription(), task2.getDescription(), task3.getDescription()};
		toDoList.removeMultipleTask(desc_list);
		
		//compare the original size with latest size
		assertEquals(ori_size, toDoList.getAllTasks().size());
	}
	@Test
	public void testGetInCompletedTasks() {
		task3.setComplete(true);
		toDoList.addTask(task1);
		toDoList.addTask(task2);
		toDoList.addTask(task3);
		
		Collection<Task> tasks = toDoList.getInCompletedTasks();
		assertEquals(1, tasks.size());
	}
	@Test
	public void testGetAllTask(){
		assertNotNull(toDoList);
		
		toDoList.addTask(task1);
		toDoList.addTask(task2);
		toDoList.addTask(task3);
		
		assertEquals(3, toDoList.getAllTasks().size());
	}
	@Test
	public void testSearchTask(){
		assertNotNull(toDoList);
		
		toDoList.addTask(task1);
		toDoList.addTask(task2);
		toDoList.addTask(task3);
		
		assertEquals(task1, toDoList.getTask(task1.getDescription()));
	}
}
