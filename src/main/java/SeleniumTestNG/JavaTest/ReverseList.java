package SeleniumTestNG.JavaTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList();
		List<Integer> list2 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		for (int i = 0; i < list1.size(); i++) {

			list2.add(list1.size() - i);
			Collections.reverse(list1);
			Object[] arr=list1.toArray();
			
		}

		System.out.println("------" + list2);
	}
	
}
