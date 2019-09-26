package lab8;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise2 {
	public static void main(String[] args) throws Exception {
		
	FileReader fr= new FileReader("java.txt");
	BufferedReader br=new BufferedReader(fr);
	int i=1;
	String str;
	while((str=br.readLine()) != null)
	{
		System.out.println("Line "+i+" "+str);
		i++;
	} 
}
}