package Java_basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		for (int x = 0; x <= b; x++) {
			
		int a=x, n = a; 
		int i = 0, j = 0;
		while (a > 0) {
			i = a % 10;
			
			j = j+(i*i*i);
			
			a = a / 10;
			
		}
		if (n == j) {
			System.out.println(j);
		
		}
		}
	
	}}
	


