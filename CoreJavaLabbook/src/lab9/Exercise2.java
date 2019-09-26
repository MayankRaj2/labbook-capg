package lab9;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {

public static void main(String[] args) {
		
		char[] c= {'s','u','e','e','d','d','i','a','r'};
		Exercise2 e=new Exercise2();
		Map<Character, Integer> m=e.countCharacter(c);
		System.out.println(m);
		}

		public Map<Character, Integer> countCharacter(char[] c){
		
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for(int i=0;i<c.length;i++)
		{
			if(m.containsKey(c[i])) 
			{
				int a=m.get(c[i]);
				m.put(c[i], a+1);
			}
			else 
			{
				m.put(c[i], 1);
			}
		}
		return m;
	}
	
}
