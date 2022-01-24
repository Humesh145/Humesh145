package Overloading;

public class Over_loading {

	
	public void student_Details(int a) { 
		System.out.println(a);
		// TODO Auto-generated method stub

	}
	public void student_Details(String b) { 
		System.out.println(b);
		// TODO Auto-generated method stub

	}public void student_Details(float c , char d) { 
		System.out.println(c+d);
		// TODO Auto-generated method stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over_loading Stud = new Over_loading();
Stud.student_Details(1000);
Stud.student_Details("Smith");
Stud.student_Details(1.37f , 'a' );
	}

}