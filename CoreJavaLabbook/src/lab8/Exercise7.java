package lab8;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		String s=new Scanner(System.in).next();
		Exercise7 l=new Exercise7();
		boolean b=l.validate(s);
		if(b)
		{
			System.out.println("Validation Passed");
		}
		else
		{
			System.out.println("validation Failed");
		}
	}
	public boolean validate(String s)
	{
		String []arr=s.split("\\_");
		if(!(arr[arr.length-1].equals("job")))
		{
			return false;
		}
		else
		{
			if((s.length()-4)<8)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	}
	
	
}
