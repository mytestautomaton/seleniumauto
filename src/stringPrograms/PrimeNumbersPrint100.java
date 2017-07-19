package stringPrograms;

public class PrimeNumbersPrint100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int limit =100;
		
		for (int i = 1; i < limit; i++) {
			 boolean isPrime = true;
			 
			 for (int j = 2; j <i; j++) {
				
				if (i%j ==0) {
					isPrime = false;
					break;
				}
			}
			 if (isPrime) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
