package lab8;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c= Calendar.getInstance();
		//System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println("Enter date in format DD-MM-YYYY");
		@SuppressWarnings("resource")
		String scr=new Scanner(System.in).next();
		String []arr=scr.split("\\-");
		if((Integer.parseInt(arr[2])-(c.get(Calendar.YEAR)))>0)
		{
			System.out.println("Invalid Date");
		}
		else
		{
			System.out.println("Duration is : ");
			
			System.out.println("Days: "+((c.get(Calendar.DATE))-Integer.parseInt(arr[0])));
			System.out.println("Months: "+(Integer.parseInt(arr[1])-(c.get(Calendar.MONTH)+1)));
			System.out.println("Year: "+((c.get(Calendar.YEAR))-Integer.parseInt(arr[2])));	
		}	
		}
}