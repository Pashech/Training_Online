package by.epam.multidimensional_array.main;

import by.epam.one_dimensional_array.main.Input;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task_12 {

	

	public static void main(String[] args) {
		int n;
		int m;
		
		n = Input.enterInt("Введите n");
		m = Input.enterInt("Введите m");

		int[][] mass = new int[n][m];

		Init.initArray(mass);

		System.out.println();

		SortedArray(mass);

		System.out.println();

		DescendingSort(mass);
	}
	
	public static int[][] SortedArray(int[][] mass) {

		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass[i].length - 1; j++) {
					if (mass[i][j] > mass[i][j + 1]) {
						int temp;
						temp = mass[i][j];
						mass[i][j] = mass[i][j + 1];
						mass[i][j + 1] = temp;
						sorted = false;
					}
				}

			}
		}
		System.out.println("Отсортированный массив по возрастанию: ");
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		return mass;
	}

	public static int[][] DescendingSort(int[][] mass) {

		System.out.println("Отсортированный массив по убыванию: ");
		for(int i = 0; i < mass.length; i++) {
			for(int j = mass[i].length - 1; j >= 0; j--) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		return mass;
	}

}
