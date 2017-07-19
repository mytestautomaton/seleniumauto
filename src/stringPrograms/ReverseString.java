package stringPrograms;

import java.util.Scanner;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, reverse ="";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String");
		original = in.nextLine();
		
		int length = original.length();
		
		for (int i = length-1; i >=0; i--) {
			reverse = reverse+original.charAt(i);
			
		}
		System.out.println("reverse of entered string is : " + reverse);
	}

}
