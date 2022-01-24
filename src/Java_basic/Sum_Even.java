package Java_basic;
import java.util.*;
public class Sum_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i <=a; i++) {
			
			if (i%2==1) {
				
			
			sum = sum +i;
			}
			}
System.out.println(sum);
	}

}
