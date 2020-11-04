package by.epam.sorted.main;

/*Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.*/

public class Task_03 {

	public static void main(String[] args) {

		int[] mass = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Изначальный массив: ");
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < mass.length; i++) {
			int pos = i;
			int max = mass[i];

			for (int j = i + 1; j < mass.length; j++) {
				if (mass[j] > max) {
					pos = j;
					max = mass[j];

				}
			}

			mass[pos] = mass[i];
			mass[i] = max;

		}
		System.out.println("Отсортированный массив по убыванию: ");
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}

	}

}
