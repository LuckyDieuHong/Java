package EX;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Delete_file {
	
	public static void xoaFile(File fx)
	{
		if(fx.isFile())
		{
			System.out.println("Deleted: "+fx.getAbsolutePath());
			fx.delete();
		}
		else if(fx.isDirectory())
		{
			File[] arrayListFile = fx.listFiles();
			for (File f: arrayListFile)
			{
				xoaFile(f);
			}
			System.out.println("Deleted: "+fx.getAbsolutePath());
			fx.delete();
		}
			
	}
	
	public static void xoaFile2(File fx)
	{
		Path p = fx.toPath();
		if(fx.isFile())
		{
			System.out.println("Deleted :"+fx.getAbsolutePath());
			try {
				Files.deleteIfExists(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(fx.isDirectory())
		{
			File[] arrayListChildFile = fx.listFiles();
			for(File f : arrayListChildFile)
			{
				xoaFile2(f);
			}
			
			try {
				System.out.println("Deleted :"+fx.getAbsolutePath());
				Files.deleteIfExists(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
	}
	
	
	public static void main(String[] args) {
		
		File f0 = new File("D:\\Dev\\GitHub\\Java\\Java_Exercises\\Java_69_OOP\\1.f0");
		File f0_1 = new File("D:\\Dev\\GitHub\\Java\\Java_Exercises\\Java_69_OOP\\1.f0_1");
		File f = new File("D:\\Dev\\GitHub\\Java\\Java_Exercises\\Java_69_OOP\\deleteme.txt");
		/*
		f0_1.delete();//neu la thu muc rong
		f.delete();
		Delete_file.xoaFile(f0);
		*/
		
		Path p = f.toPath();
		Path p0 = f0.toPath();
		Path p0_1 = f0_1.toPath();
		
		try {
			Files.deleteIfExists(p);
			//Files.deleteIfExists(p0);//Directory is not null
			Files.deleteIfExists(p0_1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Delete_file.xoaFile2(f0);
		
	}
}
