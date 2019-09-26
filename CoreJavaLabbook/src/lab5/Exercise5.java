package lab5;

import java.util.Scanner;

public class Exercise5 extends Exception {
	
	

	private static final long serialVersionUID = 1L;

	public Exercise5(String s) {
		super(s);
	}



	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age= sc.nextInt();
		try {
			if(age<=15)
				throw new Exception("Fine");
			else
				System.out.println("Age : "+age);
		}   catch(Exception e) {
			System.out.println("Age of a person should be above 15");
		}
	}

}
