package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task_11 {

	public static void main(String[] args) {

		int x = Input.enterInt("Введите x: ");
		int y = Input.enterInt("Введите y: ");

		compare(x, y);

	}

	static int lengthOfNumber(int a) {
		int count = 0;
		while (a != 0) {

			count++;
			a /= 10;
		}
		return count;

	}

	static void compare(int a, int b) {
		if (lengthOfNumber(a) > lengthOfNumber(b)) {
			System.out.println("первое число длинее");
		} else {
			System.out.println("второе число длинее");
		}

	}
}
