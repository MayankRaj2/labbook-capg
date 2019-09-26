package lab1;

import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String[] args){
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=scr.nextInt();
		int diff= calculateDifference(num);
		System.out.println(diff);
		
	}
	
	static int num;
	public static int calculateDifference (int n) {
		
		int x=0;
		int y=0;
		for(int i=1;i<=n;i++){
			x=x+i;
		}
		for(int i=1;i<=n;i++){
			int temp=i*i;
			y=y+temp;
		}
		return y-x;
	}


}
