package by.epam.decomposition.main;

import by.epam.multidimensional_array.main.Init;
import by.epam.one_dimensional_array.main.Input;

// Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

@SuppressWarnings("unused")
public class Task_10 {

	public static void main(String[] args) {
		int x;
		x = Input.enterInt("Enter number: ");

		int[] mass;
		mass = array(x);

		System.out.println("Элементы массива: ");
		for (int m : mass) {
			System.out.print(m + " ");
		}

	}

	static int length(int a) {

		int count = 0;

		while (a != 0) {

			a /= 10;
			count++;
		}
		return count;
	}

	static int[] array(int a) {

		int[] array = new int[length(a)];

		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = a % 10;
			a /= 10;
		}
		return array;
	}

}
