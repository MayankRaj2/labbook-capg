package lab10;

import java.util.Date;

public class Exercise2 implements Runnable {

	@Override
	public void run() {
		
		while(true) {
			Date d=new Date(0);
			System.out.println(d);
			try {
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Exercise2 tr=new Exercise2();
		Thread t=new Thread(tr);
		t.start();
	}
}
