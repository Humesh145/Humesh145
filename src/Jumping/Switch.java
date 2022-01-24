package Jumping;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	switch(a) {
	case 2355:
		System.out.println("A1");
		break;
	case 2356:
		System.out.println("A2");
		break;
	case 2357:
		System.out.println("A2e");
		break;
	case 2358:
		System.out.println("A72358");
		break;
		default:
			System.out.println("NA");
	}
}
}
