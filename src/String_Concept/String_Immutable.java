package String_Concept;

public class String_Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to Java";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		String s1 = "Welcome to Java";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		String concat = s.concat(s1);
		System.out.println(concat);
		
		System.out.println(s1);

	}

}
