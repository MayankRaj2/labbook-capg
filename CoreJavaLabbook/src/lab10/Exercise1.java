package lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exercise1 {
	

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fi=new FileInputStream("d:\\Capgemini\\source.txt");
		FileOutputStream fo = new FileOutputStream("d:\\Capgemini\\target.txt");
		Exc1_CopyDataThread c=new Exc1_CopyDataThread(fi,fo);
		c.start();
	}


}
