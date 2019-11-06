import java.util.ArrayList;

public class Project {
	private String name = null;
	private Duration duration = null;
	private double rate = 0.0;
	private int effortRequired = 0;
	private String manager = null;

	public Project() {
		super();
	}

	public void addManager(String manager) {
		this.manager = manager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getEffortRequired() {
		return effortRequired;
	}

	public void setEffortRequired(int effortRequired) {
		this.effortRequired = effortRequired;
	}

	public String getManager() {
		return manager;
	}

}
