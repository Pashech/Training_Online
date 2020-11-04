package by.epam.decomposition.main;

import by.epam.one_dimensional_array.main.Input;

/*Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива,но больше всех других элементов).
*/
public class Task_05 {

	public static void main(String[] args) {

		int n;
		n = Input.enterInt("Введите количество элементов: ");

		int[] mass = new int[n];
		Input.initArray(mass);
		secondLarges(mass);

	}

	static void secondLarges(int[] array) {
		if (array == null) {
			return;
		}

		int temp;
		int j;
		for (int i = 0; i < array.length; i++) {
			temp = array[i];

			for (j = i - 1; j >= 0 && array[j] < temp; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}

		System.out.println("второе по величине число: " + array[1]);

	}
}
