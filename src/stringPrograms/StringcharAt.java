package stringPrograms;

public class StringcharAt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//

		char[] a = { 'a', 'm', 'a', 'l', 'a' };

		String name = new String(a);
		System.out.println("String is : " + name);

		// Char At method
		String s1 = "Selenium Automation";

		System.out.println(s1.charAt(9));

		// EqualignoreCase()

		System.out.println(s1.equalsIgnoreCase("seleniUm automation"));

		// Length -- size
		System.out.println("length of the S1 is  : " + s1.length());

		// replace. // replace with new character
		System.out.println(s1.replace('m', 'U'));

		// SubString

		System.out.println(s1.substring(4, 10));

		// ToLowercase
		// ToupperCase

		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

		// Trim
		String s2 = "Java Program ";
		System.out.println(s2.trim());

		// ValueOff
		char a1 = 'e';
		System.out.println("Value of : " + s1.valueOf(a1));

		// toString
		String s3 = "ramesh,kudikala,java";

		String[] s4 = s3.split(",");
		System.out.println(s4[0] + s4[1] + s4[2]);
		System.out.println(s4[1]);
		System.out.println(s4[2]);

	}

}
