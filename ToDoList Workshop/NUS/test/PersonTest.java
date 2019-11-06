import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;

public class PersonTest extends TestCase{
	// Define test params
	private Person person;
	private ToDoList toDoList;
	private PersonList list;
	
	public PersonTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception{
		// Initialise test params
		list = new PersonList();
		toDoList = new ToDoList();
		person = new Person("username", "password", "fullName", toDoList);
	}
	
	@After
	public void tearDown() throws Exception{
		// Uninitialise test params
		person = null;
		toDoList = null;
		list = null;
	}
	
	@Test
	public void testUserLogin() {
		list.addPerson(person);
		assertNotNull(list);
		
		String fullName = list.getLogin("username", "password");
		
		assertEquals(fullName, person.getFullName());
		
	}
}
