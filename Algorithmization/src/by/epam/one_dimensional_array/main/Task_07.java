package by.epam.one_dimensional_array.main;

/* Даны действительные числа (a₁,a₂,...,aₙ).
 	Найти max(a₁ + a₂ₙ, a₂ + a₂ₙ₋₁,...  aₙ + aₙ₊₁)*/

public class Task_07 {

	

	public static void main(String[] args) {
		int size;
		size = Input.enterInt("Введите размер массива: ");
		
		int[] mass = new int[size];
		int[] maxNumber = new int[mass.length];

		Input.initArray(mass);

		for (int i = 0, j = mass.length - 1; i < j; i++, j--) {

			maxNumber[i] = mass[i] + mass[j];

		}
		System.out.println();

		maxNum(maxNumber);

	}
	
	public static void maxNum(int[] mass) {

		int max;
		max = mass[0];
		for (int i = 1; i < mass.length; i++) {
			if (mass[i] > max) {
				max = mass[i];
			}

		}

		System.out.println(max);
	}

}
