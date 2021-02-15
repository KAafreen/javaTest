package thought.test;

/*Given a number, find the highest number which can be created by inserting digit 5 at any position in that number. Assume that numbers can be only in range [-2147483648 to 2147483647]. In case range exceeds, then print 0

Sample 0: 
Input: 999
Output: 9995 

Sample 1:
Input: 0 
Output: 50 

Sample 2:
Input: -999
Output: -5999

Sample 3:
Input: 2147483648
Output: 0*/

public class MyTest {

	public static boolean CheckRange(int number) {
		if (number > 2147483647 && number < -2147483648) {
			return false;
		}
		return true;
   
   
	}
	
	public static void insertNum(int number){
		String insertNum = new String();
		insertNum = String.valueOf(number);
		
		StringBuilder build = new StringBuilder();
		build.append(insertNum);
		String num1 = build.insert(0, "5").toString();
		String num2 = build.insert(5, "5").toString();
		if(num1>num2){
			
		}
		
	}

	public static void main(String args[]) {
		int num = 123;
		if (!CheckRange(num)) {
			System.out.println(0);
		}
	}
}

if(num>5) 
	insert 5 at first and last index, compare and find the highest 
	5176
	1765
	
if(num<5)
	insert 5 at first and last index, compare and find the highest
	-5176
	-1765
	
