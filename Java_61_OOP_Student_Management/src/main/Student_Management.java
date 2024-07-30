package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Student_Management {
	private ArrayList<Student> listStudent;

	public Student_Management() {
		this.listStudent = new ArrayList<Student>();
	}
	
	public Student_Management(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}
	
	//1.Add
	public void addNewStudent(Student st)
	{
		this.listStudent.add(st);
	}
	//2.Print list without condition
	public void printStudentList()
	{
		for (Student student : listStudent) 
		{
			System.out.println(student);
		}
	}
	//3.Check null
	public boolean checkNullList()
	{
		return this.listStudent.isEmpty();
	}
	//4.Print size
	public int printNumberOfStudent()
	{
		return this.listStudent.size();
	}
	//5.Make this list is empty
	public void makeEmpty()
	{
		this.listStudent.removeAll(listStudent);
	}
	//6.Search a student based on ID
	public boolean checkStudentExist (Student st)
	{
		return this.listStudent.contains(st);
	}
	//7. Delete a student
	public boolean deleteStudent(Student sv)
	{
		return this.listStudent.remove(sv);
	}
	//8.Search all student based on Name entered keyboard
	public void searchStudent( String name)
	{
		for (Student student : listStudent)
		{
			if(student.getFullNameStudent().indexOf(name) >=0 )
			{
				System.out.println(student);
			}
		}
	}
	//9.Sort from high score to low score
	public void sortStudentFromHighScoreToLowScore()
	{
		Collections.sort(listStudent, new Comparator<Student>() 
		{

			@Override
			public int compare(Student st1, Student st2) {
				if(st1.getAveragePoints() < st2.getAveragePoints())
					return 1;
				if(st1.getAveragePoints() > st2.getAveragePoints())
					return -1;
				if(st1.getAveragePoints() == st2.getAveragePoints())
					return 0;

				return -2;
			}
			
		});
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
