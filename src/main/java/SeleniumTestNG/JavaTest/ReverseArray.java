package SeleniumTestNG.JavaTest;

public class ReverseArray {

	public static void main(String[] args) {
		int array1[] = {1,2,3,4,5};
		int size=array1.length;
		int[] array2 = new int[size];
		for(int i=0;i<size;i++){
			array2[size-i-1]=array1[i];
			int arra[] = {1,2,3,4};
			int s = arra.length;
			int arr2[] = new int[s];
			for( i=0;i<s;i++){
				arr2[s-i-1] = arr[i];
			}
			
			
		}
		for(int i=0;i<array2.length;i++){
		System.out.println(array2[i]);}
		
	}
}
