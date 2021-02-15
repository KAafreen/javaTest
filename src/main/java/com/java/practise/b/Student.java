package com.java.practise.b;

public class Student implements Comparable<Student>{

	int age;
	String name;
	int empNo;
	
	public Student(int age, String name, int empNo){
		this.age=age;
		this.name=name;
		this.empNo=empNo;
	}
	
	public int compareTo(Student st){
		if(age==st.age)
		return 0;
		else if (age>st.age)
			return 1;
		else if(age<st.age);
		return -1;
	}
}
