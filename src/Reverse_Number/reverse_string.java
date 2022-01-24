package Reverse_Number;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " Hello World";
		String b = "";
		System.out.println(a.length());
		System.out.println(a.charAt(11));
		
		for (int i = a.length()-1; i >=0; i--) {
			b=b+a.charAt(i);
			
			
		}
		
		System.out.println("Origianl Char " + a );
		System.out.println("Reverse Char " + b );
	}

}
