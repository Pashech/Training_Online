package by.epam.multidimensional_array.main;

import by.epam.one_dimensional_array.main.Input;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов

public class Task_13 {

	

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
			int i = 0;
			for (int j = 0; j < mass[i].length; j++) {
				for (i = 0; i < mass.length - 1; i++) {
					if (mass[i][j] > mass[i + 1][j]) {
						int temp;
						temp = mass[i][j];
						mass[i][j] = mass[i + 1][j];
						mass[i + 1][j] = temp;
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
		for (int i = mass.length - 1; i >= 0; i--) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		return mass;
	}

}
