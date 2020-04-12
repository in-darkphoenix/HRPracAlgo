package pr3;

import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(minStepAnagram(s));
	}

	public static int minStepAnagram(String str) {
		int len = str.length(), count = 0;
		if (len % 2 != 0)
			return -1;
		String s1 = str.substring(0, len / 2);
		String s2 = str.substring(len / 2, len);
		char[] s1Chars = s1.toCharArray();
		for (char c : s1Chars) {
			int index = s2.indexOf(c);
			if (index == -1) {
				count++;
			} else {
				s2 = s2.substring(0, index) + s2.substring(index + 1);
			}
		}
		return count;

	}

}
