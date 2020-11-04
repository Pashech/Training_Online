package by.epam.multidimensional_array.main;

import by.epam.one_dimensional_array.main.Input;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task_01 {

	public static void main(String[] args) {
		int x;
		int y;
		
		x = Input.enterInt("Введите колличество строк матрицы: ");
		y = Input.enterInt("Введите колличество столбцов матрицы: ");
		int[][] mass = new int[x][y];
		
		System.out.println("Матрица\n");

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 10);
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j += 2) {
				if (mass[0][j] > mass[mass.length - 1][j]) {
					System.out.print(mass[i][j] + " ");
				}

			}
			System.out.println();
		}

	}

}
