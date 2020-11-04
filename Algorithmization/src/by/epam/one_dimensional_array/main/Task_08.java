package by.epam.one_dimensional_array.main;

/*Дана последовательность целых чисел (a₁,a₂,...,aₙ).
Образовать новую последовательность, выбросив из данной min(a₁,a₂,...,aₙ)*/

public class Task_08 {

	public static void main(String[] args) {

		int[] mass = { 12, 3, 56, 8, 50, 10, 16, 2, 52, 9 };
		int[] array = new int[mass.length - 1];

		int min;
		min = mass[0];

		for (int i = 1; i < mass.length; i++) {
			if (mass[i] < min) {
				min = mass[i];
			}

		}
		
		// ставим минимальное знасение в массиве на последнюю позицию
		
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == min) {
				int temp = mass[i];
				mass[i] = mass[mass.length - 1];
				mass[mass.length - 1] = temp;

			}

		}
		
		// перебираем и выводим новый массив, уже без минимального значения
		
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == min) {
				break;
			}

			array[i] = mass[i];
			System.out.print(array[i] + " ");
		}

	}

}
