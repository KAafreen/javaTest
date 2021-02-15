package SeleniumTestNG.JavaTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

	public static void main(String args[]){
		String [] arr = {"a","b","c","d"};
		List<String> li = new ArrayList();
		for(String ele : arr){
			li.add(ele);
		}
		
		System.out.println(li);
		
		String [] arr2;
		arr2 = li.toArray(new String [li.size()]);
	}
}
