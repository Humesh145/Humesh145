package String_Concept;

public class String_types {

	public static void main(String[] args) {
		String s = "Welcome to Java World" ;
		int length = s.length();
		System.out.println(length);
		
		boolean empty = s.isEmpty();
		System.err.println(empty);
		
		String s1 = "Welcome to java World";
		boolean contentEquals = s.equals(s1);
		System.out.println(contentEquals);
		
		String upperCase = s.toUpperCase();
			System.out.println(upperCase);
		
			
			String lowerCase = s.toLowerCase();
			System.out.println(lowerCase);
			
			boolean startwith = s.startsWith("");
			System.out.println(startwith);
			
			boolean endwith = s.endsWith("W");
			System.out.println(endwith);




	}

	
}
