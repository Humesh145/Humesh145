package Loop;

import java.util.Scanner;

public class For_loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
      for (int i=0 ; i <=a; i++){  
	   for (int j=i; j<a;j++){
		   {
			   System.out.print(" ");
			   		   }  
	   }
		   for (int j=1; j <=2*i+1; j++) {
			   System.out.print("*");
		   }
		   System.out.println();
   }
   for (int i=a ; i >=1; i--){  
	   for (int j=i; j<a;j++){
		   {
			   System.out.print(" ");
			   		   }  
	   }
		   for (int j=0; j <=2*i-1; j++) {
			   System.out.print("*");
		   }
		   System.out.println();
   }
	
}
}