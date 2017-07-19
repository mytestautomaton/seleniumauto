package stringPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> al = new ArrayList<>();
		al.add("Selenium");
		al.add("Java");
		al.add("Jmeter");
		al.add("Qtp");
		
		Collections.sort(al);
		
		Iterator<String> it = al.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
