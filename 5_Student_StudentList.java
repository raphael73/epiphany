public class StudentList {
	public StudentList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentList(String studentId, String name) {
		super();
		StudentId = studentId;
		Name = name;
	}
	private String StudentId;
	private String Name;
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "StudentList [StudentId=" + StudentId + ", Name=" + Name + "]";
	}

}
