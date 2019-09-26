package lab1;

import java.util.Scanner;

public class Exercise1 {
	
public static void main(String[] args){
		
		Scanner scr=new Scanner(System.in);
		System.out.println(" Enter the number: ");
		num= scr.nextInt();
		int s= calculateSum(num);
		System.out.println(s);

    }
	 static int num=0;
	public static int calculateSum(int n){
		int s= 0;
		for(int i=1; i<=n; i++){
			
			if(((i%3)==0)||((i%5)==0))
			{
				s=s+i;
			}
		}
		return s;
	}
	
}