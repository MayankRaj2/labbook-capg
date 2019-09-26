package lab9;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

	public Map<Integer, Integer> getSquares(int[] a){
		Map<Integer, Integer> m =new HashMap<Integer, Integer>();
		for(int i:a) {
			m.put(i, i*i);
		}
		return m;
	}
	public static void main(String[] args) {
		int[] a= {29,3,6,8,13,98};
		Exercise3 e=new Exercise3();
		System.out.println(e.getSquares(a));
	}

}
