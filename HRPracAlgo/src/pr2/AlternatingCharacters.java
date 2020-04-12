package pr2;

import java.util.Scanner;

public class AlternatingCharacters {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		int r=minStepD(s);
		System.out.println(r);
	}

	public static int minStepD(String s) {
		int c=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1))
				c++;
		}
		return c;
	}

}
