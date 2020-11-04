package by.epam.one_dimensional_array.main;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.*/

public class Task_02 {

	public static void main(String[] args) {
		int z;
		int count = 0;
		int[] mass = new int[20];

		Input.initArray(mass);

		z = Input.enterInt("\nEnter z: ");

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > z) {
				mass[i] = z;
				count++;
			}

		}

		for (int m : mass) {
			System.out.print(m + " ");

		}
		System.out.println("\nnumber of replacements = " + count);

	}

}
