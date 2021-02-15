package SeleniumTestNG.JavaTest;

import java.util.Arrays;

public class replaceWordsTest {

	public static String replaceWords(String S1) {
		StringBuffer buffer = new StringBuffer(S1);
		for (int i = 0; i < S1.length() - 1; i++) {
			if (Character.isLetter(buffer.charAt(i))) {
				buffer.setCharAt(i, '*');
			}
		}
		String s1 = buffer.toString();
		char C1[] = s1.toCharArray();
		return removeDuplicate(C1);
	}

	public static String removeDuplicate(char[] S) {
		int j = 0;
		for (int i = 1; i < S.length; i++) {
			if (S[j] != S[i]) {
				j++;
				S[j] = S[i];
			}
		}
		String str = new String(Arrays.copyOfRange(S, 0, j + 1));
		return str;
	}

	public static void main(String[] args) {
		System.out.println(replaceWords("Let's meet l8r 2nite?"));
	}

}
