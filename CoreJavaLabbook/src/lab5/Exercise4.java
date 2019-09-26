package lab5;

import java.util.Scanner;

public class Exercise4 {

	
	public static void main(String[] args) {
		Scanner ssc=new Scanner(System.in);
		System.out.println("First Name");
		String ff= ssc.nextLine();
		System.out.println("Last Name");
		String ll= ssc.nextLine();
		try {
			if(ff.isEmpty() || ll.isEmpty()) {
				throw new NullPointerException();
			   }
			else
				System.out.println(ff+" "+ll);
		}catch(NullPointerException e) {
			System.out.println("First and Last name should not be empty");
		}
	}
}
