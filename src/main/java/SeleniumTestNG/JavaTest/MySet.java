package SeleniumTestNG.JavaTest;

import java.util.HashSet;
import java.util.Iterator;

public class MySet {

	public static void main(String args[]){
	HashSet<String> s1 = new HashSet();
	s1.add("a");
	s1.add("b");
	s1.add("a");
	Iterator<String> itr=s1.iterator();  
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	
	}
}
