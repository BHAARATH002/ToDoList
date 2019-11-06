import java.util.ArrayList;

public class RegularProject extends Project {
	private ArrayList<String> members;

	public RegularProject() {
		super();
		members = new ArrayList<String>();
	}

	public void addMember(String member) {
		members.add(member);
	}

	public String removeMember(String member) {
		members.remove(member);
		return member;
	}

	public ArrayList<String> getMembers() {
		return members;
	}
}
