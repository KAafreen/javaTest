package SeleniumTestNG.JavaTest;

public class IntegerReversal {
	int reversed = 0;
	public void reverseInt(int num){
		while(num != 0) {
		int digit = num % 10;
		System.out.println("---digit---"+digit);
        reversed = reversed * 10 + digit;
        num /= 10;
		System.out.println("---rev---"+reversed);
		System.out.println("--num--"+num);}
	}

	public static void main(String args[]){
		IntegerReversal obj = new IntegerReversal();
		obj.reverseInt(1234);
	}
}
