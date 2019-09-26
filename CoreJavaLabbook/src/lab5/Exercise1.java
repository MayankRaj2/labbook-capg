package lab5;

import java.util.Scanner;

public class Exercise1 {
	
	
	public static void main(String args[]) {
		Scanner scc=new Scanner(System.in);
		System.out.println ("Enter red or yellow or green to check Signal");
		String str=scc.nextLine();
		switch(str) 
		{
			case "Red": 
				System.out.println("Stop");
				break;
			case "Yellow":
				System.out.println("Ready");
				break;
			case "Green":
				System.out.println("Go");
				break;
			default: 
				System.out.println("Wrong Choice");
		}

	}
}
