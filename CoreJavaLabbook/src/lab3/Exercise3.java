package lab3;

public class Exercise3 {
	
	public int[] getSorted(int []a) {
		int a1[]=new int[a.length];
		
		for(int i=0;i<a.length;i++){
			int num=0;
			while(a[i]>0) {
				int p=a[i]%10;
				num=num*10+p;
				a[i]=a[i]/10;	
			}
			a1[i]=num;
		}
		return a1;
	}
	public static void main(String st[]) {
		Exercise3 e= new Exercise3();
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int []p =e.getSorted(a);
		for(int i=0; i<p.length;i++) {
			for(int j=i+1; j<p.length; j++) {
				if(p[i]> p[j]) {
					int  t;
					t= p[i];
					p[i]= p[j];
					p[j]= t;
				}
			}
			 System.out.println(p[i]);
		}
		

}
}