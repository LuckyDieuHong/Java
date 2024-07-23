package Example;

public class Student implements Comparable<Student>{
	private int studentID;
	private String studentName;
	private String className;
	private double diemTrungBinh;
	public Student(int studentID, String studentName, String className, double diemTrungBinh) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.className = className;
		this.diemTrungBinh = diemTrungBinh;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public String getTen()
	{
		String s = studentName.trim();
		if(s.indexOf(" ") >= 0)
		{
			int positionName = s.lastIndexOf(" ");
			return s.substring(positionName+1);
		}
		else
			return s;
	}
	@Override
	public int compareTo(Student o) {
		//     <0 -- =0  -- >0
		String nameThisClass = this.getTen();
		String nameO = o.getTen();
		
		//return nameThisClass.compareTo(nameO);
		return (int) (this.diemTrungBinh - o.diemTrungBinh);
	}
	
	
}
