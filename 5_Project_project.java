
public class project {
	private String projectName;
	private float budget;
	private Employee emp1;
	private Employee emp2;
	
	public project(String projectName, float budget, Employee emp1, Employee emp2) {
		super();
		this.projectName = projectName;
		this.budget = budget;
		this.emp1 = emp1;
		this.emp2 = emp2;
	}
	
	public project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public float getBudget() {
		return budget;
	}
	public void setBudget(float budget) {
		this.budget = budget;
	}
	public Employee getEmp1() {
		return emp1;
	}
	public void setEmp1(Employee emp1) {
		this.emp1 = emp1;
	}
	public Employee getEmp2() {
		return emp2;
	}
	public void setEmp2(Employee emp2) {
		this.emp2 = emp2;
	}

	@Override
	public String toString() {
		return "project [projectName=" + projectName + ", budget=" + budget + ", emp1=" + emp1 + ", emp2=" + emp2 + "]";
	}
	public void updateBudget() {
		this.setBudget(this.getBudget()*1.2f);
	}
}
