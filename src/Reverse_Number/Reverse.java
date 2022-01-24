package Reverse_Number;

import java.awt.SystemTray;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		int number = a, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10; 
		//System.out.println(remainder);
		reverse = reverse * 10 + remainder; 
		//System.out.println(reverse);
		number = number/10;  
		//System.out.println(number);
		}  
		System.out.println("The reverse of the given number is: " + reverse);
	

	}
	

}
