package SeleniumTestNG.JavaTest;

public class myjava {
 
	
	//int a = 5;
	 myjava(){
	  this(5);
	  System.out.println(0);
	}
	
	public myjava(int i) {
		this(5,5);
		System.out.println(i);
	}

	public myjava(int i, int j) {
		System.out.println(i*j);
	}

	/*myjava(int a){
		a = 10;
	}
	
	myjava(int a, int b){
		
	}
	*/
	
	
	
	public static void main(String[] test) {
		myjava obj = new myjava();
		
	}

}
