package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
*/
public class Task_08 {

	public static void main(String[] args) {

		int[] mass = new int[6];
		Input.initArray(mass);

		System.out.println();
		sum1(mass);
		sum2(mass);
		sum3(mass);

	}

	static void sum1(int[] mass) {
		int k = 0;
		int n = 3;
		int sum = 0;

		for (int i = k; i < n; i++) {
			sum += mass[i];

		}
		System.out.println("Сумма 1 - 3 элементов = " + sum);
	}

	static void sum2(int[] mass) {
		int k = 2;
		int n = 5;
		int sum = 0;

		for (int i = k; i < n; i++) {
			sum += mass[i];

		}
		System.out.println("Сумма 3 - 5 элементов = " + sum);
	}

	static void sum3(int[] mass) {
		int k = 3;
		int n = 6;
		int sum = 0;

		for (int i = k; i < n; i++) {
			sum += mass[i];

		}
		System.out.println("Сумма 4 - 6 элементов = " + sum);
	}

}
