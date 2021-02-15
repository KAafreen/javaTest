package SeleniumTestNG.JavaTest;

import java.util.Collections;
import java.util.List;

public class RemoveDuplicateString {
	
	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "Rachel";
		String s3 = new String();
		s1=s1.concat(s2);
		System.out.println(s1);
		char c;
		for(int i=0;i<s1.length();i++){
			c=s1.charAt(i);
			if(s3.indexOf(c)<0){
				s3+=c;
			}
		}
		System.out.println(s3);
		

	}

}
