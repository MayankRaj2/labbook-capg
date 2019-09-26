package lab5;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String args[]) {
		Exercise3 ob= new Exercise3();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int no= sc.nextInt();
		ob.prime(no);
		
	}
	public void prime(int in){
		for(int i=2; i<=in;  i++) {
			int count= 0;
		    for(int j=2;  j<i; j++) {
			   if((i%j)==0) {
				  count++;
				  break;	
			   }
		    }
			if  (count==0) {
               System.out.println(i);
		}
	}		
		
	}
	
}
