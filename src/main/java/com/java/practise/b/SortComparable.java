package com.java.practise.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortComparable {

	public static void main(String[] args){
		List<Student> st = new ArrayList();
		st.add(new Student(12,"test1",993));
		st.add(new Student(5,"test2",344));
		st.add(new Student(66,"test3",556));
		Collections.sort(st);  	
	}
}
