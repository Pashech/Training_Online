package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
Для решения задачи использовать декомпозицию.*/

public class Task_13 {

	public static void main(String[] args) {
		int number;
		number = Input.enterInt("Введите число: ");
		
		twins(number);
	}

	static void twins(int n) {
		for (int i = n; i <= n * 2; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.println(i + " и " + (i + 2));
			}
		}
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
