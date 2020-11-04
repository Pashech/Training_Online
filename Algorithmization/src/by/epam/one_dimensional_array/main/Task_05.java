package by.epam.one_dimensional_array.main;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task_05 {

	public static void main(String[] args) {
		
		int size;
		size = Input.enterInt("Введите размер массива: ");

		int[] mass = new int[size];

		Input.initArray(mass);
		
		System.out.println();
		System.out.println("\nthe array after replacement");
		
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > i) {
				System.out.print(mass[i] + " ");
			}
		}
	}

}
