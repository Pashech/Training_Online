package by.epam.one_dimensional_array.main;

/*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
Если таких чисел несколько, то определить наименьшее из них.*/

public class Task_09 {
	
	public static void main(String args[]) {
		
		int[] mass = new int[10];
		
		Input.initArray(mass);

		int[] popular = new int[mass.length];
		int result = mass[0];
		int popularNumber = popular[0];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length; j++) {
				if (mass[i] == mass[j]) {
					popular[i]++;

				}

			}

		}

		for (int i = 0; i < popular.length; i++) {

			if (popular[i] > popularNumber) {
				popularNumber = popular[i];
				result = mass[i];
			}

			if ((popularNumber == popular[i]) && (mass[i] < result)) {
				result = mass[i];
			}

		}
		System.out.println();
		System.out.print("The most common smallest number is: " + result);

	}

}
