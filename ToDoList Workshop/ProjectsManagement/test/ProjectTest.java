import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class ProjectTest {
	private RegularProject project = null;

	@Before
	public void setUp() {
		project = new RegularProject();
	}

	@Test
	public void testAddMember() {
		project.addMember("Anne");
		ArrayList<String> members = project.getMembers();
		assertEquals(1, members.size());
		boolean exists = false;
		for (String m : members) {
			if (m.equals("Anne"))
				exists = true;
		}
		assertTrue(exists);
	}

	@Test
	public void testRemoveMember() {
		// One member added; one removed
		project.addMember("Anne");
		ArrayList<String> members = project.getMembers();
		assertEquals(1, members.size());
		project.removeMember("Anne");
		assertEquals(0, members.size());

		boolean exists = false;
		for (String m : members) {
			if (m.equals("Anne"))
				exists = true;
		}
		assertFalse(exists);

		// Two members added; one removed
		project.addMember("Anne");
		project.addMember("John");
		members = project.getMembers();
		assertEquals(2, members.size());
		project.removeMember("Anne");
		assertEquals(1, members.size());

		exists = false;
		for (String m : members) {
			if (m.equals("Anne"))
				exists = true;
		}
		assertFalse(exists);
	}

}
