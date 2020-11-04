package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, 
возведенных в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. 
Для решения задачи использовать декомпозицию.*/

public class Task_14 {

	public static void main(String[] args) {

		int k;

		k = Input.enterInt("Введите число: ");

		checkArmstrong(k);

	}

	static void checkArmstrong(int k) {
		for (int i = 1; i <= k; i++) {
			if (armstrong(i)) {
				System.out.println(i + " ");
			}
		}
	}

	static int length(int n) {

		int count = 0;

		while (n != 0) {

			n /= 10;
			count++;
		}
		return count;
	}

	static boolean armstrong(int n) {
		int count = length(n);
		int result = 0;
		int oldValue = n;

		for (int i = 0; i < count; i++) {
			result += (Math.pow(n % 10, count));
			n /= 10;
		}
		return result == oldValue;
	}

}
