package stringPrograms;

public class Polindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = new int[]{121,13,34,11,22,54};
		
		for (int i = 0; i < numbers.length; i++) {
			
			int number = numbers[i];
			int reverseNumber = 0;
			int temp =0;
			
			while(number>0){
				
				temp = number %10;
				number = number/10;
				reverseNumber = reverseNumber*10+temp;
						
			}
			if (numbers[i] == reverseNumber) {
				System.out.println(numbers[i]);
			}
			else{
				System.out.println("fail");
			}
		}
	}

}
