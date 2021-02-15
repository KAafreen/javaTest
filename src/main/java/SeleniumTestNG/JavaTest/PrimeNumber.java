package SeleniumTestNG.JavaTest;

public class PrimeNumber {

	public static void primeNo(int num){
		boolean flag = false;
		for(int i =2;i<=num/2;++i){
			if(num%i==0){
				flag = true;
				System.out.println("Not a prime");
				break;
			}
			else{
				System.out.println("Prime");
			}
			
		}
	}
	public static void main(String[] args){
		primeNo(23);
	}
}
