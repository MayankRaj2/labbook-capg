package lab8;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		String sccr=new Scanner(System.in).nextLine();
		int flag=0;
		for(int i=1;i<sccr.length();i++)
		{
			if((int)sccr.charAt(i)<(int)(sccr.charAt(i-1)))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Positive String");
		}
		else
		{
			System.out.println("Not Positive String");
		}
	}
}
