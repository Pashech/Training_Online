package by.epam.multidimensional_array.main;

import by.epam.one_dimensional_array.main.Input;

// Найти положительные элементы главной диагонали квадратной матрицы.

public class Task_10 {

	public static void main(String[] args) {
		int m;
		m = Input.enterInt("Введите m: ");

		int[][] mass = new int[m][m];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 10 - 3);
				System.out.print(mass[i][j] + "\t ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("Положительные элементы главной диагонали матрицы: ");
		for (int i = 0; i < mass.length; i++) {
			if (mass[i][i] >= 0) {
				System.out.print(mass[i][i] + " ");
			}

		}
		System.out.println();

	}

}
