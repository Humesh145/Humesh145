import java.util.Scanner;

public class Armstrong_number {
public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
		int temp = i , a = 0 , ans = 0;
				while (temp>0) {
			a=temp % 10;
			ans=ans+(a*a*a);
			temp=temp/10;
		}
		if (i == ans) {
			System.out.print(i+" ");
			
		}
		}
		}
		}
			
				



