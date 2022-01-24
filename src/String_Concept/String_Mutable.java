package String_Concept;

public class String_Mutable {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer ("Welcome to java");
				System.out.println(s);
		StringBuffer s1 = new StringBuffer ("Welcome to java");
				System.out.println(s1);
		
		
		
		
		StringBuffer append = s.append(s1);
		System.out.println(append);
		
		s.reverse();
		System.out.println(s);
		
		System.out.println(s);
	}

}
