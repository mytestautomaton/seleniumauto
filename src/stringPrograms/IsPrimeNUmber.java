package stringPrograms;

import java.util.Scanner;

public class IsPrimeNUmber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		boolean isPrime = true;
		@SuppressWarnings("resource")
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num = in.nextInt();
		
		for (int i = 2; i < num/2; i++) {
			
			temp = num%i;
			if (temp==0) {
				
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Given number is prime :"+num);
		}
		else{
			System.out.println("not prime");
		}
		
	}

}
