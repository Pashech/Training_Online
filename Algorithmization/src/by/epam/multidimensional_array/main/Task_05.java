package by.epam.multidimensional_array.main;

import java.util.Scanner;

import by.epam.one_dimensional_array.main.Input;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

1 1 1 ....1 1 1
2 2 2 ....2 2 0
3 3 3 ....3 0 0
...............
...............
n-1 n-1 0.... 0 0 0
n 0 0 .... 0 0 0*/

public class Task_05 {

	public static void main(String[] args) {
		int n;
		n = Input.enterInt("Введите n - четное: ");

		int[][] mass = new int[n][n];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length - i; j++) {
				mass[i][j] = i + 1;
				System.out.print(mass[i][j] + " ");
			}

			for (int j = n - i; j < mass.length; j++) {
				mass[i][j] = 0;
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
