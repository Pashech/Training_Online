package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

/*Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.
*/
public class Task_12 {

	public static void main(String[] args) {

		int[] massive = array();
		for(int i = 1; i < massive.length; i++) {
			System.out.print(massive[i] + " ");
		}

	}

	static int[] array() {
		int[] mass = new int[10];
		int count = 0;
		int m = Input.enterInt("Введите m: ");
		int n = Input.enterInt("Введите n");
		for (int i = m; i < n; i++) {
			if (sum(i) == m) {
				count++;
				mass[count] = i;
			}
			
		}
		return mass;
	}

	static int sum(int x) {
		int sum = 0;

		while (x != 0) {

			sum = sum + x % 10;
			x /= 10;

		}
		return sum;
	}
}
