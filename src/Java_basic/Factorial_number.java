package Java_basic;
import java.util.Scanner;
public class Factorial_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
Scanner sc= new Scanner (System.in);
int a = sc.nextInt();
int fact = a;

for (int i = 1; i < a; i++) {
	fact=fact*i;
	System.out.println(fact);
	
}
System.out.println(fact);


	}

}
