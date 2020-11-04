package by.epam.multidimensional_array.main;

/*Магическим квадратом порядка n называется квадратная матрица n*n составленная из чисел 1,2,3,...,n², так,
что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.*/

public class Task_16 {

	public static void main(String[] args) {

		int[][] mass = new int[4][4];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = (i * 4 + 1 + j);

			}

		}
		System.out.println();

		for (int i = 0; i < mass.length / 2; i++) {
			int temp = mass[mass.length - i - 1][mass.length - i - 1];
			mass[mass.length - i - 1][mass.length - i - 1] = mass[i][i];
			mass[i][i] = temp;
		}

		for (int i = 0; i < mass.length / 2; i++) {
			int temp = mass[mass.length - i - 1][i];
			mass[mass.length - i - 1][i] = mass[i][mass.length - i - 1];
			mass[i][mass.length - i - 1] = temp;
		}
		System.out.println("Магический квадрат: ");
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {

				System.out.print(mass[i][j] + " \t");
			}
			System.out.println();
		}

	}

}
