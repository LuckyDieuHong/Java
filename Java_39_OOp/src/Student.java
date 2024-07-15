
public class Student extends ConNguoi {
	private String className;
	private String studentID;
	public Student(String hoVaTen, int namSinh, String className, String studentID) {
		super(hoVaTen, namSinh);
		this.className = className;
		this.studentID = studentID;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public void doHomeWork()
	{
		System.out.println("Do it !");
	}
	
	
}
