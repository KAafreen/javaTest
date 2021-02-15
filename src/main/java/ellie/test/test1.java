package ellie.test;

//input = "a$bc%def"
//output = "f$ed%cba"

//[2,4,3,0,0,22,0,33,88]
//[0,0,0,2,4,3,22,33,88]
public class test1 {

	/*public static void reverseString(){
		String S1 = "a$bc%def";
		int size = S1.length();
		String rev = "";
		for(int i =0;i<size;i++){
			char ch = S1.charAt(i);
			if(!(ch<'a' && ch>'z')){
			  rev = rev + S1.charAt(size-i-1);
			}
			else{
				rev = rev + S1.charAt(i);
			}
		}
		System.out.println(rev);
		
	}
	
	public static void main (String args[]){
		reverseString();
	}*/
	
	/*public static void findZero(int[] arr1){
		int size = arr1.length;
		int[] arr2 = new int[size];
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (arr1[i] == 0) {
				arr2[index] = arr1[i];
				index++;
			}
		}
		for (int i = 0; i < size; i++) {
			if (arr1[i] != 0) {
				arr2[index] = arr1[i];
				index++;
				}
			}
		for (int i = 0; i < size; i++) {
		System.out.print(arr2[i]);
		}
	}
*/
	
	/*public static boolean  palindrom(String S1) {
		int index = S1.length();
		for (int i = 0; i < S1.length(); i++) {
			if (S1.charAt(i) != S1.charAt(index - 1)) {
				System.out.println("Not a palindrom");
				break;
			}
			index--;
		}
		System.out.println("A palindrom");
	}*/

	public static void main(String[] args){
		int[] arr1 = {2,4,3,0,0,22,0,33,88};
		//findZero(arr1);
		//palindrom("malayalam");
	}
}
