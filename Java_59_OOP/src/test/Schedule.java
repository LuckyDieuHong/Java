package test;

public class Schedule {
	private Day thu;
	private String subjects;
	public Schedule(Day thu, String subjects) {
		this.thu = thu;
		this.subjects = subjects;
	}
	public Day getThu() {
		return thu;
	}
	public void setThu(Day thu) {
		this.thu = thu;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "[Date=" + thu + ", Subjects=" + subjects + "]";
	}
	
}
