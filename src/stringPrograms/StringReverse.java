package stringPrograms;

public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "ramesh";
		
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();
		
		for (int i = 0; i < input1.length(); i++) {
			System.out.println(input1.charAt(i));
		}
		
		
	}

}
