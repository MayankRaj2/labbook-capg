package lab3;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String args[]) {
		Scanner scr= new Scanner(System.in);
		int numb;
		System.out.println("Enter the number of elements you want in the array");
		numb=scr.nextInt();
		int c[] = new int[numb];

		System.out.println ("Enter the elements of array");
		for(int e=0; e<numb; e++)
		{
			c[e]=scr.nextInt();
		}
		Exercise1 obj= new Exercise1();
		System.out.print (obj.secondSmallest(c,numb));
}

		public int secondSmallest( int k[], int num ) 
	       { 
			int i,j,temp;
			for (i=0; i<num; i++)
			 {
				for(j=0; j<num-1; j++)
				 {
					if(k[j]> k[j+1])
					 {
						temp= k[j];
						k[j]= k[j+1];
						k[j+1]= temp;
					 }
				 }
			 }
			System.out.println ("Second smallest number : ");
			 return k[1];
	  }
		

}
