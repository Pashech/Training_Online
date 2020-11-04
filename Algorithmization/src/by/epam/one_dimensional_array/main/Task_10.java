package by.epam.one_dimensional_array.main;

import java.util.Arrays;

/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать
*/

public class Task_10 {

	public static void main(String[] args) {

		int size;
		size = Input.enterInt("Введите размер массива: ");
		int[] mass = new int[size];

		Input.initArray(mass);
		System.out.println();

		int length = mass.length % 2 == 0 ? mass.length / 2 : mass.length / 2 + 1;

		for (int i = 1; i < length; i++) {
			mass[i] = mass[i * 2];
		}
		for (int i = length; i < mass.length; i++) {
			mass[i] = 0;
		}

		
		
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}

	}
}
