package Array_Concept;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class rary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "for the people by the people to the people";
		String[] split = s.split(" ");
		
		Map<String , Integer> a = new LinkedHashMap<String, Integer>();
		 for (String string : split) {
			if (a.containsKey(string)) {
				Integer value = a.get(string);
				value++;
				a.put(string, value);
				
			}
			else {
				a.put(string, 1);
			}
		}
		 Set<Entry<String, Integer>> entrySet = a.entrySet();
		 for (Entry<String, Integer> entry : entrySet) {
			
		
		 if (entry.getValue()>1) {
			 
			 System.out.println(entry);
		 }
		 if (entry.getValue()<=1) {
			System.out.println(entry);
		}
		 }
		

	}

}
