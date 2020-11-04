package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

/*Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
Определить также, сколько четных цифр в найденной сумме. 
Для решения задачи использовать декомпозицию.*/

public class Task_16 {

	public static void main(String[] args) {

		int number;
		int sum;

		number = Input.enterInt("Введите число: ");

		sum = sumOddNumbers(number);

		System.out.println("Сумма нечетных чисел = " + sum);

		evenNumbers(sum);

	}

	static void evenNumbers(int sum) {
		int count = 0;
		int temp = 0;

		while (sum != 0) {
			temp = sum % 10;
			if (temp % 2 == 0) {
				count++;
			}
			sum /= 10;
		}
		System.out.print("Четных чисел в сумме: " + count);
	}

	static int sumOddNumbers(int n) {

		int count = length(n);
		int sum = 0;
		int[] mass = new int[count];

		for (int i = 0; i < mass.length; i++) {
			mass[i] = n % 10;
			n /= 10;
		}

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 != 0) {
				sum += mass[i];
			}
		}
		return sum;
	}

	static int length(int number) {

		int count = 0;

		while (number != 0) {

			number /= 10;
			count++;
		}
		return count;
	}

}
