package pr1;

import java.util.Scanner;

public class LibraryFine {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int d1 = scn.nextInt();
		int m1 = scn.nextInt();
		int y1 = scn.nextInt();
		int d2 = scn.nextInt();
		int m2 = scn.nextInt();
		int y2 = scn.nextInt();
		System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
	}

	public static int libraryFine(int dr, int mr, int yr, int dd, int md, int yd) {
		int fine = 0;

        if (yd < yr) {
            fine = 10000;
            return fine;
        } else if (yd==yr&&mr > md) {
            fine = (mr - md) * 500;
            return fine;
        } else if (yd==yr&&mr==md&&dr > dd) {
            fine = (dr - dd) * 15;
            return fine;
        }
        return fine;

	}

}
