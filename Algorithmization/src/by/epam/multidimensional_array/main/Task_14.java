package by.epam.multidimensional_array.main;

import by.epam.one_dimensional_array.main.Input;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.*/

public class Task_14 {

	public static void main(String[] args) {
		int m;
		int n;

		m = Input.enterInt("Введите m: ");
		n = Input.enterInt("Введите n: ");

		int[][] mass = new int[m][n];

		for (int i = 0; i < mass.length; i++) {
			int count = 0;

			for (int j = 0; j < mass.length; j++) {
				int number = (int) (Math.random() * 2);

				if (number >= 1 && count < (i + 1)) {
					mass[j][i] = 1;
					count++;
				} else {
					mass[j][i] = 0;
				}
			}

			if (count != (i + 1))
				i -= 1;
		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

	}

}
