package def;

import java.io.File;
import java.io.RandomAccessFile;

public class FileHandling {
	public static void main(String args[]){
		RandomAccessFile raf = null;
		try {
			File f = new File("D:\\file.txt");
			 raf = new RandomAccessFile(f,"rw");
			 String str = null;
			 while((str = raf.readLine())!=null) {
				 System.out.println(str);
			 }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			raf.close();}catch(Exception e) {e.printStackTrace();}
			System.out.println("this is finally");
		}
	}
}


import java.io.File;
import java.io.*;

public class FileHandling {
	public static void main(String args[]) {
		File f = new File("/home/nikhilghind/nikhil.txt");
		File f2 = new File("/home/nikhilghind/output.txt");
		FileWriter fr = null;
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(f,"rw");
//			fr = new FileWriter(f2);
//			int i;
//			while((i=raf.read())!=-1) {
//				fr.write((char)i);
//			}
			raf = new RandomAccessFile(f2,"rw");
			raf.seek(5);
			System.out.println(raf.getFilePointer());
			System.out.println(raf.read());
			System.out.println(raf.getFilePointer());
		}catch(FileNotFoundException fe) {
			System.out.println(fe);	
		}catch(Exception e) {
			System.out.println("Unknown Exception");
		}
		finally {
			try {
				if(fr!=null) {
					fr.close();
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}