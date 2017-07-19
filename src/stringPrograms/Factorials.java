package stringPrograms;

import java.util.Scanner;

public class Factorials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n, c, fact=1;
		
		System.out.println("Enter the number to factorial");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if (n<0) {
			
			System.out.println("Number should be non negative");
		} else{
			for (c = 1; c<=n; c++) {
				fact = fact*c;
				
			}
			System.out.println("Factorial of N is :" + fact);
		}
		
	}

}
