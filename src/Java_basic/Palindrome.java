package Java_basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		for (int x = 0; x <= b; x++) {
			
		int a =x, n=x; 
		int i = 0, j = 0;
		while (a > 0) {
			i = a % 10;
			
			j = (j * 10) + i;
			
			a = a / 10;
			
		}
		if (n == j) {
			System.out.println(j);
		
		}
		}
	}
	}
