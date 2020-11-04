package by.epam.multidimensional_array.main;

import java.util.Scanner;

import by.epam.one_dimensional_array.main.Input;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
               1 1 1 .... 1 1 1
               0 1 1 .... 1 1 0
               0 0 1 .... 1 0 0
               ................
               0 0 1 .... 1 0 0
               0 1 1 .... 1 1 0
               1 1 1 .... 1 1 1*/

public class Task_06 {

	public static void main(String[] args) {
		int n;
		n = Input.enterInt("Введите n - четное: ");
		
		int[][] mass = new int[n][n];

		for (int i = 0; i < mass.length; i++) {
			for (int j = i; j < mass.length - i; j++) {
				mass[i][j] = 1;
				mass[mass.length - i - 1][j] = 1;

			}

		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();

		}

	}
	
	public static int enterInt(String message) {

		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
			
		}

		value = sc.nextInt();

		return value;

	}

}
