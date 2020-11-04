package by.epam.multidimensional_array.main;

/*Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.*/

public class Task_11 {

	public static void main(String[] args) {

		int[][] mass = new int[10][20];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 16);
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		int num = 5;

		for (int i = 0; i < mass.length; i++) {

			int count = 0;
			for (int j = 0; j < mass[i].length; j++) {
				if (mass[i][j] == num) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.println("Строка " + (i + 1));
			}
		}

	}

}
