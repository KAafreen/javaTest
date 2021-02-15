package SeleniumTestNG.JavaTest;

public class StringRules {

	public static void main(String args[]){
		String sample = "_ThoughtWorks1993";
		String check1 = "_qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
		String special = "!@#$%^&*()_+";
		if(check1.contains(String.valueOf(sample.charAt(0))) && !sample.contains(" ") ){
			for(int i =1; i<special.length();i++){
				if(special.contains(String.valueOf(sample.charAt(i)))){
					System.out.println("invalid");
					break;
				}
				else{
					System.out.println("valid");
				}
				
			}
		
		}
		else{
			System.out.println("invalid");
		}
		
	}
}
