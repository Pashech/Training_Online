package by.epam.one_dimensional_array.main;

import java.util.Random;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/

@SuppressWarnings("unused")
public class Task_03 {

	

	public static void main(String[] args) {

		int n = 0;
		int countNegative = 0;
		int countPositive = 0;
		int countZero = 0;

		n = Input.enterInt("Enter size: ");
		int[] mas = new int[n];

		initArray(mas);

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] < 0) {
				countNegative++;
			} else if (mas[i] > 0) {
				countPositive++;
			} else if (mas[i] == 0) {
				countZero++;
			}

		}

		System.out.print("\nnegative = " + countNegative + " positive = " + countPositive + " zero = " + countZero);

	}
	
	public static void initArray(int[] mass) {

		if (mass == null) {
			return;
		}

		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 12 - 5);
			System.out.print(mass[i] + " ");
		}
	}

}
