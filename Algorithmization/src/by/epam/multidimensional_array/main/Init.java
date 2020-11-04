package by.epam.multidimensional_array.main;

import java.util.Random;

public class Init {

	public static void initArray(int[][] mass) {

		if (mass == null) {
			return;
		}

		Random rand = new Random();
		System.out.println("Original array: ");
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int)(Math.random() * 10);
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
	}

}
