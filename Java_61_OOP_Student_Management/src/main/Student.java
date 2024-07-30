package main;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private String idStudent;
	private String fullNameStudent;
	private int birth;
	private float averagePoints;
	
	
	
	public Student(String idStudent) 
	{
		this.idStudent = idStudent;
	}
	public Student(String idStudent, String fullNameStudent, int birth, float averagePoints) {
		this.idStudent = idStudent;
		this.fullNameStudent = fullNameStudent;
		this.birth = birth;
		this.averagePoints = averagePoints;
	}
	public String getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}
	public String getFullNameStudent() {
		return fullNameStudent;
	}
	public void setFullNameStudent(String fullNameStudent) {
		this.fullNameStudent = fullNameStudent;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public float getAveragePoints() {
		return averagePoints;
	}
	public void setAveragePoints(float averagePoints) {
		this.averagePoints = averagePoints;
	}
	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", fullNameStudent=" + fullNameStudent + ", birth=" + birth
				+ ", averagePoints=" + averagePoints + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return this.idStudent.compareTo(o.idStudent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(idStudent, other.idStudent);
	}
	
	
	
	
	
	
	
}
