package pr1;

import java.util.Scanner;

public class CircularArRottn {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		int q=scn.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		int[] query=new int[q];
		for (int i = 0; i < query.length; i++) {
			query[i]=scn.nextInt();
		}
		int[] r=circularArrayRotation(arr, k, query);
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
		scn.close();
	}

	public static int[] circularArrayRotation(int[] arr, int rot, int[] queries) {
		rot = rot % arr.length;

		for (int r = 1; r <= rot; r++) {

			int temp = arr[arr.length - 1];

			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}

			arr[0] = temp;

		}
		int[] na=new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			na[i]=arr[queries[i]];
		}
		return na;

	}

}
