package by.epam.multidimensional_array.main;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task_15 {

	public static void main(String[] args) {

		int[][] mass = new int[7][5];
		System.out.println("Изначальная матрица: ");
		for (int i = 0; i < mass.length; i++) {

			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 100);

				System.out.print(mass[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println();

		int max;
		max = mass[0][0];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] > max) {
					max = mass[i][j];

				}

			}

		}

		System.out.println("максимальный элемент: " + max);
		
		System.out.println("\n" + "измененная матрица: ");
		
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] % 2 != 0) {
					mass[i][j] = max;
				}
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

	}

}
