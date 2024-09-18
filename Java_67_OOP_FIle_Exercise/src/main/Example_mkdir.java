package main;

import java.io.File;
import java.io.IOException;

public class Example_mkdir {
	public static void main(String[] args) {
		File folder1 = new File("D:\\Dev\\GitHub\\Java\\Java_Exercises\\Java_67_OOP_FIle_Exercise");
		System.out.println(folder1.exists());
		File folder2 = new File("D:\\Dev\\GitHub\\Java\\Java_Exercises\\Java_67_OOP_FIle_Exercise\\test.txt");
		System.out.println(folder2.exists());

		File f1 = new File("D:\\Dev\\GitHub\\Java\\Java_Exercises\\Java_67_OOP_FIle_Exercise\\Directory 1");
		f1.mkdir();
		System.out.println(f1.exists());
		File f2 = new File("D:\\Dev\\GitHub\\Java\\Java_Exercises\\Java_67_OOP_FIle_Exercise\\Directory 1\\Directory 2\\Directory 3");
		f2.mkdirs();
		System.out.println(f2.exists());
		
		File tepTin1 = new File("D:\\Dev\\GitHub\\Java\\Java_Exercises\\Java_67_OOP_FIle_Exercise\\Directory 1\\Example1.txt");
		try {
			tepTin1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
