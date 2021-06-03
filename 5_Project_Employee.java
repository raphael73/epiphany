
public class Employee {
	private String id;
	private String name;
	private String department;
	private float baseSalary;
	private Employee()
	{
		id="00000";
		name = "未知";
		department = "销售";
		baseSalary=1000f;
	}
	public Employee(String id, String name, String department, float baseSalary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.baseSalary = baseSalary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	public String tostring()
	{
		String msg;
		msg =this.id;
		msg +=this.name;
		msg +=this.department;
		msg +=this.baseSalary;
		return msg;
	}
}

