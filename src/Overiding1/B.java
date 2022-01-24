package Overiding1;

public class B extends A {
	
	public static void Team() {
		
		System.out.println("India A");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Team();
		A.Team();

	}

}
