package by.epam.multidimensional_array.main;

import java.util.Scanner;

import by.epam.one_dimensional_array.main.Input;

/*В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
*/
public class Task_08 {

	public static void main(String[] args) {

		int firstColumn;
		int secondColumn;
		int temp;
		int x;
		int y;

		x = Input.enterInt("Введите колличество строк матрицы: ");
		y = Input.enterInt("Введите колличество столбцов матрицы: ");
		int[][] mass = new int[x][y];

		firstColumn = enterInt("Введите номер первого столбца: ");
		secondColumn = enterInt("Введите номер второго столбца: ");

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (int) (Math.random() * 10);
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		for (int j = 0; j < mass.length; j++) {
			for (int i = 0; i < mass.length; i++) {
				temp = mass[i][firstColumn - 1];
				mass[i][firstColumn - 1] = mass[i][secondColumn - 1];
				mass[i][secondColumn - 1] = temp;

			}
		}
		System.out.println();

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
	}

	@SuppressWarnings("resource")
	public static int enterInt(String message) {
		int value;

		Scanner sc = new Scanner(System.in);

		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}

		value = sc.nextInt();
		return value;
	}

}
