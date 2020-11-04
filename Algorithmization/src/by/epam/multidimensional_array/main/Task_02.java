package by.epam.multidimensional_array.main;

import by.epam.one_dimensional_array.main.Input;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task_02 {

	public static void main(String[] args) {

		int x;
		int y;

		x = Input.enterInt("Введите x: ");

		int[][] mass = new int[x][x];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 10);
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Элементы главной диагонали: ");

		for (int i = 0; i < mass.length; i++) {

			System.out.print(mass[i][i] + " ");

		}
		System.out.println();
		System.out.println();

		System.out.println("Элементы побочной диагонали: ");

		for (int i = 0; i < mass.length; i++) {

			System.out.print(mass[i][mass.length - 1 - i] + " ");

		}

	}

}
