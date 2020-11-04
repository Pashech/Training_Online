package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task_06 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;

		a = Input.enterInt("Введите a");
		b = Input.enterInt("Введите b");
		c = Input.enterInt("Введите c");

		isSimple(a, b, c);
	}

	static void isSimple(int a, int b, int c) {
		int min;
		int result = 0;

		min = Math.min(Math.min(a, b), c);

		for (int i = min; i > 0; i--) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				result = i;
				break;
			}
		}

		if (result == 1) {
			System.out.println("Являются взаимно простыми");
		} else {
			System.out.println("Не являются взаимно простыми");
		}
	}
}
