package lab4;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		Exercise1 El= new Exercise1();
		Scanner scrr= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scrr.nextInt();
		System.out.println("cube is" + El.getCube(n));
	}

		public int getCube(int n) {
			int cube= 0;
			while (n>0) {
				int p=n%10;
				cube+= (p*p*p);
				n= n/10;	
			}
			return cube;
		}
		

}
