package lab1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to check");
		Scanner scr = new Scanner(System.in);
		int num= scr.nextInt();
		int base=2;
		
		for(int i=1; i<num/2; i++) {
			if(Math.pow(base,i)== num) {
				System.out.println("Entered Number is a power of 2");
				return;
			}
		}
		System.out.println("Entered Number is not a power of 2");
	}
}
