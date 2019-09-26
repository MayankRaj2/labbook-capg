package lab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Exercise1 {
	
public ArrayList<String> getValues(HashMap<Integer, String> m) {
		
		TreeSet<String> t=new TreeSet<String>(m.values());

		ArrayList<String> l=new ArrayList<String>(t);
		return l;
	}
	public static void main(String [] args) {
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		m.put(20, "Sa");
		m.put(22, "uma");
		m.put(21, "ojha");
		Exercise1 e=new Exercise1();
		System.out.println(e.getValues(m));
	}

}
