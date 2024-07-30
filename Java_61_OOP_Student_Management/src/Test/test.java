package Test;

import java.util.Scanner;

import main.Student;
import main.Student_Management;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selection;
		Student_Management listStudent = new Student_Management();
		do
		{
			System.out.println("------------------------------Menu------------------------------");
			System.out.println("1. Add new student");
			System.out.println("2. Print student list");
			System.out.println("3. Check empty list");
			System.out.println("4. Print number of student in list");
			System.out.println("5. Create an empty list");
			System.out.println("6. Check if student exists or not based on Student ID");
			System.out.println("7. Delete a student");
			System.out.println("8. Search all students based on names entered from the keyboard");
			System.out.println("9. Print student list with scrores from high to low");
			System.out.println("Select your option (press -1 to exit): ");
			selection = sc.nextInt();
			sc.nextLine();
			if(selection==-1)
				break;
			switch (selection) {
			case 1:
				System.out.println("Enter Student ID: ");
				String IDStudent = sc.nextLine();
				
				System.out.println("Enter full name Student: ");
				String fullName = sc.nextLine();
				System.out.println("Enter Student's year of birth: ");
				int birth = sc.nextInt();
				System.out.println("Enter average score of Student: ");
				float score = sc.nextFloat();
				Student st1 = new Student(IDStudent, fullName, birth, score);
				listStudent.addNewStudent(st1);
				break;
			case 2:
				listStudent.printStudentList();
				break;
			case 3:
				if(listStudent.checkNullList()==true)
				{
					System.out.println("The student list is empty");
				}
				else
					System.out.println("The student list is not empty");
				break;
			case 4:
				System.out.println("Number of student is: "+listStudent.printNumberOfStudent());
				break;
			case 5:
				listStudent.makeEmpty();
				break;
			case 6:
				System.out.println("Enter the student ID that you want to know exist or not: ");
				String ID = sc.nextLine();
				Student st = new Student(ID);
				if(listStudent.checkStudentExist(st))
				{
					System.out.println("The student is exist");
				}
				else
					System.out.println("The student is not exist");
				break;
			case 7:
				System.out.println("Enter the student ID that you want to delete: ");
				ID = sc.nextLine();
				Student st2 = new Student(ID);
				System.out.println(listStudent.deleteStudent(st2));
				break;
			case 8:
				System.out.println("Enter the student name that you want to search: ");
				String name = sc.nextLine();
				System.out.println("Result: ");
				listStudent.searchStudent(name);
				break;
			case 9:
				listStudent.sortStudentFromHighScoreToLowScore();
				listStudent.printStudentList();
				break;
			default:
				System.out.println("You have selected wrong option, please select again !");
				break;
			}
		} while (true);
	}
}
