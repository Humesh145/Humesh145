	package Array_Concept;

public class Array_types {

	public static void main(String[] args) {
	int a[]= new int [7];
	int even = 0;
	int odd = 0;
     a[0]= 45 ; a[1]= 32;
	 
	 a[2]= 22;
	 a[3]= 55;
	 a[4]= 123;
	 a[5]= 21;
	 a[6]= 229;
	 
	// for (int i=0; i<7; i++){
	// System.out.println (a[i]);
	 
	 for (int n : a) {
		 //System.out.println (n);
		 
		 if (n%2==0) {
			 even++;
			
		} else {
			odd++;

		}
	}
	 System.out.println("Even number count is " + even );
	 System.out.println("odd number count is " + odd );
	}
}
	
	 

