package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> s = new 	ArrayList <Integer>();
		List<Integer> s1 = new 	ArrayList <Integer>();
		
		s.add(12);
		s.add(32);
		s.add(42);
		s.add(62);
		s.add(52);
		System.out.println(s);
		
		s1.add(11);
		s1.add(31);
		s1.add(41);
		s1.add(63);
		s1.add(51);
		System.out.println(s1);
		
		Integer integer = s.get(3);
		System.out.println(integer);
		
		s.set(3, 88);
		System.out.println(s);
		
		int size = s.size();
		System.out.println(size);
		
		s.remove(4);
		System.out.println(s);
		
		int indexof = s.indexOf(88);
		System.out.println(indexof);
		
		boolean contains = s.contains(81);
		System.out.println(contains);
		
		
		
		
		
		
		
		
	}
	

}
