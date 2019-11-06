
public abstract class Employee {
	private String name;
	private float salary;
	public Employee (String name, float salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() { return name;}
	
	public float getBaseSalary() {
		return salary;
	}
	public float computeDeductions() {
		return salary * 0.2f;
	}
	protected float computeSalary() {
		return (getBaseSalary() - computeDeductions() + variableComponent());
	}	
	public abstract float variableComponent();
}
