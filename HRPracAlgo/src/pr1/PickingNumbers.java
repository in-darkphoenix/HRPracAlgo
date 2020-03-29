package pr1;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.parallelSort(arr);
		System.out.println(pNum(arr));
	}

	private static int pNum(int[] arr) {
		int ml = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int l = 1; // cause we already started with first element and starting next onward
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] - arr[j] <= 1 && arr[i] - arr[j] >= -1) {
					l++;
				}
			}
			if (ml < l)
				ml = l;
		}
		return ml;
	}

}
