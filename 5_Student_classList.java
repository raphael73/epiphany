
public class classList {
	private int Semester;
	private int year;
	private Subject subj;
	private StudentList S1;
	private StudentList S2;
	public classList(int semester, int year, Subject subj, StudentList s1, StudentList s2) {
		super();
		Semester = semester;
		this.year = year;
		this.subj = subj;
		S1 = s1;
		S2 = s2;
	}
	public int getSemester() {
		return Semester;
	}
	public void setSemester(int semester) {
		Semester = semester;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Subject getSubj() {
		return subj;
	}
	public void setSubj(Subject subj) {
		this.subj = subj;
	}
	public classList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentList getS1() {
		return S1;
	}
	public void setS1(StudentList s1) {
		S1 = s1;
	}
	public StudentList getS2() {
		return S2;
	}
	public void setS2(StudentList s2) {
		S2 = s2;
	}
	@Override
	public String toString() {
		return "classList [Semester=" + Semester + ", year=" + year + ", subj=" + subj + ", S1=" + S1 + ", S2=" + S2
				+ "]";
	}
	
}
