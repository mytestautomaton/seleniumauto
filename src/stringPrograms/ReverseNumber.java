package stringPrograms;

public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number =1234;
		
		int revnum =0;
		int temp =0;
		
		while(number>0){
			temp =number%10;
			revnum = revnum*10+temp;
			number = number/10;
			
		}
		System.out.println(revnum);
	}

}
