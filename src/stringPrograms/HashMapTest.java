package stringPrograms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> hmp = new Hashtable<>();
		hmp.put(10, "Selenium");
		hmp.put(101, "testing");
		//hmp.put(null, "Selenium");
		hmp.put(102, "Java");
		
		for (Map.Entry m : hmp.entrySet()) {
			
			System.out.println(m.getKey()+" " + m.getValue());
		}

	}

}
