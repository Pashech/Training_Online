package by.epam.one_dimensional_array.main;

import by.epam.multidimensional_array.main.Init;

/*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами*/

public class Task_06 {

	public static void main(String[] args) {

		int size;
		size = Input.enterInt("Введите размер массива: ");

		int[] mass = new int[size];

		Input.initArray(mass);

		int sum = 0;
		for (int i = 2; i < mass.length; i++) {

			if (isPrime(i)) {
				sum += mass[i - 1];
				//System.out.println(sum);
			}

		}
		System.out.println("Сумма чисел, порядковый номер котрых является простымчислом = " + sum);

	}

	static boolean isPrime(int a) {
		if (a == 1) {
			return false;
		}

		int temp = 0;

		for (int i = 2; i * i <= a; i++) {
			temp = a % i;

			if (temp == 0) {
				return false;
			}
		}
		return true;
	}
}
