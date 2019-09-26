package lab3;

import java.util.Map;
import java.util.TreeMap;

public class Exercise4 {

	
public Map<Character, Integer> countCharacter(char[] ch) {
		
		Map<Character,Integer> map=new TreeMap<Character,Integer>();
		for(int i=0; i<ch.length; i++) {
			if(map.containsKey(ch[i])) {
				int p=map.get(ch[i]);
				map.put(ch[i], p+1);
			}
			else {
				map.put(ch[i], 1);
			}
		}
		return map;
	}
		
	public static void main(String ar[]) {
		Exercise4 e=new Exercise4();
		char []ch= {'k','b','t','a','C','k'};
		System.out.println(e.countCharacter(ch));
		
	}
}
