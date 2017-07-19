package stringPrograms;

public class StringMethods {

	public static void main(String[] args) {

		// String literal Object
		String name = "Ramesh"; // name will be store in the heap memory.// Fast
		String na = "Ramesh";

		String name1 = new String("Ramesh"); // Slow// Stored in the Constant
												// String pool // Special memory
												// area.
		String names = new String("Ramesh");

		/*
		 * System.out.println(name.concat("Kudikala"));
		 * System.out.println(name1.concat("Kudikala"));
		 */

		// Using + operator:
		System.out.println(name + name1);
		// Comparision:

		/*
		 * ==     reference comparision
		 * .equal  // Content Comparision
		 */

		System.out.println(name == na); // True
		System.out.println(name.equals(na));// True
		
		System.out.println(name == name1); // True
		System.out.println(name.equals(name1)); // False
		
		System.out.println(name1 == names); //True
		System.out.println(name1.equals(names)); // True
	}

}
