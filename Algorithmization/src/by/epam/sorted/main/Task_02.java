package by.epam.sorted.main;

import java.util.Arrays;

/*Даны две последовательности a1<a2<...<an и b1<b2<...<bn. Образовать из них новую последовательность
* чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.*/

public class Task_02 {

	public static void main(String[] args) {

		int[] mass = { 1, 2, 5, 7, 9 };
		int[] array = { 3, 4, 6, 8, 11 };

		array = Arrays.copyOf(array, mass.length + array.length);

		System.arraycopy(mass, 0, array, 5, mass.length);
		
		System.out.println("Объединенный массив: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();

		for (int i = 1; i < array.length; i++) {
			for (int j = array.length - 1; j >= i; j--) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}

			}

		}
		System.out.println("Неубывающая последовательость: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
