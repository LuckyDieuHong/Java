package Exercise;

import java.io.File;
import java.util.Scanner;

public class Example_Contact_File {
	File file;

	public Example_Contact_File(String fileName) {
		this.file = new File(fileName);
	}

	public boolean checkExecute() {// 1
		return this.file.canExecute();
	}

	public boolean checkFileRead() {// 2
		return this.file.canRead();
	}

	public boolean checkFileWrite() {// 3
		return this.file.canWrite();
	}

	public void printPath() {// 4
		System.out.println(this.file.getAbsolutePath());
	}

	public String printName() {// 5
		return this.file.getName();
	}

	public void checkDirectoryOrFile() {// 6
		if (this.file.isDirectory())
			System.out.println("This a directory");
		if (this.file.isFile())
			System.out.println("This a file");
	}

	public void printListOfFileInDirectory() {// 7
		if (this.file.isFile())
			System.out.println("This is a file, not a directory so you can't print list");
		else {
			System.out.println("List of file: ");
			File[] array = this.file.listFiles();
			for (File file : array) {
				System.out.println(file.getAbsolutePath());
			}
		}
	}

	public void printDirectoryTree() {// 8
		this.printDetailDirectoryTree(this.file,1); //1 la goc
	}

	public void printDetailDirectoryTree(File f, int level) {// 8.1

		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if(f.canRead()&&f.isDirectory())
		{
			File[] array = f.listFiles();
			for (File fx : array) {
				printDetailDirectoryTree(fx, level + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selection = 0;
		System.out.println("Enter path of file: ");
		String fileName = sc.nextLine();
		Example_Contact_File exf = new Example_Contact_File(fileName);
		do {
			System.out.println("-----------MENU----------");
			System.out.println("1.Check file can execute");
			System.out.println("2.Check file can read");
			System.out.println("3.Check file can write");
			System.out.println("4.Print path of file");
			System.out.println("5.Print name's file");
			System.out.println("6.Check file is a directory or a file");
			System.out.println("7.Print list of file in a directory");
			System.out.println("8.Print directory tree");
			System.out.println("Enter your choice (press 0 to exit): ");
			selection = sc.nextInt();
			switch (selection) {
			case 1:
				System.out.println(exf.checkExecute());
				break;
			case 2:
				System.out.println(exf.checkFileRead());
				break;
			case 3:
				System.out.println(exf.checkFileWrite());
				break;
			case 4:
				exf.printPath();
				break;
			case 5:
				System.out.println(exf.printName());
				break;
			case 6:
				exf.checkDirectoryOrFile();
				break;
			case 7:
				exf.printListOfFileInDirectory();
				break;
			case 8:
				exf.printDirectoryTree();;
				break;
			default:
				break;
			}

		} while (selection != 0);
	}
}
