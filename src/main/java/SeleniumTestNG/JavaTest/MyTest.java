package SeleniumTestNG.JavaTest;

public class MyTest {

	int[] array1 = { 7, 3, 2, 4, 1, 6, 8, 5, 9 };
	int digit = 9;

	public void arraySum() {
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array1[i] != array1[j] && (array1[i] + array1[j]) == digit) {
					System.out.println("{" + array1[i] + "," + array1[j] + "}");
				}
			}
		}

	}

	public static void main(String args[]) {

		MyTest test = new MyTest();
		test.arraySum();

	}
}
