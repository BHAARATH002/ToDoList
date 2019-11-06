import java.util.ArrayList;
import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;


public class ToDoListTest extends TestCase{
	// Define Test Fixtures
	private ToDoList toDoList1;
	private Task task1, task2, task3;
	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		//Initialise Test Fixtures
		toDoList1 = new ToDoList();
		task1 = new Task("Task 1",false);
		task2 = new Task("Task 2",false);
		task3 = new Task("Task 3",false);
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialise test Fixtures
		toDoList1 = null;
		task1 = null;
		task2 = null;
		task3 = null;
	}

	@Test
	public void testAddTask() {
		assertNotNull(toDoList1);
		toDoList1.addTask(task1);
		assertEquals(toDoList1.getAllTasks().size(),1);
		assertEquals(task1, toDoList1.getTask(task1.getDescription()));
	}
	@Test
	public void testGetStatus() {
		assertNotNull(toDoList1);
		toDoList1.addTask(task1);
		assertEquals(false, toDoList1.getStatus(task1.getDescription()));
		toDoList1.completeTask(task1.getDescription());
		assertEquals(true, toDoList1.getStatus(task1.getDescription()));
	}
	@Test
	public void testRemoveTask() {
		assertNotNull(toDoList1);
		toDoList1.addTask(task1);
		toDoList1.addTask(task2);;
		
		toDoList1.removeTask(task1.getDescription());
		assertNull(toDoList1.getTask(task1.getDescription()));	
	}
	@Test
	public void testGetCompletedTasks() {
		task1.setComplete(true);
		task3.setComplete(true);
		toDoList1.addTask(task1);
		toDoList1.addTask(task2);
		toDoList1.addTask(task3);
		
		Collection<Task> tasks = toDoList1.getCompletedTasks();
		assertEquals(2, tasks.size());
	}
	@Test
	public void testGetInCompletedTasks() {
		task3.setComplete(true);
		toDoList1.addTask(task1);
		toDoList1.addTask(task2);
		toDoList1.addTask(task3);
		
		Collection<Task> tasks = toDoList1.getInCompletedTasks();
		assertEquals(2, tasks.size());
	}
	@Test
	public void testGetAllTask(){
		assertNotNull(toDoList1);
		
		toDoList1.addTask(task1);
		toDoList1.addTask(task2);
		toDoList1.addTask(task3);
		
		assertEquals(3, toDoList1.getAllTasks().size());
	}
	@Test
	public void testSearchTask(){
		assertNotNull(toDoList1);
		
		toDoList1.addTask(task1);
		toDoList1.addTask(task2);
		toDoList1.addTask(task3);
		
		assertEquals(toDoList1.getAllTasks().size(),3);
		assertEquals(task1, toDoList1.getTask(task1.getDescription()));
	}
}
