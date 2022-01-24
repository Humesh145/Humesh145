package Loop;

import java.util.Scanner;

public class For_loop {

	
	
public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();	    
			for (int i; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}

