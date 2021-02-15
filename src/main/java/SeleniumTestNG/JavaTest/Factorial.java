package SeleniumTestNG.JavaTest;

public class Factorial {
	int a=1;
	
	
	public int fac(int size){
		for(int i=1;i<=size;i++){
			 a = a*i;
			System.out.println("a: "+a +" i:"+i);
		}
		
		return a;
	}
	public static void main(String[] args) {
		Factorial fab = new Factorial();
		System.out.println("-----"+fab.fac(10));
		

	}

}
