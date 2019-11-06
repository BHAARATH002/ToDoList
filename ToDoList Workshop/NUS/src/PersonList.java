import java.util.Collection;
import java.util.HashMap;

public class PersonList {
	private HashMap<String, Person> persons = new HashMap<String, Person>();
	
	public void addPerson(Person person) {
		persons.put(person.getUsername(), person);
	}

	public String getLogin(String username, String password) {
		Person person = null;
		if ((person = persons.get(username)) != null){
			return persons.get(username).getFullName();
		}
		return null;
	}
	public Collection<Task> getPersonTaskList(String username) {
		Person person = null;
		if ((person = persons.get(username)) != null){
			return persons.get(username).getToDoList().getAllTasks();
		}
		return null;
	}
}
