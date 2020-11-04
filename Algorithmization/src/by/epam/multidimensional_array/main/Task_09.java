package by.epam.multidimensional_array.main;

import by.epam.one_dimensional_array.main.Input;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.*/

public class Task_09 {

	public static void main(String[] args) {

		int max = 0;
		int number = 0;

		int m;
		int n;
		
		m = Input.enterInt("Введите m: ");
		n = Input.enterInt("Введите n: ");

		int[][] mass = new int[m][n];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 10);
				System.out.print(mass[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mass.length; i++) {
			int sum = 0;
			for (int j = 0; j < mass[i].length; j++) {
				sum += mass[j][i];
			}
			if (sum > max) {
				max = sum;
				number = i + 1;

			}
			System.out.print(sum + " ");

		}

		System.out.println("\n" + "Максимальная сумма " + max + " Столбец: " + number);

	}

}
