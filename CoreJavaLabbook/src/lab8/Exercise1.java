package lab8;

import java.util.StringTokenizer;

public class Exercise1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="2 7 678 44 1";
		int sum= 0;
		StringTokenizer s11 =new StringTokenizer(str);
		while(s11.hasMoreTokens())
		{
			int a=Integer.parseInt(s11.nextToken());
			System.out.println(a);
			sum+=a;
		}
		System.out.println("Sum : "+sum);
	}

}
