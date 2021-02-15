package SeleniumTestNG.JavaTest;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateList {
	List<Integer> list1 = new ArrayList();
	List<Integer> list2 = new ArrayList();
	int len = list1.size();
	
	public List<Integer>dupli(){
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(4);
		list1.add(1);
		
		for(Integer i : list1){
			if(!list2.contains(i)){
				list2.add(i);
			}
		}
		System.out.println(list2);
		return list2;
		
	}
	
	public static void main(String[] args) {
		
		RemoveDuplicateList dupli = new RemoveDuplicateList();
		dupli.dupli();
	}
}
