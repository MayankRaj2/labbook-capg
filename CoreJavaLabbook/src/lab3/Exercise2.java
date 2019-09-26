package lab3;

import java.util.Scanner;

public class Exercise2 {

public static void main(String[] args) {
		
		Scanner scrr=new Scanner(System.in);
		System.out.println("Enter the number: ");
		in = scrr.nextInt();
		int diff= calculateDifference(in);
		System.out.println(diff);
	}

	static int in;
	public static int calculateDifference(int num){
		int t=0, st=0;
		for(int i=1; i<=in; i++){
			t=t+i;
		}
		for(int i=1;i<=in;i++){
			int temp= i*i;
			st=st+ temp;
		}
		return st-t;
	}
	
}
