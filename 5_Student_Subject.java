
public class Subject {
	private String subjectID;
	private String subjectName;
	public String getSubjectID() {
		return subjectID;
	}
	public Subject(String subjectID, String subjectName) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "Subject [subjectID=" + subjectID + ", subjectName=" + subjectName + "]";
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
}
