
public class SalesEmployee extends Employee {
	private float commissionRate;
	private int salesMade;

	public SalesEmployee(String name, float salary, float commissionRate, int salesMade) {
		super(name, salary);
		this.commissionRate = commissionRate;
		this.salesMade = salesMade;
	}

	public float variableComponent() {
		return salesMade * commissionRate;
	}

}
