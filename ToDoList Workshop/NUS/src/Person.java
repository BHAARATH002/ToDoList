
public class Person {
	private String username = null;
	private String password = null;
	private String fullName = null;
	private ToDoList toDoList = null;
	private String Person = null;
	// private boolean isComplete = false;

	public Person(String username, String password, String fullName, ToDoList toDoList) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.toDoList = toDoList;
	}

	public ToDoList getToDoList() {
		return toDoList;
	}

	public void setToDoList(ToDoList toDoList) {
		this.toDoList = toDoList;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}