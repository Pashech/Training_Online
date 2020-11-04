package by.epam.multidimensional_array.main;

import java.util.Scanner;

import by.epam.one_dimensional_array.main.Input;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task_03 {

	

	public static void main(String[] args) {
		int x;
		int y;
		
		x = Input.enterInt("Введите колличество строк матрицы: ");
		y = Input.enterInt("Введите колличество столбцов матрицы: ");

		int[][] mass = new int[x][y];

		int k;
		int p;

		k = enterInt("Enter k: ");
		p = enterInt("Enter p: ");

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 10);
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mass.length;) {

			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[k - 1][j] + " ");

			}
			break;

		}
		System.out.println();

		for (int i = 0; i < mass.length; i++) {

			System.out.print(mass[i][p - 1] + " ");
		}

	}
	
	@SuppressWarnings("resource")
	public static int enterInt(String message) {
		int value;
		
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
