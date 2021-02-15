package SeleniumTestNG.JavaTest;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

	public static void main(String agrs[]){
		HashMap<Integer,String> m1 = new HashMap();
		m1.put(1, "q");
		m1.put(2, "qa");
		for(Map.Entry m : m1.entrySet()){
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
	}
}
