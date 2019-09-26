package lab1;

import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int num=sc.nextInt();
		
		int x=0;
		int y=0;
		int z=0;
		for(int i=0; num>0; i++)
		{
			y= num%10;
			num= num/10;
			z= num%10;
			
			if(y<z){
				System.out.println("the number is not an increasing number");
				return;
			}
			else
				x++;
		}
		if(x>0){
			System.out.println("the number is increasing number");
		}

}
}
