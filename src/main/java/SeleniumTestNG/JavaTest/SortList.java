package SeleniumTestNG.JavaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList();
		list1.add(5);
		list1.add(2);
		list1.add(300);
		list1.add(400);
		list1.add(50);
		
		
		for(int i=0;i<list1.size();i++){
			for(int j =0;j<list1.size();j++){
				
			
			if(list1.get(j)>list1.get(i)){
				list1.set(j, list1.get(i));
				list1.set(i, list1.get(j));
				
			}}
		}
		Collections.sort(list1);;
		System.out.println("-----"+list1);
	}
}
