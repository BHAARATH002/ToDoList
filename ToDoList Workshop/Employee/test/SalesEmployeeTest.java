import static org.junit.Assert.*;
import org.junit.*;


public class SalesEmployeeTest{

	@Test
	public void testComputeSalary() {
		SalesEmployee salesEmployee = new SalesEmployee("Jack", 2000.0f, 300.0f, 20);
		assertTrue( salesEmployee.computeSalary() == 7600.0);
	}

}
