package numbers;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		for(;;) {
			System.out.println("Enter the number");//4 = 4*3*2*1 = 24
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			int fact=1;
			for (int i = 1; i <=n; i++) {
				fact=fact*i;
			}
			System.out.println(fact);
		}
	}
}