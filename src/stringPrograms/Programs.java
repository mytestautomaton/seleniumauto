package stringPrograms;

import java.util.Scanner;

public class Programs {

	public static void main(String[] args) {

		int x, y, temp;
		System.out.println("Enter x and Y values");
		
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		
		System.out.println("Before Swapping of " +x+ "and" +y);
		
		 x = x+y;
		 y= x-y;
		 x =x-y;
		 System.out.println("After swapping of 2 numbers :" + x+ " and "+y);

	}

}
