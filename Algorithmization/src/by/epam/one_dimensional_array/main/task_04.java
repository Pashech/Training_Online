package by.epam.one_dimensional_array.main;

// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

public class task_04 {

	public static void main(String[] args) {
		int size;
		
		size = Input.enterInt("Введите размер массива: ");
		
		int[] mass = new int[size];
		
		Input.initArray(mass);

		int indMin = 0;
		int indMax = 0;

		int min = mass[0];
		int max = mass[0];

		for (int i = 0; i < mass.length; i++) {

			if (mass[i] < min) {
				min = mass[i];
				indMin = i;
			}
			if (mass[i] > max) {
				max = mass[i];
				indMax = i;
			}

		}

		int temp = mass[indMax];
		mass[indMax] = mass[indMin];
		mass[indMin] = temp;

		System.out.println();
		System.out.println("\nthe array after replacement");

		for (int i = 0; i < mass.length; i++) {

			System.out.print(mass[i] + " ");
		}

	}

}
