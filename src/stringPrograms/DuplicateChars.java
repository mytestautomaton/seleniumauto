package stringPrograms;

public class DuplicateChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = null;
		String a[] = {"e","t","e","y","e","r","y"};
         int i,j,l;
      // find the lenght of the array string
         // iterating the 
         l = a.length;
         
         for ( i = 0; i < l; i++) {
			for ( j = i+1; j < l; j++) {
				if (a[i] ==a[j] ) {
					
					System.out.println(a[j]);
				}
			}
		}
         
	}

}
