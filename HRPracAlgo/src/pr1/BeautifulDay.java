package pr1;

import java.util.Scanner;

public class BeautifulDay {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int i=scn.nextInt();
		int j=scn.nextInt();
		int k=scn.nextInt();
		System.out.println(btfDay(i,j,k));
	}
	
	private static int btfDay(int i, int j, int k) {
		int count=0;
		for(int itr=i;itr<=j;itr++) {
			int r=rev(itr);
			int d=(Math.abs(itr-r))%k;
			if(d==0)
				count++;
		}
		return count;
	}

	public static int rev(int n) {
		int temp=0;
		int b=0;
		while(n>0) {
			b=n%10;
			temp=temp*10+b;
			n=n/10;
		}
		return temp;
	}

}
