import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;

public class PersonTest extends TestCase{
	// Define test params
	private Person person;
	private PersonList list;
	private ToDoList toDoList;
	private Task task1, task2, task3;
	
	public PersonTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception{
		// Initialise test params
		list = new PersonList();
		
		task1 = new Task("Task 1",false);
		task2 = new Task("Task 2",true);
		task3 = new Task("Task 3",true);
		
		toDoList = new ToDoList();
		
		toDoList.addTask(task1);
		toDoList.addTask(task2);
		toDoList.addTask(task3);
		
		person = new Person("username", "password", "fullName", toDoList);
	}
	
	@After
	public void tearDown() throws Exception{
		// Uninitialise test params
		person = null;
		list = null;
		
		task1 = null;
		task2 = null;
		task3 = null;
		
		toDoList = null;
	}
	
	@Test
	public void testUserLogin() {
		list.addPerson(person);
		assertNotNull(list);
		
		String fullName = list.getLogin("username", "password");
		
		assertEquals(fullName, person.getFullName());	
	}
	@Test
	public void testSearchUserTaskList(){
		list.addPerson(person);
		assertEquals(3, list.getPersonTaskList(person.getUsername()).size());
	}
}
