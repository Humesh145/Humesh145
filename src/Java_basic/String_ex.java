package Java_basic;

import java.util.*;
import java.util.Map.Entry;

public class String_ex {

	public static void main(String[] args) {
		String s="of the people by the people to the people";	
		String[] split = s.split(" ");	
	
		//System.out.println(System.identityHashCode(s));
		//System.out.println(System.identityHashCode(split[3]));
		//System.out.println(split[1]);
		
		//for (String string : split) {
		//	System.out.println(string);
		//}
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	
		
		for (String word : split) {
			
			if (map.containsKey(word)) {
			Integer value = map.get(word);
			value++;
			map.put(word, value);
			}
			else {
			map.put(word, 1);
			
				}
		}
		
System.out.println(map);

Set<Entry<String, Integer>> entrySet = map.entrySet();
System.out.println(entrySet);

for (Entry<String, Integer> entry : entrySet) {

	if (entry.getValue()>1) {
		System.out.println(entry);
		
	}
}


	
}


	}

