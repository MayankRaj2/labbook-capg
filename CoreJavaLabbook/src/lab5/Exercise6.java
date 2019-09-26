package lab5;

import java.util.Scanner;

public class Exercise6 {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary of the Employee");
		double salary=sc.nextDouble();
		try {
			if(salary<3000)
				throw new Exception("Good");
			else
				System.out.println("Salary : "+salary);
		}catch(Exception e) {
			System.out.println("Salary less than 3000.");
		}
	}

}
